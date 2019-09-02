<%--此页面用于退货管理的首页--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>退货货架</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>
<br/>

</head>
<body>
<h2>当前位置:仓库管理 -> 退货管理 -> 货架
<%--
    <input type="submit" class="btn btn-primary" value="返回" onclick="window.open('mrbguanli.jsp')"/>
--%>
</h2>
<br/>
<br/>
    <%--  <select>
          <option name="op">1号</option>
          <option name="op">2号</option>
          <option name="op">3号</option>
          <option name="op">4号</option>
      </select>--%>
    <table class="table  table-bordered" style="text-align: center">
        <tr>

            <td>货架编号</td>
            <td>商品编号</td>
            <td>区内库存</td>
            <td>仓库编号</td>
            <td>货架</td>
            <td>操作</td>
        </tr>

        <%--遍历获取到的发货单集合fhList开始--%>
        <tr>
            <c:forEach items="${shelfList}" var="v" varStatus="vs">
            <td>${v.id}</td>
            <td>${v.goodid}</td>
            <td>${v.goodamount}</td>
                <td>${v.warehouseid}</td>
                <td>${v.shelfposition}</td>
                <td><input type="submit" class="btn btn-primary" value="加入"/></td>

        </tr>
        </c:forEach>
    </table>
</body>
</html>v
