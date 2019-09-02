

<%--此页面用于出库管理的首页--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>


    <title>出库管理</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>

    <style>

        .div1{
            /*margin-top: 20%;*/
            margin-left: 25%;
            float: left;
            text-align: center;
        }

        .div2{
            /*margin-top: 20%;*/
            margin-right: 25%;
            clear: right;
            text-align: center;
        }

    </style>

</head>


<body>


        <div style="margin-top: 20%">

            <div class="div1" onclick="window.location.href='newChuKus.jsp'">
                <img src="/img/ChuKu/newChuKus.svg" id="exampleInputEmail1"/>
                <br/>
                <label for="exampleInputEmail1">新建出库</label>
            </div>


            <div class="div2" onclick="window.location.href='<%=path%>/chuku/1/all'">
                <img src="/img/ChuKu/chuKuLieBiao.svg"/>
                <br/>
                <label for="exampleInputEmail1">出库记录</label>
            </div>

        </div>




</body>
</html>
