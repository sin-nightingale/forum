<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gamelife账号登陆</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/css.css">



</head>

<body >
<div class = "background">
    <img class="background-img" src="${pageContext.request.contextPath}/static/images/backe.jpg">
        <div class = "word-art">
            <h3 style="color: black">游戏 </h3>
            <p style="color:black;">不仅仅是游戏 </p>
        </div>

    <div class = "login-image" id="border">
        <div class="header_01">
            <h4 class="font">GameLife账号登录</h4>
        </div>
            <h1 style="color: red">${requestScope.error}</h1>
            <div class="login_">
        <form action="${pageContext.request.contextPath}/loginServlet" method="post">
            <input class="form_wrap" type="text" name="username" id="nloginname" placeholder="手机号/用户名/邮箱"><br/><br/>
            <input class="form_wrap" type="password" name="password" placeholder="登陆密码"><br/>
            <div class="login-set">
                <label class="auto-login">
                    <input type="checkbox" checked="checked" id="normal30day">
                    <span class="font_st">30天内自动登录</span>
                </label>
            </div>
            <div class="login_font">
            <input class="form_btn" id="form_btn_disabled" type="submit"  name="login" value="登陆">
            </div>
        </form>
    </div>
        <div class="regist">
            <a id="ri" href="${pageContext.request.contextPath}/pages/user/regist.jsp">免费注册</a>
        </div>
        <p class="agress-list">
            <input class="argeement-checkbox" type="checkbox" style="vertical-align: -2px;margin: 3px 3px 3px 4px">
            <span class="sp">阅读并同意GameLife </span>
            <a href="" class="serviceAgreement" target="_black">服务协议</a>
            <a href="" class="privacyPolicy" target="_black">个人信息保护政策</a>
        </p>
    </div>
</div>

</body>

</html>