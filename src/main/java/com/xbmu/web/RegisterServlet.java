package com.xbmu.web;

import com.xbmu.domin.User;
import com.xbmu.service.UserDaoService;
import com.xbmu.service.impl.UserDaoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;


public class RegisterServlet extends HttpServlet {
    UserDaoService service = new UserDaoServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取Session中的验证码
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        //删除Session中的验证码
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        User user = new User(null,username,password,email,new Date());

        System.out.println("code = "+code);
        System.out.println("token = "+token);

        if (token != null && token.equalsIgnoreCase(code)){
            int insert = service.insert(user);
            if (insert > 0){
                //注册成功
                req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
            }else {
                //注册失败
                System.out.println("注册失败");
            }

        }else {
            req.setAttribute("msg", "验证码错误！！");
            req.setAttribute("username", username);
            req.setAttribute("email", email);

            System.out.println("验证码[" + code + "]错误");
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
        }







    }
}
