

<%--此页面用于显示出库单列表--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>


    <title>新建出库</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>


</head>



<body>


        <%--打印所有订单--%>
        <h2 style="text-align: center">订单信息</h2>

        <c:forEach items="${}" var="v">

        </c:forEach>

        <button type="button" class="btn btn-primary" style="text-align: center" onclick="window.location.href='xxxx'">
            生成发货单</button>


</body>
</html>
