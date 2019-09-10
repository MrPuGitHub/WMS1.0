<%--
  Created by IntelliJ IDEA.
  User: MHJ
  Date: 2019/9/4
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>统计查询</title>
</head>
<body>
<div style="text-align: center"><img style="margin-top: 230px" src="<%=path%>/img/stat_query.jpg"/></div>
</body>
</html>
