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
        <td width="120">盘点时间</td>
        <td width="100">盘点人</td>
    </tr>
    <%--遍历获取到的发货单集合fhList开始--%>
    <tr class="text-c">
        <td width="70">1</td>
        <td width="70">仓库一号</td>
        <td width="70">3333</td>
        <td width="100">品名</td>
        <td width="100">规格型号</td>
        <td width="50">件</td>
        <td width="80">3333</td>
        <td width="80">333</td>
        <td width="80">-3</td>
        <td width="70">3</td>
        <td width="70">9</td>
        <td width="120">2019</td>
        <td width="100">喂喂喂</td>
    </tr>
</table>

<div style="text-align: center;">
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <li><a href="javascript:void(0)" aria-label="Previous" onclick="nextpage(1)"> <span
                    aria-hidden="true">首页</span>
            </a></li>

            <c:forEach items="${pageInfo.getNavigatepageNums()}" var="v">
                <c:choose>
                    <c:when test="${v==pageInfo.pageNum}">
                        <li><a href="javascript:void(0)" onclick="nextpage(${v})"
                               style="background-color: #5bc0de;">${v }</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="javascript:void(0)" onclick="nextpage(${v})">${v }</a></li>
                    </c:otherwise>
                </c:choose>
            </c:forEach>

            <li><a onclick="nextpage(${pageInfo.pages})" href="javascript:void(0)" aria-label="Next"> <span
                    aria-hidden="true">末页</span>
            </a></li>
        </ul>
    </nav>
</div>

</body>
</html>
