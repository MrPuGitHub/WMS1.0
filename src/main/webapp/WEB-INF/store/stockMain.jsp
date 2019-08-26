<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/js/jquery-1.11.0.min.js"></script>
<script src="/js/jquery.form.js"></script>

<!--semantic引入的文件-->
<script src="/js/semantic.min.js"></script>
<link rel="stylesheet" href="/css/semantic.min.css">

<!--layui引入的文件-->
<link rel="stylesheet" href="/layui/css/layui.css">
<script src="/layui/layui.js"></script>

<!--bootstrap引入的文件-->
<link rel="stylesheet" href="/bootstrap/bootstrap-theme.min.css">
<link rel="stylesheet" href="/bootstrap/bootstrap.min.css">
<script src="/bootstrap/bootstrap.min.js"></script>
<body>

<!--头部导航-->
<div class="ui inverted menu">
    <a class="item ui">
        <img src="/images/1.png" style="width: 40px;height: 40px">
    </a>
    <a class="item">
        Messages
    </a>
    <a class="item">
        Friends
    </a>
</div>

<!--侧边导航-->
<%--<div class="ui left floated vertical menu" style="height: auto">--%>

<%--    <div class="ui vertical menu">--%>
<%--        <div class="item">--%>
<%--            <div class="header">Products</div>--%>
<%--            <div class="menu">--%>
<%--                <a class="item">Enterprise</a>--%>
<%--                <a class="item">Consumer</a>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="item">--%>
<%--            <div class="header">CMS Solutions</div>--%>
<%--            <div class="menu">--%>
<%--                <a class="item">Rails</a>--%>
<%--                <a class="item">Python</a>--%>
<%--                <a class="item">PHP</a>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="item">--%>
<%--            <div class="header">Hosting</div>--%>
<%--            <div class="menu">--%>
<%--                <a class="item">Shared</a>--%>
<%--                <a class="item">Dedicated</a>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="item">--%>
<%--            <div class="header">Support</div>--%>
<%--            <div class="menu">--%>
<%--                <a class="item">E-mail Support</a>--%>
<%--                <a class="item">FAQs</a>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>


<%--<div class="ui left floating vertical menu">--%>
<%--    <div class="item">--%>
<%--        <img class="ui mini image" src="/images/1.png">--%>
<%--    </div>--%>
<%--    <a class="item">入库管理</a>--%>
<%--    <a class="item">Testimonials</a>--%>
<%--    <a class="item">Sign-in</a>--%>
<%--</div>--%>


<div class="row">
    <div class="col-md-2">

        <div class="ui left vertical menu">
            <div class="item">
                <div class="header">入库管理</div>
                <div class="menu">
                    <a class="item">新建入库</a>
                    <a class="item">入库列表</a>
                </div>
            </div>
            <div class="item">
                <div class="header">CMS Solutions</div>
                <div class="menu">
                    <a class="item">Rails</a>
                    <a class="item">Python</a>
                    <a class="item">PHP</a>
                </div>
            </div>
            <div class="item">
                <div class="header">Hosting</div>
                <div class="menu">
                    <a class="item">Shared</a>
                    <a class="item">Dedicated</a>
                </div>
            </div>
            <div class="item">
                <div class="header">Support</div>
                <div class="menu">
                    <a class="item">E-mail Support</a>
                    <a class="item">FAQs</a>
                </div>
            </div>
        </div>


    </div>
    <div class="col-md-10">.col-md-9</div>

</div>





</body>
</html>
