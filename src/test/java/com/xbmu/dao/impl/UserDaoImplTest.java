package com.xbmu.dao.impl;

import com.xbmu.web.dao.UserDao;
import com.xbmu.domin.User;
import com.xbmu.web.dao.impl.UserDaoImpl;
import org.junit.Test;

import java.util.Date;
import java.sql.SQLException;


public class UserDaoImplTest {
    UserDao dao = new UserDaoImpl();
    @Test
    public void insert() throws SQLException {
        User user = new User(null,"admin","admin","123@qq.com",new Date());
        int insert = dao.insert(user);
    }
}