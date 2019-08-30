<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>
<head>
    <link rel="stylesheet" type="text/css"
          href="<%=path%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=path%>/js/jquery-1.4.2.js"></script>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
</head>
<frameset rows="8%,*" border="1px" >
    <frame src="http://localhost:8095/top" noresize="noresize">
    <frameset cols=15%,*">
        <frame src="http://localhost:8095/menu" noresize="noresize">
        <frame name="main" src="http://localhost:8095/right" noresize="noresize">
    </frameset>
</frameset>
</html>