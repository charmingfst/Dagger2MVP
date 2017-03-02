package com.chm.mvp.presenters;

import com.chm.mvp.ui.screen_contracts.MainScreen;

import javax.inject.Inject;

/**
 * Created by ason on 2017/3/1.
 */

public class MainPresenter {

    @Inject
    public MainPresenter() {
    }

    public void OnShowPostsButtonClick(MainScreen mainScreen) {
        mainScreen.launchPostsActivity();
    }

    public void OnShowTestButtonClick(MainScreen mainScreen) {
        mainScreen.launchTestActivity();
    }
}
