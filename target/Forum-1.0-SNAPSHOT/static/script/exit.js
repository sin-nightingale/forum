var change_main="<%=change_type%>";
window.left_windows = 'on';

function onclick_reload() {
    location.reload();
}

function onclick_left_windows_control() {
    if (left_windows == 'on') {
        document.getElementById('left_box_id').style.transform = 'translateX(20px)';
        window.left_windows = 'off';
    } else {
        document.getElementById('left_box_id').style.transform = 'translateX(-250px)';
        window.left_windows = 'on';
    }
}
function change(){
    var img1=document.getElementById("iconList2")
    var img2=document.getElementById("iconList3")
    let a1=document.getElementById("jump_a1")
    let a2=document.getElementById("jump_a2")
    if (change_main==1){
        alert("登录成功");
        img1.src="${pageContext.request.contextPath}/static/images/img_10.png";
        img2.src="${pageContext.request.contextPath}/static/images/img_11.png";
        a1.href="${pageContext.request.contextPath}/pages/user/player_info.jsp"
        a2.href="${pageContext.request.contextPath}/pages/user/head.jsp"
    }

}

function out(){
    let a1=document.getElementById("jump_a1")
    let a2=document.getElementById("jump_a2")
    if (change_main==1){
        alert("登出成功");
        window.location.replace("${pageContext.request.contextPath}/pages/user/head.jsp");
    }
}