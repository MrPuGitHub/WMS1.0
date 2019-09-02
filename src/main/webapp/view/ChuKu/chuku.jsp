

<%--此页面用于显示出库单列表--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>


    <title>出库单列表</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>


</head>


<body>


    <div style="text-align: center" >

        <form action="<%=path%>/chuku/1/selAllByTiaoJian">

            <h2>当前位置:仓库管理 -> 出库管理</h2>

            出库单号<input type="text" class="form-control" style="display: inline-block; width: 150px" placeholder="请输入出库单号" name="faHuoDanHao">

            状态:
            <select class="form-control" style="display: inline-block; width: 150px" name="zhuangTai">
                <option value ="调度">测试调度</option>
                <option value ="打单">测试打单</option>
                <option value="拣货">测试拣货</option>
                <option value="复核">测试复核</option>
                <option value="包装">测试包装</option>
                <option value="交接发货">测试交接发货</option>
            </select>

            时间:<input type="date" class="form-control"  name="startTime" style="display: inline-block; width: 150px" placeholder="开始时间"/>到<input type="date" class="form-control" style="display: inline-block; width: 150px" name="endTime" placeholder="结束时间"/>

            <input type="submit" class="btn btn-primary" value="查询"/>


        </form>

        <button type="submit" class="btn btn-primary" onclick="window.location.href='<%=path%>/chuku/1/week'"/>一周内</button>
        <button type="submit" class="btn btn-primary" onclick="window.location.href='<%=path%>/chuku/1/month'"/>一月内</button>
        <button type="submit" class="btn btn-primary" onclick="window.location.href='<%=path%>/chuku/1/quarter'"/>本季度</button>

    </div>



    <table class="table  table-bordered">
        <%--表格没列的头部--%>
        <tr>
            <td>单号</td>
            <td>发货时间</td>
            <td>状态</td>
            <td>发货人</td>
            <td>操作</td>
        </tr>

        <%--遍历获取到的发货单集合chuKuDanList开始--%>

            <c:forEach items="${chuKuDanList}" var="v">

                <tr>
                    <td>${v.chukuid}</td>
                    <td>${v.outtime.getYear()+1900}年${v.outtime.getMonth()+1}月${v.outtime.getDate()}日</td>
                    <td>${v.state}</td>
                    <td>${v.userid}</td>
                    <td>
                        <button onclick="window.location.href='/view/ChuKu/ChuKuWork.jsp'" class="btn btn-primary">查看</button>
                    </td>
                </tr>

            </c:forEach>

        <%--遍历获取到的发货单集合chuKuDanList结束--%>

    </table>

        <div style="text-align: center;">

            总记录${pageInfo.total}条,共${pageInfo.pages}页,当前页${pageInfo.pageNum}
            <br/>

            <button  class="btn btn-primary" onclick="window.location.href='<%=path%>/chuku/${pageInfo.pageNum-1}/all'">上一页</button>
            <button  class="btn btn-primary"  onclick="window.location.href='<%=path%>/chuku/${pageInfo.pageNum+1}/all'">下一页</button>
            `

        </div>



</body>
</html>
