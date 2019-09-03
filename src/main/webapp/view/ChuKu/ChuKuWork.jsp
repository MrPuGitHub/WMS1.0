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


<button type="button" class="btn btn-primary" onclick="window.location.href='/scheduling/1'">调度</button>
<button type="button" class="btn btn-primary" onclick="window.location.href='/sendOrder'">打单</button>
<button type="button" class="btn btn-primary" onclick="window.location.href='pickGood.jsp'">拣货</button>
<button type="button" class="btn btn-primary" onclick="window.location.href='/checkOrder'">复核</button>
<button type="button" class="btn btn-primary" onclick="window.location.href='bz.jsp'">包装</button>
<button type="button" class="btn btn-primary" onclick="window.location.href='send.jsp'">交接发货</button>


</body>
</html>
