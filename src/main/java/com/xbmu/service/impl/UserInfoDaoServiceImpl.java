package com.xbmu.service.impl;

import com.xbmu.domin.UserInfo;
import com.xbmu.service.UserInfoDaoService;
import com.xbmu.web.dao.UserInfoDao;
import com.xbmu.web.dao.impl.UserInfoDaoImpl;

public class UserInfoDaoServiceImpl implements UserInfoDaoService {
    UserInfoDao dao = new UserInfoDaoImpl();
    @Override
    public UserInfo getUserInfo(UserInfo userInfo)  {
        return dao.getUserInfo(userInfo.getuSex(),userInfo.getuBorn(),userInfo.getuName(),userInfo.getuBirthplace(),userInfo.getuType(),userInfo.getuEmail(),userInfo.getuPlaceResidence(),userInfo.getuPersonalDescription());
    }

    @Override
    public int insert(UserInfo userInfo) {
      return dao.insert(userInfo);
    }
}
