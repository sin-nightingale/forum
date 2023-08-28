<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/4/23
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/head1.css"/>
</head>
<body>
<div class="mod">
    <div class="group">
        <div class="primary">
            <img alt=""
                 class="iconList" id="iconList1" onclick="onclick_left_windows_control()"
                 src="${pageContext.request.contextPath}/static/images/img_0.png"/>
            <img alt=""
                 class="iconText"
                 src="${pageContext.request.contextPath}/static/images//img_1.png"/>
            <select style="opacity: 0.4" id="text">
                <option class="option">主   页</option>
                <option class="option">单机论坛</option>
                <option class="option">主机论坛</option>
                <option class="option">手游论坛</option>
                <option class="option">杂谈论坛</option>
                <option class="option">视   频</option>
            </select>

        </div>

        <div class="search">
            <img src="${pageContext.request.contextPath}/static/images//img_7.png" class="search_img" alt="">
            <input type="search" class="search2">
        </div>

        <div class="side">


            <img onclick="onclick_reload()" alt=""
                 class="iconRefresh"
                 src="${pageContext.request.contextPath}/static/images//img_5.png"/>


        </div>
    </div>
</div>

</body>
</html>
