
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>


    <title>学生信息管理系统</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>

    <style>

        body{

            /*background-image: url("css/img/1.jpg");*/
            background-repeat: no-repeat;
            background-size: 100% 100%;

        }

        #divbox{
            width:400px;
            margin: 0 auto;
        }
    </style>


    <%--验证码--%>

    <style type="text/css">
        .code
        {
            /*background-image:url(code.jpg);*/
            font-family:Arial;
            font-style:italic;
            color:black;
            border:0;
            /*padding:2px 3px;*/
            /*letter-spacing:3px;*/
            font-weight:bolder;
        }
        .unchanged
        {
            border:0;
        }
    </style>
    <script language="javascript" type="text/javascript">

        var code ; //在全局 定义验证码
        function createCode()
        {
            code = "";
            var codeLength = 4;//验证码的长度
            var checkCode = document.getElementById("checkCode");
            var checkCode2 = document.getElementById("checkCode2");
            var selectChar = new Array(0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','s','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');//所有候选组成验证码的字符，当然也可以用中文的

            for(var i=0;i<codeLength;i++)
            {


                var charIndex = Math.floor(Math.random()*62);
                code +=selectChar[charIndex];


            }
            if(checkCode)
            {
                checkCode.className="code";
                checkCode.value = code;
                checkCode2.value = code;
            }

        }

        function validate ()
        {
            var inputCode = document.getElementById("input1").value;
            if(inputCode.length <=0)
            {
                alert("请输入验证码！");
            }
            else if(inputCode.toLowerCase() != code.toLowerCase())
            {
                alert("验证码输入错误！");
                createCode();//刷新验证码
            }
            else
            {
                alert("^-^ OK!");
            }

        }
        function tixing(){
            var me = document.getElementById("mes");
            me.innerHTML = "验证码不区分大小写！";
        }
        function yincang(){
            var hi = document.getElementById("mes");
            hi.innerHTML = "";
        }
    </script>




</head>
<body onload="createCode()">


<h1 style="text-align: center">用户登陆</h1>

<div id="divbox">

    <form action="<%=path %>/login" method="post">
        <div class="form-group">
            <label for="account">账号</label>
            <input type="text" class="form-control bg-primary" id="account" placeholder="请输入账号" name="username">
        </div>
        <div class="form-group">
            <label for="pwd">密码</label>
            <input type="password" class="form-control bg-primary" id="pwd" placeholder="请输入密码" name="password">
        </div>
        <div class="form-group">


            <span id="mes"></span>
            <input type="text" onclick="createCode()" readonly="readonly" id="checkCode" class="unchanged" style="width: 80px"  /><input type="button" onclick="createCode()" value="看不清！"/><br />

            <label for="input1">验证码</label>

            <input  type="text" class="form-control bg-primary"  placeholder="验证码" name="yzm" id="input1"  onfocus="tixing()" onblur="yincang()"/>

            <input type="hidden" id="checkCode2" name="realyCode" value="s">
        </div>
        <%--传递自动生成的验证码--%>
        <button type="submit" class="btn btn-primary" style="width: 400px">登陆</button>
    </form>


</div>




</body>
</html>
