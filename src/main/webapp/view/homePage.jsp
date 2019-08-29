
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>


    <title>首页</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>

    <style>

        .GuanLiMenu{
            background-color: #0000FF;
            float: left;
            width: 150px;
        }

        button{
            width: 200px;
            height: 90px;
        }

    </style>

</head>


<body>


     <h2 style="text-align: center">当前位置:仓库管理 -> 首页</h2>

     <div class="GuanLiMenu">

         <button type="button" class="btn btn-primary" onclick="window.location.href='xxxx'">出库</button>
         <button type="button" class="btn btn-primary" onclick="window.location.href='xxxxxxx'">入库</button>
         <button type="button" class="btn btn-primary" onclick="window.location.href='xxxxxxx'">移库</button>
         <button type="button" class="btn btn-primary" onclick="window.location.href='xxxxxxx'">退货</button>
         <button type="button" class="btn btn-primary" onclick="window.location.href='xxxxxxx'">盘点</button>
         <button type="button" class="btn btn-primary" onclick="window.location.href='xxxxxxx'">统计查询</button>
         <button type="button" class="btn btn-primary" onclick="window.location.href='xxxxxxx'">员工绩效统计</button>

     </div>



</body>
</html>
