package com.xbmu.util;

import com.xbmu.domin.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtils_use {
    @Test

    public void testQuerySingle() throws SQLException {
        //1. 得到 链接
        Connection connection = Jdbcutils.getConnection();

        //2 创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //执行的方法
        String sql = "select * from f_user where id = ?";
        //返回执行的单行记录
        User user = queryRunner.query(connection,sql,new BeanHandler<>(User.class),1);
        System.out.println(user);

        //释放资源
        Jdbcutils.close(null,null,connection);



    }

    public void testScalar() throws SQLException {
        //1. 得到 链接
        Connection connection = Jdbcutils.getConnection();
        //2 创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //返回单行单列

        String sql = "select username from f_user where id = ?";
        Object obj = queryRunner.query(connection,sql,new ScalarHandler(),1);
        System.out.println("username = "+obj);

        //释放资源
        Jdbcutils.close(null,null,connection);
    }
    @Test
    //完成apache=dbutils+druid完成dml(update, insert,delete)
    public void testDML() throws SQLException{
        Connection connection = Jdbcutils.getConnection();
        //2 创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //组织sql,完成update, insert,delete


        //String sql = "update f_user set username = ? where id = ?";
        //int affectedRow = queryRunner.update(connection, sql, "123456", 1);
        //System.out.println(affectedRow > 0 ?"执行成功":"执行没有影响到表");


        //String sql2 = "insert into f_user values(null,'ddasfdf','dadsawafa','12551@qq.com',current_date)";
        //int updaterow = queryRunner.update(connection, sql2);
        //System.out.println(updaterow > 0 ?"执行成功":"执行没有影响到表");


        String sql3 = "delete from f_user where id = ?";
        int affect = queryRunner.update(connection, sql3,1);
        System.out.println(affect > 0 ?"执行成功":"执行没有影响到表");
        //(1)执行dml操作是queryRunner.update()




        //释放资源
        Jdbcutils.close(null,null,connection);

    }


}

