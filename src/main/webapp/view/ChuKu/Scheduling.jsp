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
<div style="width: 50%">
    <form action="/sendOrder">
        <table class="table table-bordered ">
            <caption style="text-align: center">商品调度</caption>
            <tr>
                <td>商品编号</td>
                <td>x</td>
            </tr>
            <tr>
                <td>商品数量</td>
                <td>y</td>
            </tr>
            <tr>
                <td>
                    请选择出货仓库<br>
                    <c:forEach items="${warehouseList}" var="warehouseList">
                        <a href="/selectShelf/${warehouseList.id}">仓库:${warehouseList.id}</a><br>
                    </c:forEach>
                </td>
                <td>
                    <c:forEach items="${shelfList}" var="shelfList">
                        货架编号:${shelfList.id}数量:${shelfList.goodamount}取:
                        <input name="sNum" type="text" placeholder="请输入"><br>
                    </c:forEach>

                </td>
            </tr>
        </table>
        <input type="submit" class="btn btn-info" value="提交">
    </form>
</div>
<div>


</div>
</body>
</html>
