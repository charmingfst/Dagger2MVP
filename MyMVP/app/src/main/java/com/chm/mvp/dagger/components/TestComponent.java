package com.chm.mvp.dagger.components;

import com.chm.mvp.dagger.modules.AppModule;
import com.chm.mvp.dagger.modules.TestModule;
import com.chm.mvp.ui.activities.TestActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by ason on 2017/3/1.
 */

@Singleton
@Subcomponent(modules = {TestModule.class})
public interface TestComponent {
    void inject(TestActivity activity);
}


