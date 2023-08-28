package com.xbmu.web;

import com.xbmu.domin.UserInfo;
import com.xbmu.service.UserInfoDaoService;
import com.xbmu.service.impl.UserInfoDaoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserInfoServlet extends HttpServlet {

    UserInfoDaoService Service = new UserInfoDaoServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        String email = req.getParameter("email");
//         req.setCharacterEncoding("UTF-8");

        req.setCharacterEncoding("UTF-8");
         String uSex = req.getParameter("gender");
         String uBornYear = req.getParameter("birthyear");

         String uBornMonth = req.getParameter("birthmonth");
         String uBornDay = req.getParameter("birthday");
         String uBorn = uBornYear + "-" + uBornMonth + "-" + uBornDay;


         String uName = req.getParameter("realname");
         String uBirthplace = req.getParameter("birthprovince");
         String uType = req.getParameter("bloodtype");
         String uEmail = req.getParameter("lookingfor");
         String uPlaceResidence = req.getParameter("resideprovince");
         String uPersonalDescription = req.getParameter("affectivestatus");

//        User user = new User(null,username,password,email,new Date());

        UserInfo userInfo = new UserInfo(null,uSex,uBorn,uName,uBirthplace,uType,uEmail,uPlaceResidence,uPersonalDescription);
        int insertAffect = Service.insert(userInfo);
        System.out.println(userInfo);

        if (insertAffect > 0){
            //保存成功
            System.out.println("保存成功");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }else {
            //保存失败
            System.out.println("保存失败");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
