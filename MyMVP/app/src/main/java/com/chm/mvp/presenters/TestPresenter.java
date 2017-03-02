package com.chm.mvp.presenters;

import com.chm.mvp.model.UserAPI;
import com.chm.mvp.model.pojo.User;

import javax.inject.Inject;

/**
 * Created by ason on 2017/3/1.
 */

public class TestPresenter {

    private UserAPI userAPI;

    @Inject
    public TestPresenter(UserAPI userAPI)
    {
        this.userAPI = userAPI;
    }

    public String supplyData()
    {
        User user = userAPI.getUser();
        return "hello "+ user.getName()+ ", age is "+ user.getAge();
    }
}
