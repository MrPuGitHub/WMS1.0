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
<body>
<div style="text-align: center;padding-top: 350px">
<a href="http://localhost:8095/selAllempandwork/1" target="main"><img  src="<%=path%>/img/yuangong.jpg"style="height: 200px;background-color:#269abc"  class="img-circle"></a>
</div>
</body>
</html>