package com.xbmu.service;

import com.xbmu.domin.Comment;

public interface CommentDaoService {

;
    public Comment getComment(Comment comment);
    int insert(Comment comment) ;
}
