<%--
  Created by IntelliJ IDEA.form_btn_disabled
  User: 程欢
  Date: 2022/4/23
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>GameLife账号注册</title>
    <link rel="stylesheet" type="text/css" href=${pageContext.request.contextPath}/static/css/css.css>
    <script type="text/javascript" src="../../static/script/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        // 页面加载完成之后
        $(function () {


            $("#code_img_refresh").click(function (){

                this.src = "${basePath}http://localhost:8080/Forum_war_exploded/kaptcha.jpg";
            });


            // 给注册绑定单击事件
            $("#form_btn_disabled").click(function () {
                // 验证用户名：必须由字母，数字下划线组成，并且长度为5到12位
                //1 获取用户名输入框里的内容
                var usernameText = $("#username").val();
                //2 创建正则表达式对象
                var usernamePatt = /^\w{5,12}$/;
                //3 使用test方法验证
                if (!usernamePatt.test(usernameText)) {
                    //4 提示用户结果
                    $("span.errorMsg").text("用户名不合法！");

                    return false;
                }

                // 验证密码：必须由字母，数字下划线组成，并且长度为5到12位
                //1 获取用户名输入框里的内容
                var passwordText = $("#password").val();
                //2 创建正则表达式对象
                var passwordPatt = /^\w{5,12}$/;
                //3 使用test方法验证
                if (!passwordPatt.test(passwordText)) {
                    //4 提示用户结果
                    $("span.errorMsg").text("密码不合法！");

                    return false;
                }
                // 验证确认密码：和密码相同
                //1 获取确认密码内容
                var repwdText = $("#repwd").val();
                //2 和密码相比较
                if (repwdText != passwordText) {
                    //3 提示用户
                    $("span.errorMsg").text("确认密码和密码不一致！");
                    return false;
                }

                // 邮箱验证：xxxxx@xxx.com
                //1 获取邮箱里的内容
                var emailText = $("#email").val();
                //2 创建正则表达式对象
                var emailPatt = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
                //3 使用test方法验证是否合法
                if (!emailPatt.test(emailText)) {
                    //4 提示用户
                    $("span.errorMsg").text("邮箱格式不合法！");

                    return false;
                }

                // 验证码：现在只需要验证用户已输入。因为还没讲到服务器。验证码生成。
                var codeText = $("#code").val();

                //去掉验证码前后空格
                // alert("去空格前：["+codeText+"]")
                codeText = $.trim(codeText);
                // alert("去空格后：["+codeText+"]")

                if (codeText == null || codeText == "") {
                    //4 提示用户
                    $("span.errorMsg").text("验证码不能为空！");

                    return false;
                }
                // 去掉错误信息
                $("span.errorMsg").text("");

            });

        });
    </script>

    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%--<%@ include file="/pages/common/head.jsp"%>--%>


</head>
<body style="overflow:hidden;display: block;">
<div class="re_background">



    <div class="form" id="border">


        <div class="header_01">
            <h4 class="font" style="color: #cccccc">GameLife账号注册</h4>
            <span class="errorMsg">
                ${ requestScope.msg }
            </span>
        </div>



        <form action="${pageContext.request.contextPath}/registerServlet" method="post">
            <input type="hidden" name="action" value="regist">
            <label style="color: #cccccc">户昵用称&nbsp;</label>
            <input class="form_wrap" type="text" placeholder="请输入用户名"
                   value="${requestScope.username}"
                   autocomplete="off" tabindex="1" name="username" id="username" />
            <br />
            <br />
            <label style="color: #cccccc">用户密码&nbsp;</label>
            <input class="form_wrap" type="password" placeholder="请输入密码"
                   autocomplete="off" tabindex="1" name="password" id="password" />
            <br />
            <br />
            <label style="color: #cccccc">确认密码&nbsp;</label>
            <input class="form_wrap" type="password" placeholder="确认密码"
                   autocomplete="off" tabindex="1" name="repwd" id="repwd" />
            <br />
            <br />
            <label style="color: #cccccc">电子邮件&nbsp;</label>
            <input class="form_wrap" type="text" placeholder="请输入邮箱地址"
                   value="${requestScope.email}"
                   autocomplete="off" tabindex="1" name="email" id="email" />
            <br />
            <br />
            <label style="color: #cccccc">&nbsp;&nbsp;&nbsp;验证码&nbsp;</label>
            <input class="form_wrap" type="text" name="code" style="width: 110px" id="code" />
            <img id="code_img_refresh" alt="" src="http://localhost:8080/Forum_war_exploded/kaptcha.jpg" style="width: 100px;float: initial;margin-right: 30px;">
            <br />
            <br />
            <div class="login_font" style="margin-left: 105px ">
                <input class="form_btn" id="form_btn_disabled" type="submit" name="login" style="width: 200px " value="注册">
            </div>

        </form>

    </div>




<%--    静态包含页脚内容--%>



</div>

</body>
</html>