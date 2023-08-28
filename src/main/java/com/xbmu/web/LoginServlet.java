package com.xbmu.web;

import com.xbmu.domin.User;
import com.xbmu.service.UserDaoService;
import com.xbmu.service.impl.UserDaoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
    UserDaoService service = new UserDaoServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = service.getUser(new User(null, username, password, null,null));
        if (user == null){
            //数据库没有这个人
            System.out.println("没有这个人！");
        }else{
            //有这个人
            req.setCharacterEncoding("utf-8");
            req.setAttribute("login_in","login");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }
}