<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css"
      href="<%=path%>/css/bootstrap.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.4.2.js"></script>
<html>

<script type="text/javascript">
$("#tuichu")(function ( ) {

    if(confirm("您确定退出吗系统?")){
        parent.window.location="<%=path%>/login"
    }
});

</script>


<head>
<body style="background-color:rgb(74,73,70)">

<div style="width:100%; height:100%">
    <div style="width:80%; float:left;padding-top: 20px"><p style="color: white;font-size: 25px;">
        <img src="<%=path%>/img/canku.jpg"style="height: 45px;">仓库管理系统</p></div>
    <div style="width:20%; float:right;padding-top: 20px"><span style="color: white;font-size: 25px;">欢迎${name}登陆</span> &nbsp;&nbsp;&nbsp;<a href="<%=path%>/login" onclick=top.location.replace("login") style="color: white;font-size: 25px;">退出</a></div>
</div>
</body>
</html>