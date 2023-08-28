package com.xbmu.web.dao;

import com.xbmu.domin.User;

public interface  UserDao {
    User getUser(String username, String password) ;
    int insert(User user) ;


//    public User queryUserByUsername(String username);

}
