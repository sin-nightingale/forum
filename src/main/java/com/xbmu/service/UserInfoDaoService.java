package com.xbmu.service;

import com.xbmu.domin.UserInfo;

public interface UserInfoDaoService {
    public UserInfo getUserInfo(UserInfo userInfo);
    int insert(UserInfo userInfo) ;
}
