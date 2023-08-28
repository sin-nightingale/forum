package com.xbmu.web.dao.impl;

import com.xbmu.web.dao.UserDao;
import com.xbmu.domin.User;
import com.xbmu.util.Jdbcutils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDaoImpl extends BaseDao implements UserDao {

    QueryRunner runner = new QueryRunner();
    @Override
    public User getUser(String username, String password) {
        String sql = "select * from f_user  where `username` = ? and `password` = ? ";
        Connection connection = Jdbcutils.getConnection();
        try {
            runner.query(connection,sql, new BeanHandler<>(User.class), username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return queryForOne(User.class, sql, username,password);
    }

    @Override
    public int insert(User user)  {
        String sql = "insert into f_user values(?,?,?,?,?)";
        Connection connection = Jdbcutils.getConnection();
        int num = -1;
        try {
            num = runner.update(connection,sql, user.getId(),user.getUsername(), user.getPassword(),user.getEmail(),user.getDate());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (num > 0){
            return num;
        }else{
            return -1;
        }
    }

}
