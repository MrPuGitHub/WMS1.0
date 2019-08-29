<%--此页面用于退货管理的首页--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>退货管理</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>
    <style>

        .div1{
            /*margin-top: 20%;*/
            margin-left: 45%;
            float: left;
            text-align: center;
        }
    </style>
</head>
<body>
<div style="margin-top: 20%">
    <div class="div1" href="" onclick="window.open('mrblist.jsp')">
        <img src="/img/tuihuo.png" id="exampleInputEmail1"/>
        <br/>
        <label for="exampleInputEmail1"><h2>退货管理</h2></label>
    </div>

</div>


</body>
</html>
