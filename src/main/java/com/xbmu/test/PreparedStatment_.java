package com.xbmu.test;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class PreparedStatment_ {
    public static void main(String[] args) throws Exception{
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
        Properties pros = new Properties();
        pros.load(is);
        Scanner sc = new Scanner(System.in);
        System.out.print("输入管理员的用户名称:");
        String admin_name = sc.nextLine();
        System.out.print("输入管理员的用户密码：");
        String admin_pwd = sc.nextLine();



        String username = pros.getProperty("username");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClassName");
        Class.forName(driverClass);
        Connection coon = DriverManager.getConnection(url,username,password);
        //得到Preparedstatement

        String sql = "select username,password from f_user where username = ? and password = ?";
        //preparedstatement 对象实现了Preparedstatement 接口的实现类的对象
        PreparedStatement preparedStatement = coon.prepareStatement(sql);
        //给？ 赋值
        preparedStatement.setString(1,admin_name);
        preparedStatement.setString(2,admin_pwd);
        //执行select 语句使用executeQuery
        //  如果执行的是dml(update,insert,delete) executeUpdate()
        //  这里执行语句使用executeQuery，不要在写sql
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }

        resultSet.close();
        coon.close();
        preparedStatement.close();

    }
}
