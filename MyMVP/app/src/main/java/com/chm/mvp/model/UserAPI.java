package com.chm.mvp.model;

import com.chm.mvp.model.pojo.User;

/**
 * Created by ason on 2017/3/1.
 */

public class UserAPI {

    public User getUser()
    {
        User user = new User();
        user.setName("zhangsan");
        user.setAge(26);
        return user;
    }

}
