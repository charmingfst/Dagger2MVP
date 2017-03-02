package com.chm.mvp.dagger.components;


import com.chm.mvp.dagger.modules.TestModule;
import com.chm.mvp.ui.activities.MainActivity;
import com.chm.mvp.ui.activities.PostsActivity;

import javax.inject.Singleton;

import dagger.Component;


/**
 * 一个类要想是Component，必须用Component注解来标注该类，并且该类是接口或抽象类。
 * Component需要引用到目标类的实例，Component会查找目标类中用Inject注解标注的属性，
 * 查找到相应的属性后会接着查找该属性对应的用Inject标注的构造函数（这时候就发生联系了）。
 *
 * Module是一个提供类实例的类，所以Module应该是属于Component的实例端的（连接各种目标类依赖实例的端），
 * Component的另一个职责就是管理好Module，Component中的modules属性可以把Module加入Component，modules可以加入多个Module。
 */
@Component(modules = {com.chm.mvp.dagger.modules.AppModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity activity);
    void inject(PostsActivity activity);
    TestComponent addSub(TestModule TestModule);
}
/**
 * 创建类实例有2个维度可以创建：
 *  通过用Inject注解标注的构造函数来创建（以下简称Inject维度）
 *  通过工厂模式的Module来创建（以下简称Module维度）
 * 这2个维度是有优先级之分的，Component会首先从Module维度中查找类实例，若找到就用Module维度创建类实例，并停止查找Inject维度。
 * 否则才是从Inject维度查找类实例。所以创建类实例级别Module维度要高于Inject维度
 */
