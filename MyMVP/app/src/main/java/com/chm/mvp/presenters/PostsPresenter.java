package com.chm.mvp.presenters;


import com.chm.mvp.events.ErrorEvent;
import com.chm.mvp.events.NewPostsEvent;
import com.chm.mvp.model.PostsAPI;
import com.chm.mvp.model.pojo.Post;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;
import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class PostsPresenter {
    PostsAPI postsAPI;

    @Inject
    public PostsPresenter( PostsAPI postsAPI) {
        this.postsAPI = postsAPI;
    }

    public void loadPostsFromAPI() {
        postsAPI.getPostsObservable().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers
                .mainThread())
                .subscribe(new Subscriber<List<Post>>() {
                    @Override
                    public void onNext(List<Post> newPosts) {
                        EventBus.getDefault().post(new NewPostsEvent(newPosts));
                    }

                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        EventBus.getDefault().post(new ErrorEvent());
                    }

                });
    }

}
