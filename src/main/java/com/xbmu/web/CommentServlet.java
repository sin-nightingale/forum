package com.xbmu.web;

import com.xbmu.domin.Comment;
import com.xbmu.service.CommentDaoService;
import com.xbmu.service.impl.CommentDaoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

public class CommentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CommentDaoService service = new CommentDaoServiceImpl();
        HttpSession httpSession = req.getSession();

        String comment_ = req.getParameter("area");


        Comment comment = new Comment(null,comment_,new Date(),null);
        int insert = service.insert(comment);
        if (insert > 0){
            //评论成功
            System.out.println("评论成功");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }else {
            //评论失败
            System.out.println("评论失败");
        }
    }


}
