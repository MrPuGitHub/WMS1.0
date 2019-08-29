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
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style type="text/css">


        html{
            height: 100%;
            width: 100%;
        }

        body{
            width: 100%;
            height:100%;
            background-image: url("<%=path%>/img/c.jpg");
            background-size: 100%,100%;
            background-repeat: no-repeat;
        }

    </style>


</head>
<body>
<h1 style="text-align: center">欢迎使用仓库管理系统</h1>
</body>
</html>