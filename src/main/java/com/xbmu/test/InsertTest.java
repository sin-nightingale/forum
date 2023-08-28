package com.xbmu.test;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class InsertTest {
    public static void main(String[] args) throws Exception{
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
        Properties pros = new Properties();
        pros.load(is);
        Scanner sc = new Scanner(System.in);
        System.out.print("输入管理员的用户名称:");
        String admin_name = sc.nextLine();
        System.out.print("输入管理员新的用户密码：");
        String admin_pwd = sc.nextLine();



        String username = pros.getProperty("username");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClassName");
        Class.forName(driverClass);
        Connection coon = DriverManager.getConnection(url,username,password);
        //得到statement
        String sql = "update f_user set password = ? where `username` = ?";
        PreparedStatement preparedStatement = coon.prepareStatement(sql);

        preparedStatement.setString(1,admin_pwd);
        preparedStatement.setString(2,admin_name);
        int rows = preparedStatement.executeUpdate();
        System.out.println(rows > 0 ? "执行成功": "执行失败");

        coon.close();
        preparedStatement.close();


    }
}
