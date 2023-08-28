package com.xbmu.service.impl;

import com.xbmu.web.dao.UserDao;
import com.xbmu.web.dao.impl.UserDaoImpl;
import com.xbmu.domin.User;
import com.xbmu.service.UserDaoService;

public class UserDaoServiceImpl implements UserDaoService {
    UserDao dao = new UserDaoImpl();
    @Override
    public User getUser(User user)  {
        return dao.getUser(user.getUsername(), user.getPassword());
    }

    @Override
    public int insert(User user) {
      return dao.insert(user);
    }
}
