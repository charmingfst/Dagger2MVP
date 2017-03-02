package com.chm.mvp.dagger.modules;


import com.chm.mvp.model.PostsAPI;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Module其实是一个简单工厂模式，Module里面的方法基本都是创建类实例的方法
 */
@Module
public class AppModule {

    /**
     * Module中的创建类实例方法用Provides进行标注，Component在搜索到目标类中用Inject注解标注的属性后，
     * Component就会去Module中去查找用Provides标注的对应的创建类实例方法
     * @return
     */
    @Provides
    @Singleton
    PostsAPI providePostsApi() {
        return new PostsAPI();
    }

}
