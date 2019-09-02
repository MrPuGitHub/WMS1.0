<%--此页面用于显示盘点界面--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>


    <title>盘点</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>

</head>


<body>


<div style="text-align: center">

    <form action="<%=path%>/view/PanDian/pandiandan.jsp">
        <%--头部--%>
        <h2>
            <nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 当前位置:
                <span class="c-gray en">&gt;&gt;</span> 仓库管理
                <span class="c-gray en">&gt;&gt;</span> 盘点管理
                <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                   href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont">刷新</i></a>
            </nav>
        </h2>


        <%--查询部分--%>
        <div>
            日期范围:<input type="date" class="form-control" id="datemin" style="display: inline-block; width: 150px"
                        placeholder="开始时间"/>&nbsp;--&nbsp;
            <input type="date" class="form-control" id="datemax" style="display: inline-block; width: 150px"
                   placeholder="结束时间"/>&nbsp;&nbsp;
            盘点单号:<input type="text" class="form-control" style="display: inline-block; width: 150px"
                        placeholder="请输入盘点单号">
            <input type="submit" class="btn btn-primary" value="查询"/>
        </div>

    </form>
    <div>
        <input type="submit" class="btn btn-primary" value="生成盘点单"  onclick="window.location.href='<%=path%>/warehouse'"/>
    </div>
    <%--表格部分--%>
    <table class="table  table-bordered" style="align-content: center">
        <tr class="text-c">
            <td width="25">
                <input type="checkbox">
            </td>
            <td>序号</td>
            <td>盘点单</td>
            <td>盘点人</td>
            <td>盘点时间</td>
            <td>操作</td>
        </tr>
        <%--遍历--%>
<c:forEach items="${panDianList}" var="v" varStatus="vs">
        <tr>
            <td><input type="checkbox"/></td>
            <td>${vs.count}</td>
            <td>${v.id}</td>
            <td>${v.pdrname}</td>
            <td>${v.padtime}</td>
            <td><input type="submit" class="btn btn-primary" value="查看"
                       onclick="window.location.href='<%=path%>/panyinpankui/1'"/>
            </td>
        </tr>
</c:forEach>
    </table>


    <%--分页--%>
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
