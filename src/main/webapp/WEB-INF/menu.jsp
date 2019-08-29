<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css"
      href="<%=path%>/css/bootstrap.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.4.2.js"></script>
<html>
<head>


<body style="background-color:rgb(235,240,254) ">
<div style="padding-top: 35px">
<h2 style="margin-left: 25px">出入</h2>
<h3 style="text-align: center"><a href="https://www.baidu.com/" target="main"> <img src="<%=path%>/img/chuku.jpg"style="height: 35px;">出库管理</a></h3>
<h3 style="text-align: center"><a href="#" target="main"><img src="<%=path%>/img/ruku.jpg"style="height: 35px;">入库管理</a></h3>
<h3 style="text-align: center"><a href="#" target="main"><img src="<%=path%>/img/yiku.jpg"style="height: 35px;">移库管理</a></h3>
<h2 style="margin-left: 25px">货物</h2>
<h3 style="text-align: center"><a href="#" target="main"><img src="<%=path%>/img/tuihuo.jpg"style="height: 35px;">退货管理</a></h3>
<h2 style="margin-left: 25px">管理</h2>
<h3 style="text-align: center"><a href="#" target="main"><img src="<%=path%>/img/pandian.jpg"style="height: 35px;">盘点</a></h3>
<h3 style="text-align: center"><a href="#" target="main"><img src="<%=path%>/img/tongji.jpg"style="height: 35px;">统计查询</a></h3>
<h3 style="text-align: center"><a href="#" target="main"><img src="<%=path%>/img/yuangong.jpg"style="height: 35px;">员工绩效统计</a></h3>
</div>
</body>
</html>