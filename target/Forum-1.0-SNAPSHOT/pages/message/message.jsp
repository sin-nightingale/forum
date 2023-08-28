<%--
  Created by IntelliJ IDEA.
  User: 程欢
  Date: 2022/6/6
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言板</title>
    <link type="text/css" href="${pageContext.request.contextPath}/static/css/message.css" rel="stylesheet">
</head>
<body>
<div class="main_box">
  <div class="box">
    <div class="title">留言板</div>
    <form class="submit_box" action="${pageContext.request.contextPath}/commentServlet" method="post">
      <div class="user_name">
        <%
          String name = (String) session.getAttribute("name");
        %>
      </div>
      <div class="area_box">
        <textarea rows="5" cols="40" placeholder="&emsp;发表新鲜事儿......" name="area" class="area"></textarea>
      </div>
      <button class="submit" >发表</button>
    </form>
    </div>
</div>
</body>
</html>
