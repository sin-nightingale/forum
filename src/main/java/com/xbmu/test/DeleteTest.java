package com.xbmu.test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class DeleteTest {
    public static void main(String[] args) throws  Exception{
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
        Properties pros = new Properties();

        pros.load(is);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除的用户名称：");
        String admin_user = scanner.nextLine();


        String username = pros.getProperty("username");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClassName");
        Class.forName(driverClass);

        Connection coon = DriverManager.getConnection(url,username,password);
        String sql = "delete from f_user where username = ?";

        PreparedStatement preparedStatement = coon.prepareStatement(sql);

        preparedStatement.setString(1,admin_user);
        int rows = preparedStatement.executeUpdate();
        System.out.println(rows > 0 ?"执行成功":"执行失败 ");
    }
}
