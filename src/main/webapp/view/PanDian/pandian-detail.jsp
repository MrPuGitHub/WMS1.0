<%--此页面用于显示盘点界面--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>

<html>

<head>
    <title>盘点单明细</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>
</head>


<body>
<div style="text-align: center">

    <form>

        <h2>
            <nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 当前位置:
                <span class="c-gray en">&gt;&gt;</span> 仓库管理
                <span class="c-gray en">&gt;&gt;</span> 盘点管理
                <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                   onclick="$('#main-content').jqprint()" title="打印">打印</a>
                <input type="submit" class="btn btn-primary" value="返回" onclick="window.open('pandian.jsp')"/>

            </nav>
        </h2>
        <div class="text-c">
            盘点单：<span id="code"></span>
        </div>
    </form>
</div>
<table id="ck-table" class="table table-border table-bordered table-bg">
    <tr class="text-c">
        <td width="70">序号</td>
        <td width="70">仓库名</td>
        <td width="70">货架号</td>
        <td width="70">产品编号</td>
        <td width="100">品名</td>
        <td width="50">单位</td>
        <td width="80">账面数量</td>
        <td width="80">盘点数量</td>
        <td width="80">盈亏数量</td>
        <td width="70">单价</td>
        <td width="70">盈亏金额</td>
    </tr>
    <%--遍历获取到的发货单集合fhList开始--%>
    <c:forEach items="${panyinpankuiList}" var="v" varStatus="vs">
        <tr class="text-c">
            <td width="10">${vs.count}</td>
            <td width="70">${v.warehouseName}</td>
            <td width="70">${v.shelfposition}</td>
            <td width="100">${v.goodid}</td>
            <td width="100">${v.goodname}</td>
            <td width="50">${v.unit}</td>
            <td width="80">${v.zmsl}</td>
            <td width="80">${v.pdsl}</td>
            <td width="80">${v.yksl}</td>
            <td width="70">${v.price}</td>
            <td width="70">${v.ykje}</td>
        </tr>
    </c:forEach>
</table>

<div style="text-align: center;">
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <li><a href="javascript:void(0)" aria-label="Previous" onclick="window.location.href='<%=path%>/panyinpankui/1'"> <span
                    aria-hidden="true">首页</span>
            </a></li>

            <c:forEach items="${pageInfo.getNavigatepageNums()}" var="v">
                <c:choose>
                    <c:when test="${v==pageInfo.pageNum}">
                        <li><a href="" onclick="window.location.href='<%=path%>/panyinpankui/${v}'"
                               style="background-color: #5bc0de;">${v }</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="javascript:void(0)" onclick="window.location.href='<%=path%>/panyinpankui/${v}'">${v }</a></li>
                    </c:otherwise>
                </c:choose>
            </c:forEach>

            <li><a onclick="window.location.href='<%=path%>/panyinpankui/${pageInfo.pages}'" href="javascript:void(0)" aria-label="Next"> <span
                    aria-hidden="true">末页</span>
            </a></li>
        </ul>
    </nav>
</div>

</body>
</html>
