package com.xbmu.web.dao;

import com.xbmu.domin.UserInfo;

public interface UserInfoDao {


    UserInfo getUserInfo(String uSex, String uBorn, String uName, String uBirthplace, String uType, String uEmail, String uPlaceResidence, String uPersonalDescription);
    int insert(UserInfo userInfo) ;


}
