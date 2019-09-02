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
    <form action="view/ChuKu/pickGood.jsp">

        <table class="table table-bordered ">
            <caption>发货单</caption>
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
                <td>${sendorder.sendorderid}</td>
                <td>${sendorder.username}</td>
                <td>${sendorder.useraddress}</td>
                <td>${sendorder.telnum}</td>
                <td>${sendorder.goodid}</td>
                <td>${sendorder.goodnum}</td>
                <td>${sendorder.sendname}</td>
                <td>${sendorder.sendcom}</td>
                <td>${sendorder.comaddress}</td>
            </tr>


        </table>
        <input type="submit" class="btn btn-info" value="打印">
    </form>


    <form action="/sendOrder">

        <table class="table table-bordered ">
            <caption>物流单</caption>
            <tr>
                <td>${warehouseList.id}</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td>5</td>
                <td>6</td>
                <td>7</td>
                <td>8</td>
            </tr>
            <tr>
                <td>1</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td>5</td>
                <td>6</td>
                <td>7</td>
                <td>8</td>

            </tr>


        </table>
        <input type="button" class="btn btn-info" value="打印">
    </form>

</div>
<div>


</div>
</body>
</html>
