<%--此页面操作出库的具体流程--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>出库工作进行中</title>
    <link rel="stylesheet" href="<%=path%>/css/bootstrap.css">
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
<div style="width: 70%">
    <form action="view/ChuKu/bz.jsp">

        <%--<table class="table table-bordered ">--%>
            <%--<caption class="text-danger">请核对出库信息</caption>--%>
            <%--<tr>--%>
                <%--<td>商品编号</td>--%>
                <%--<td>商品数量</td>--%>
                <%--<td>出货仓库</td>--%>
                <%--<td>出货货架</td>--%>

            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>x</td>--%>
                <%--<td>x</td>--%>
                <%--<td><c:forEach items="${warehouseList}" var="warehouseList">--%>
                    <%--仓库编号:${warehouseList.id}--%>
                <%--</c:forEach></td>--%>
                <%--<td>--%>
                    <%--<c:forEach items="${getWhNum}" var="getWhNum">--%>
                        <%--仓库编号:${getWhNum.get(0)}--%>
                    <%--</c:forEach></td>--%>
            <%--</tr>--%>

        <%--</table>--%>
        <table class="table table-bordered ">
            <caption class="text-danger">请核对发货信息</caption>
            <tr>
                <td>编号</td>
                <td>收货人</td>
                <td>地址</td>
                <td>电话</td>
                <td>商品编号</td>
                <td>商品数量</td>
                <td>发货人</td>
                <td>发货单位</td>
                <td>发货地址</td>
            </tr>
            <tr>
                <td>-</td>
                <td>-</td>
                <td>-</td>
                <td>-</td>
                <td>-</td>
                <td>-</td>
                <td>-</td>
                <td>-</td>
                <td>-</td>
            </tr>
        </table>
        <%--<input type="submit" class="btn btn-info" value="修改">--%>
        <input type="submit" class="btn btn-info" value="提交">
    </form>
</div>
<div>


</div>
</body>
</html>
