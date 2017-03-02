package com.chm.mvp.events;

import com.chm.mvp.model.pojo.Post;

import java.util.List;

public class NewPostsEvent {
    List<Post> posts;

    public List<Post> getPosts() {
        return posts;
    }

    public NewPostsEvent(List<Post> posts) {
        this.posts = posts;
    }
}
