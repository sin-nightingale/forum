package com.xbmu.web.dao.impl;


import com.xbmu.domin.User;
import com.xbmu.domin.UserInfo;
import com.xbmu.util.Jdbcutils;
import com.xbmu.web.dao.UserInfoDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class UserInfoDaoImpl extends BaseDao implements UserInfoDao {
    QueryRunner runner = new QueryRunner();

//    @Override
//    public UserInfo getUserInfo(String uSex, String uBorn, String uName, String uBirthplace, String uType, String uEmail, String uPlaceResidence, String uPersonalDescription) {
//        return null;
//    }

    @Override
    public UserInfo getUserInfo(String uSex, String uBorn, String uName, String uBirthplace, String uType, String uEmail, String uPlaceResidence, String uPersonalDescription) {
        String sql = "select * from f_user ";
        Connection connection = Jdbcutils.getConnection();
        try {
            runner.query(connection,sql, new BeanHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return queryForOne(UserInfo.class, sql);
    }

    @Override
    public int insert(UserInfo userInfo)  {
        String sql = "insert into userinfo values(?,?,?,?,?,?,?,?,?)";
        Connection connection = Jdbcutils.getConnection();
        int num = -1;
        try {
            num = runner.update(connection,sql,userInfo.getuId(),userInfo.getuSex(),userInfo.getuBorn(),userInfo.getuName(),userInfo.getuBirthplace(),userInfo.getuType(),userInfo.getuEmail(),userInfo.getuPlaceResidence(),userInfo.getuPersonalDescription());
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
