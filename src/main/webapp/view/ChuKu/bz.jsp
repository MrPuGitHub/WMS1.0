<%--此页面操作出库的具体流程--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>出库工作进行中</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>
    <style>
        * {
            margin: 0 auto;
            text-align: center;
            font-size: 20px;
            font-family: "楷体_GB2312";
        }

        button {
            width: 200px;
            height: 90px;
        }
    </style>
</head>
<body>
<div style="text-align: center">
    <h2>当前位置:仓库管理 -> 出库管理 -> 出库进度</h2>
</div>
<hr>
<div style="height: 100px">

</div>
<div style="width: 70%">
    <h3>请在包装完成后点击···</h3>
    <div style="height: 20px">
    </div>
    <input class="btn btn-warning btn-primary" type="button" value="包装完成"
           onclick="window.location.href='send.jsp'">
</div>
<div>


</div>
</body>
</html>
