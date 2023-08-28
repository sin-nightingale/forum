package com.xbmu.service.impl;

import com.xbmu.service.CommentDaoService;
import com.xbmu.web.dao.CommentDao;
import com.xbmu.web.dao.impl.CommentDaoImpl;

public class CommentDaoServiceImpl implements CommentDaoService {

    CommentDao dao = new CommentDaoImpl();

    @Override
    public com.xbmu.domin.Comment getComment(com.xbmu.domin.Comment comment) {
        return null;
    }

    @Override
    public int insert(com.xbmu.domin.Comment comment) {
        return dao.insert(comment);
    }
}
