package com.xbmu.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbcutils {
    private static DataSource source;
    static{
        try{
            Properties pros = new Properties();
            InputStream is = Jdbcutils.class.getClassLoader().getResourceAsStream("druid.properties");
            pros.load(is);
            source = DruidDataSourceFactory.createDataSource(pros);
            System.out.println(source.getConnection());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection()  {
        Connection connection = null;
        try {
            connection = source.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //放回连接池
        return connection;
    }

    public static void close(ResultSet set, Statement statement,Connection connection){
        try {
            if (set != null){
                set.close();
            }
            if (statement != null){
                statement.close();
            }
            if (connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            //将编译异常转成运行异常报出
            throw new RuntimeException(e);

        }
    }



}
