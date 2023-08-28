package com.xbmu.service.impl;

import com.xbmu.domin.UserInfo;
import com.xbmu.service.UserInfoDaoService;
import org.junit.jupiter.api.Test;

class UserInfoDaoServiceImplTest {
    UserInfoDaoService userInfoDaoService = new UserInfoDaoServiceImpl();
    @Test
    void getUserInfo() {

    }

    @Test
    void insert() {
        userInfoDaoService.insert(new UserInfo(null,"a","b","大家大声道",null,null,null,null,null));
    }
}