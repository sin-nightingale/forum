package com.xbmu.web.dao.impl;

import com.xbmu.domin.Comment;
import com.xbmu.util.Jdbcutils;
import com.xbmu.web.dao.CommentDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class CommentDaoImpl extends BaseDao implements CommentDao {

    QueryRunner runner = new QueryRunner();
    @Override
    public Comment getComment(String c_content,Integer c_id) {
        String sql = "select * from comment ";
        Connection connection = Jdbcutils.getConnection();
        try {
            runner.query(connection,sql, new BeanHandler<>(Comment.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return queryForOne(Comment.class, sql);
    }

    @Override
    public int insert(Comment comment) {
        String sql = "insert into comment values(?,?,?,?)";
        Connection connection = Jdbcutils.getConnection();
        int num = -1;
        try {
            num = runner.update(connection,sql, comment.getC_id(),comment.getC_content(),comment.getC_time(),comment.getFloor());
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
