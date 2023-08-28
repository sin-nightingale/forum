package com.xbmu.web.dao;

import com.xbmu.domin.Comment;

public interface CommentDao {
    Comment getComment(String c_content,Integer floor);
    int insert(Comment comment);
}
