package com.chm.mvp.dagger;

import com.chm.mvp.dagger.components.AppComponent;
import com.chm.mvp.dagger.components.DaggerAppComponent;
import com.chm.mvp.dagger.modules.AppModule;

public class DaggerInjector {
    //DaggerAppComponent由系统自动生成
    private static AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();

    public static AppComponent get() {
        return appComponent;
    }
}
