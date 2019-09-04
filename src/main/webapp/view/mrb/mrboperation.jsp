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
<form class="form-horizontal" action="<%=path%>/selAllShelf/1">
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">商品编号</label>
        <div class="col-sm-5">
            <input type="text" name="goodid" class="form-control" id="inputEmail3"
                   placeholder="输入商品编号">
        </div>
        <div class="col-sm-5">
            <button type="submit" class="btn btn-default">搜索</button>

        </div>
    </div>


</form>

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
            <td>货架名称</td>
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
<%--分页--%>
<div style="text-align: center;">
<%--${pageInfo}--%>
    总记录${pageInfo.total}条,共${pageInfo.pages}页,当前页${pageInfo.pageNum}
    <br/>

    <button  class="btn btn-primary" onclick="window.location.href='<%=path%>/selAllShelf/${pageInfo.pageNum-1}'">上一页</button>
    <button  class="btn btn-primary"  onclick="window.location.href='<%=path%>/selAllShelf/${pageInfo.pageNum+1}'">下一页</button>


</div>
</body>
</html>
