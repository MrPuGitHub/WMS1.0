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
        #exampleInputEmail1{
            width: 250px;
            height: 50px;
        }

        #exampleInputPassword1{
            width: 250px;
            height: 50px;
        }

        #span{

            font-size: 20px;
        }

        html{
            height: 100%;
            width: 100%;
        }

        body{
            width: 100%;
            hegiht:100%;
            background-image:url("<%=path%>/img/a.jpg");
            background-repeat: no-repeat;
            background-size: 100%,100%;
        }

    </style>


</head>
<body>

<h1 style="text-align: center;">仓库管理系统</h1>
<hr style="border-color: black"/>
<br/>
<br/>
<br/>
<br/>
<form style="text-align: center;" action="<%=path %>/checkLogin" method="post">
    <div class="form-group">
        <label for="exampleInputEmail1"><h3>用户名：</h3></label>
        <input type="text" name="name" id="exampleInputEmail1" >
    </div>
    <div class="form-group">
        <span id="span" style="color: red">${ms}</span><br>
        <label for="exampleInputPassword1"><h3>密&nbsp&nbsp&nbsp码：</h3></label>
        <input type="password" name="password" id="exampleInputPassword1" >

    </div>
    </div>
    <button type="submit" class="btn btn-default">登陆</button>

</form>
</body>
</html>