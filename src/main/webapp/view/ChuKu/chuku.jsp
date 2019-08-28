

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


    <div style="text-align: center">

        <form>

            <h2>当前位置:仓库管理 -> 出库管理</h2>

            发货单号<input type="text" class="form-control" style="display: inline-block; width: 150px" placeholder="请输入发货单号">

            状态:
            <select class="form-control" style="display: inline-block; width: 150px">
                <option value ="调度">调度</option>
                <option value ="打单">打单</option>
                <option value="拣货">拣货</option>
                <option value="复核">复核</option>
                <option value="包装">包装</option>
                <option value="交接发货">交接发货</option>
                <option value="测试">测试</option>
            </select>

            时间:<input type="date" class="form-control" style="display: inline-block; width: 150px" placeholder="开始时间"/>到<input type="date" class="form-control" style="display: inline-block; width: 150px" placeholder="结束时间"/>

            <input type="submit" class="btn btn-primary" value="查询"/>

        </form>

    </div>



    <table class="table  table-bordered">
        <%--表格没列的头部--%>
        <tr>
            <td><input type="checkbox"/></td>
            <td>单号</td>
            <td>发货时间</td>
            <td>状态</td>
            <td>发货人</td>
            <td>操作</td>
        </tr>

        <%--遍历获取到的发货单集合fhList开始--%>
            <tr>
                <td><input type="checkbox"/></td>
                <td>111</td>
                <td>2019.9.2</td>
                <td>复核</td>
                <td>1</td>
                <td><input type="submit" class="btn btn-primary" value="查看" onclick="window.location.href='ChuKuWork.jsp'"/></td>
            </tr>
            <tr>
                <td><input type="checkbox"/></td>
                <td>111</td>
                <td>2019.9.2</td>
                <td>复核</td>
                <td>1</td>
                <td><input type="submit" class="btn btn-primary" value="查看" onclick=""/></td>
            </tr>
            <tr>
                <td><input type="checkbox"/></td>
                <td>111</td>
                <td>2019.9.2</td>
                <td>复核</td>
                <td>1</td>
                <td><input type="submit" class="btn btn-primary" value="查看" onclick=""/></td>
            </tr>
            <tr>
                <td><input type="checkbox"/></td>
                <td>111</td>
                <td>2019.9.2</td>
                <td>复核</td>
                <td>1</td>
                <td><input type="submit" class="btn btn-primary" value="查看" onclick=""/></td>
            </tr>
            <tr>
                <td><input type="checkbox"/></td>
                <td>111</td>
                <td>2019.9.2</td>
                <td>复核</td>
                <td>1</td>
                <td><input type="submit" class="btn btn-primary" value="查看" onclick=""/></td>
            </tr>
            <tr>
                <td><input type="checkbox"/></td>
                <td>111</td>
                <td>2019.9.2</td>
                <td>复核</td>
                <td>1</td>
                <td><input type="submit" class="btn btn-primary" value="查看" onclick=""/></td>
            </tr>
            <tr>
                <td><input type="checkbox"/></td>
                <td>111</td>
                <td>2019.9.2</td>
                <td>复核</td>
                <td>1</td>
                <td><input type="submit" class="btn btn-primary" value="查看" onclick=""/></td>
            </tr>
            <tr>
                <td><input type="checkbox"/></td>
                <td>111</td>
                <td>2019.9.2</td>
                <td>复核</td>
                <td>1</td>
                <td><input type="submit" class="btn btn-primary" value="查看" onclick=""/></td>
            </tr>
            <tr>
                <td><input type="checkbox"/></td>
                <td>111</td>
                <td>2019.9.2</td>
                <td>复核</td>
                <td>1</td>
                <td><input type="submit" class="btn btn-primary" value="查看" onclick=""/></td>
            </tr>
            <tr>
                <td><input type="checkbox"/></td>
                <td>111</td>
                <td>2019.9.2</td>
                <td>复核</td>
                <td>1</td>
                <td><input type="submit" class="btn btn-primary" value="查看" onclick=""/></td>
            </tr>
            <%--遍历获取到的发货单集合fhList结束--%>

    </table>



</body>
</html>
