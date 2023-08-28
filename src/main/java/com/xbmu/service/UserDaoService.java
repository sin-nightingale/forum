package com.xbmu.service;

import com.xbmu.domin.User;

public interface UserDaoService {
    public User getUser(User user);
    int insert(User user) ;
}
