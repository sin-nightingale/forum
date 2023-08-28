package com.xbmu.test;

import com.xbmu.util.Jdbcutils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class StatementTest {
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
        //得到statement
        Statement statement = coon.createStatement();
        String sql = "select username,password from f_user where username = '"
                +admin_name+"'and password = '" +admin_pwd+"'";
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            System.out.println("恭喜，登陆成功");
        }else{
            System.out.println("对不起，登陆失败");
        }
        Jdbcutils.close(resultSet,statement,coon);


    }
}
