<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<pre class="js" name="code"><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
    <link rel="stylesheet" type="text/css"
          href="<%=path%>/css/bootstrap.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.4.2.js"></script>
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>  
    <title>无标题页</title>  
    <style type="text/css">
        {
            background-image:url(<%=path%>/img/code.jpg);
            font-family:Arial;
            font-style:italic;
            color:Red;
            border:0;
            padding:2px 3px;
            letter-spacing:3px;
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
         var selectChar = new Array(0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','s','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');//所有候选组成验证码的字符，当然也可以用中文的

         for(var i=0;i<codeLength;i++)
         {


             var charIndex = Math.floor(Math.random()*62);
             code +=selectChar[charIndex];


         }
//       alert(code);  
         if(checkCode)
         {
             checkCode.className="code";
             checkCode.value = code;
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
<body οnlοad="createCode()">  
<form  action="#">
	<span id="mes"></span>
     <input  type="text"   id="input1"  οnfοcus="tixing()" οnblur="yincang()"/>  
    <input type="text" οnclick="createCode()" readonly="readonly" id="checkCode" class="unchanged" style="width: 80px"  /><input type="button" οnclick="createCode()" value="看不清！"/><br />  
    <input id="Button1"  οnclick="validate();" type="button" value="确定" />   
</form>  
</body>  
</html></pre>
