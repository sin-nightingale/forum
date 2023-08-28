package com.xbmu.test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionTest {

    public void testInsert() {

        Connection coon = null;
        PreparedStatement ps = null;

        try {
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
            Properties pros = new Properties();
            pros.load(is);

            String username = pros.getProperty("username");
            String password = pros.getProperty("password");
            String url = pros.getProperty("url");
            String driverClass = pros.getProperty("driverClassName");
            //加载驱动
            Class.forName(driverClass);
            //获取连接
            coon = DriverManager.getConnection(url,username,password);

            System.out.println(coon);


            //进行数据库操作，预编译语句
            String sql = "insert into f_user(username,password,email)values(?,?,?)";
            ps = coon.prepareStatement(sql);

            //填充占位符
            ps.setString(1,"huanzi");
            ps.setString(2,"djasl");
            ps.setString(3,"bjk@qq.com");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //执行操作
            try {
                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //资源的关闭
            try {
                if (ps != null)
                    ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (coon != null)
                    coon.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }




}

