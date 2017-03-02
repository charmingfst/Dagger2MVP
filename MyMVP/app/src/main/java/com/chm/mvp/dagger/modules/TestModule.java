package com.chm.mvp.dagger.modules;

import com.chm.mvp.model.PostsAPI;
import com.chm.mvp.model.UserAPI;
import com.chm.mvp.model.pojo.Post;
import com.chm.mvp.model.pojo.User;

import java.util.List;
import java.util.Observable;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ason on 2017/3/1.
 */
@Module
public class TestModule {


    @Provides
    public UserAPI provideTestsApi()
    {
        return new UserAPI();
    }
}
