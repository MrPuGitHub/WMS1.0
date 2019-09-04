<%--此页面用于显示盘点界面--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>


    <title>盘点</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>
    <script type="text/javascript">
        function nextpage(p) {
            document.getElementById("fm1").action = "<%=path %>/pandian" + p;
            document.getElementById("fm1").submit();
        }
    </script>
</head>


<body>


<div style="text-align: center">


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
        <table class="table" style="align-content: center">
    <tr>
        <td class="col-sm-4">
            <form id="fm1" action="<%=path%>/pandian/1" method="post">
                日期范围:<input type="date" class="form-control" id="datemin" style="display: inline-block; width: 150px"
                            placeholder="开始时间"/>&nbsp;--&nbsp;
                <input type="date" class="form-control" id="datemax" style="display: inline-block; width: 150px"
                       placeholder="结束时间"/>&nbsp;&nbsp;
                盘点单号:<input type="text" class="form-control" style="display: inline-block; width: 150px"
                            placeholder="请输入盘点单号" name="id" value="${pd.id}">
                <button type="submit" class="btn btn-primary"/>搜索</button>
            </form>
        </td >
        <td class="col-sm-2">
            <input type="submit" class="btn btn-primary" value="生成盘点单"
                   onclick="window.location.href='<%=path%>/warehouse'"/>
        </td>
    </tr>
        </table>

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
        <c:forEach items="${pandianlist}" var="v" varStatus="vs">
            <tr>
                <td><input type="checkbox"/></td>
                <td>${vs.count}</td>
                <td>${v.id}</td>
                <td>${v.pdrname}</td>
                <td>
                    <fmt:formatDate value="${v.pdtime}" type="date" pattern="yyyy年MM月dd日"/>
                </td>
                <td>
                        <%--<input type="button" class="btn btn-primary" value="查看"--%>
                        <%--onclick="window.location.href='<%=path%>/panyinpankui/${v.panyinPankuiObj}'"/>--%>
                    <button class="btn btn-primary" value="查看"
                            onclick="window.location.href='<%=path%>/panyinpankui/${v.id}'">查看
                    </button>


                </td>
            </tr>
        </c:forEach>
    </table>


    <%--分页--%>
        <div style="text-align: center;">
            <nav >
                <ul class="pagination">
                    <li>
                        <a href="<%=path%>/pandian/1" aria-label="Previous">
                            <span aria-hidden="true">首页</span>
                        </a>
                        <a href="<%=path%>/pandian/${pageinfo.pageNum-1}" aria-label="Previous">
                            <span aria-hidden="true">上一页</span>
                        </a>

                    </li>
                    <c:forEach items="${pageinfo.getNavigatepageNums() }" var="page">

                        <c:choose>
                            <c:when test="${page==pageinfo.pageNum}">
                                <li><a style="background-color: #00BFFF" href="<%=path%>/pandian/${page }">${page}</a></li>
                            </c:when>
                            <c:otherwise>
                                <li><a href="<%=path%>/pandian/${page }">${page}</a></li>
                            </c:otherwise>

                        </c:choose>

                    </c:forEach>
                    <li>
                        <a href="<%=path%>/pandian/${pageinfo.pageNum+1}" aria-label="Previous">
                            <span aria-hidden="true">下一页</span>
                        </a>
                        <a href="<%=path%>/pandian/${pageinfo.getPages() }" aria-label="Next">
                            <span aria-hidden="true">尾页</span>
                        </a>
                        <%--<td><button type="button" class="btn btn-info"--%>
                                    <%--onclick="location.href='<%=path%>/addEmp'">增加</button>--%>

                            <%--<button type="button" class="btn btn-danger">批量删除</button></td>--%>

                    </li>
                </ul>
            </nav>
        </div>
</body>
</html>
