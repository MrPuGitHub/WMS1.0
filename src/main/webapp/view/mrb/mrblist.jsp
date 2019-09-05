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
    <br/>
</head>
<body>
<h2>当前位置:仓库管理 -> 退货管理
</h2>
<br/>
<br/>
<div style="margin:0 auto;text-align: center">
    <%--
        <input type="text" class="form-control" style="display: inline-block; width: 450px" placeholder="请输入商品编号">
        <input type="submit" class="btn btn-primary" value="查询"/>--%>
</div>
<br/>
<table class="table  table-bordered" style="text-align: center">
    <tr>
        <td><input type="checkbox"/></td>

        <td>退货单编号</td>
        <td>订单编号</td>
        <td>退货时间</td>
        2<td>商品编号</td>
        <td>商品数量</td>
        1<td>经办人编号</td>
        3
        <td>退货原因</td>
        <td>操作</td>

    </tr>
    <tr>
        <td><input type="checkbox"/></td>
        <td>id</td>
        <td>orderid</td>
        <td>outtime</td>
        <td>goodid</td>
        <td>goodamount</td>
        <td>userid</td>
        <td>description</td>
        <td><input type="submit" class="btn btn-primary" onclick="window.location.href='<%=path%>/selAllShelf/1'" value="操作"/></td>
    </tr>
    <%--遍历获取到的发货单集合fhList开始--%>
    <tr>
        <c:forEach items="${Mrb}" var="v" varStatus="vs">
        <td><input type="checkbox"/></td>
        <td>${v.id}</td>
        <td>${v.orderid}</td>
            <td>${v.outtime}</td>
            <td>${v.goodid}</td>
            <td>${v.goodamount}</td>
            <td>${v.userid}</td>
            <td>${v.description}</td>

            <td><input type="submit" class="btn btn-primary" value="操作" onclick="window.location.href='<%=path%>/selAllShelf/1/${v.goodid}/${v.goodamount}'"/></td>
    </tr>
    </c:forEach>
</table>

<%--<div style="text-align: center;">

    总记录${pageInfo.total}条,共${pageInfo.pages}页,当前页${pageInfo.pageNum}
    <br/>

    <button  class="btn btn-primary" onclick="window.location.href='<%=path%>/mrblist/${pageInfo.pageNum-1}'">上一页</button>
    <button  class="btn btn-primary"  onclick="window.location.href='<%=path%>/mrblist/${pageInfo.pageNum+1}'">下一页</button>


</div>--%>
<%--
<input type="submit" class="btn btn-primary" style="margin-left:90%" value="退出" onclick="window.AbortController.href='view/shouye/login.jsp'"/>
--%>

</body>
</html>
