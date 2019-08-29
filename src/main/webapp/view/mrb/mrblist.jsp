<%--此页面用于显示退货列表--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>


    <title>退货单列表</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>
</head>

<body>
<h2>当前位置:仓库管理 -> 退货管理
    <input type="submit" class="btn btn-primary" value="返回" onclick="window.open('mrbguanli.jsp')"/>
</h2>
<br/>
<br/>
<div style="margin:0 auto;text-align: center">
    <%--<input type="text" class="form-control" style="margin-left: 400px;text-align: center; width: 450px;float: left" placeholder="ss">
    <button type="submit" class="btn btn-primary" style="margin-left: -600px;">查询</button>--%>
        <input type="text" class="form-control" style="display: inline-block; width: 450px" placeholder="请输入商品编号">
        <input type="submit" class="btn btn-primary" value="查询"/>
</div>
<br/>
<table class="table  table-bordered">

    <tr>
        <td><input type="checkbox"/></td>
        <td>退货单编号</td>
        <td>退货时间</td>
        <td>商品编号</td>
        <td>商品数量</td>
        <td>经办人编号</td>
        <td>退货原因</td>
        <td>操作</td>
    </tr>
    <tr>
        <td><input type="checkbox"/></td>
        <td>001</td>
        <td>2</td>
        <td>2019/8/29</td>
        <td></td>
        <td></td>
        <td></td>
        <td><input type="submit" class="btn btn-primary" value="操作"/></td>
    </tr>
    <%--遍历获取到的发货单集合fhList开始--%>
    <tr>
        <c:forEach items="${roleList}" var="v" varStatus="vs">
        <td><input type="checkbox"/></td>
        <td>${v.id}</td>
        <td>2</td>
        <td>2019.9.2</td>
        <td><input type="submit" class="btn btn-primary" value="操作" onclick="window.open('.jsp')"/></td>
    </tr>
    </c:forEach>
</table>
<input type="submit" class="btn btn-primary" style="margin-left:90%" value="退出"/>



</body>
</html>
