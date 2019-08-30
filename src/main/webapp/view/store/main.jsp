<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>入库管理</title>
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
<div class="ui inverted menu" style="margin-bottom: 0px">
    <a class="item ui">


        <img src="/img/store/logo.svg" style="width: 40px;height: 40px">
    </a>
    <a class="item">
        仓库管理
    </a>

    <div class="right menu">
        <a class="item ui " href="/me"><img src="/img/store/sign-up.svg" class="img-circle" style="width: 40px;height: 40px"></a>
        <a class="item" href="/exit">退出 </a>
    </div>
</div>


<div class="row" style="padding-top: 0px">
    <div class="col-md-2" style="margin-right: 0px;padding: 0px;padding-left: 10px">

        <div class="ui left vertical inverted menu" style="height: 91%;width: 542px">
            <div class="item icon">
                <div class="header">
                    入库管理</div>
                <div class="menu ">
                    <i class="paper plane"></i>
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
    <div class="col-md-10" style="padding-left: 5px">

        <!--此处为页面内容代码-->


<%--        height="300" width="500"--%>
<%--        <iframe src="/store/nav" name="storemain" scrolling="no" style="height: 91%;width: 100%;background-color: blue;" >--%>
<%--            --%>
<%--        </iframe>--%>

        <!-- 16:9 aspect ratio -->
        <div class="embed-responsive embed-responsive-16by9">
            <iframe class="embed-responsive-item" src="/store/nav" name="storemain"style="background-color: #0d71bb"></iframe>
        </div>


    </div>

</div>


</body>
</html>
