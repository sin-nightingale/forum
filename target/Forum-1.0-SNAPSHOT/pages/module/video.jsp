<%--
  Created by IntelliJ IDEA.
  User: Berlin
  Date: 2022/4/23
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>video</title>
    <link type="text/css" href="${pageContext.request.contextPath}/static/css/video.css" rel="stylesheet">
    <script>
        function myfunction()
        {
            var imgObjs = document.getElementsByTagName("img");
            document.getElementById("demo").innerHTML=imgObjs;
            for (var i = 0; i < imgObjs.length; i++) {
//注册点击事件,添加事件处理函数

                imgObjs[i].onclick = function () {

                    alert("HTML中文网");

                }
            }
        }

    </script>
</head>
<body>
       <div class="top_label">
           <img class="top_label_img" src="${pageContext.request.contextPath}/static/images/Logo.jpg">
           <div class="top_box">
               <li> 动漫</li>+
               <li> 游戏</li>
               <li> 攻略测评</li>
               <div class="vg_sear">
                   <div class="search">
                       <input class="bar" placeholder="请输入内容">
                       <img class="icon" src="${pageContext.request.contextPath}/static/images/search01.png" >
                   </div>
               </div>
           </div>
       </div>
       <div class="user_box" >
           <img class="user_img" src="${pageContext.request.contextPath}/static/images/user1.png" >
       </div>
       <div class="title_top">
           <div class="vg_tit">
               <div class="sel_tab">
                   <a >新闻资讯</a>
                   <a >专题专栏</a>
                   <a >游戏文化</a>
                   <a >玩家俱乐部</a>
               </div>
           </div>
       </div>
       <div class="video_list">
           <li>
               <div class="video_box">
                   <img class="img_box" src="${pageContext.request.contextPath}/static/images/img.png" >
                   <div class="font_box">
                   <h3>隐藏置顶帖迈向次世代，Xbox Series X|S特色功能介绍！【VG聊天室545】</h3>
                       <h6>作者</h6>
                       <h1>
                           <img src="${pageContext.request.contextPath}/static/images/VD_img_1.png">

                       </h1>
                       <h1>2021-10-10 10:10:30</h1>
                   </div>
               </div>
           </li>
           <li>
               <div class="video_box">
                   <img class="img_box" src="${pageContext.request.contextPath}/static/images/VD_img_3.png" >
                   <div class="font_box">
                       <h3>“探寻沉没之城”扩展包现已上线！【VG聊天室545】</h3>
                       <h6>作者</h6>
                       <h1>
                           <img src="${pageContext.request.contextPath}/static/images/VD_img_1.png">
                       </h1>
                       <h1>2021-10-10 10:10:30</h1>
                   </div>
               </div>
           </li>
           <li>
               <div class="video_box">
                   <img class="img_box" src="${pageContext.request.contextPath}/static/images/VD_img_4.png">
                   <div class="font_box">
                       <h3>	lol10.3版本更新 【VG聊天室545】</h3>
                       <h6>作者</h6>
                       <h1>
                           <img src="${pageContext.request.contextPath}/static/images/VD_img_1.png">
                       </h1>
                       <h1>2021-10-10 10:10:30</h1>
                   </div>
               </div>
           </li>
           <li>
               <div class="video_box">
                   <img class="img_box" src="${pageContext.request.contextPath}/static/images/VD_img_5.png" >
                   <div class="font_box">
                       <h3>一周新闻评论：该用任亏券买《异度神剑3》了！【VG聊天室545】</h3>
                       <h6>作者</h6>
                       <h1>
                           <img src="${pageContext.request.contextPath}/static/images/VD_img_1.png">
                       </h1>
                       <h1>2021-10-10 10:10:30</h1>
                   </div>
               </div>
           </li>
       </div>
       <div class="session_bar">
       </div>
       <div id="foot">
           <div id="biankuang">
               <div id="tubiao">
                   <a class="tubiao-1" href="">
                       <img class="chicun" src="${pageContext.request.contextPath}/static/images/wx_ico.png"/>
                   </a>
                   <a class="tubiao-1" href="">
                       <img class="chicun" src="${pageContext.request.contextPath}/static/images/wb_ico.png" />
                   </a>
                   <a class="tubiao-1" href="">
                       <img class="chicun" src="${pageContext.request.contextPath}/static/images/bili_ico.png" />
                   </a>
                   <a class="tubiao-1" href="">
                       <img class="chicun" src="${pageContext.request.contextPath}/static/images/Tmall_icon.png" />
                   </a>
               </div>
           </div>

           <div id="photo-6">
               <a href="" target="_blank" class="photo-5">
                   <img src="${pageContext.request.contextPath}/static/images/Logo_2.jpg" />
               </a>
           </div>
           <p class="foot-wenzi">
               沪网文（20xx）0000-0xx号 <a href="" id="lianjie-2" target="_blank" style="text-decoration: none;color:#710058">沪ICP备xxxxxxxx号</a> | 增值电信业务经
               营许可证: xx-xxxxxxxx | 互联网非法及不良信息举报电话(不提供客户服务): xxx-xxxxxxx (工作日 9:30- 18:00)
           </p>

       </div>



</body>
</html>
