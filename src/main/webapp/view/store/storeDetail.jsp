<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>入库单详情</title>
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
<script>
    var movieId=0;
    function deleteCastById(id) {
        var choice = confirm('确认要删除该产品吗？');
        if(!choice){
            return;
        }
        $.ajax({
            url:'/store/delete',
            method: 'post',
            data: {'id':id},
            success:function (response) {
                alert(response.message);
                if(response.success) //删除成功
                    window.location.reload(); //刷新页面
            }
        });
    }
</script>
<body>

<div class="container">

    <!--头部导航-->
    <div class="ui inverted menu" style="margin-bottom: 0px">
        <a class="item ui">
            <img src="/img/store/logo.svg" style="width: 40px;height: 40px">
        </a>
        <a class="item">
            仓库管理
        </a>

        <div class="right menu">
            <a class="item ui " href="/me"><img src="/img/store/sign-up.svg" class="img-circle"
                                                style="width: 40px;height: 40px"></a>
            <a class="item" href="/exit">退出 </a>
        </div>
    </div>

    <div class="">

        <div class="ui menu">

            <div>
                <a class="ui label image" style="display: inline-block">
                    <img class="ui basic image " src="/img/store/back.svg"> 返回

                </a>

            </div>
            <h3 class="ui center header" style="text-align: center">入库单详情</h3>

            <hr>


        </div>

        <div class="center"><h4>已入库</h4></div>


        <table class="ui red table" style="border: dotted;text-align: center">
            <tbody>
            <tr style="border: dotted">
                <td>入库单号:</td>
                <td>仓　　库:</td>
                <td>入库数量:</td>
                <td>入库金额:</td>
            </tr>
            <tr style="border: dotted">
                <td>创建时间:</td>
                <td>创建人:</td>
                <td>来货单位:</td>

            </tr>

            <tr style="border: dotted">
                <td>备　　注:</td>
            </tr>
            </tbody>
        </table>
        <br>
        <hr>

        <table class="ui red table">
            <thead>
            <tr>
                <th>序号</th>
                <th>品名</th>
                <th>规格</th>
                <th>单位</th>
                <th>价格</th>
                <th>入库数量</th>
                <th>金额</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <!--模态显示商品详细信息-->
                <td></td>
                <td></td>
                <td>200</td>
                <td></td>
                <td></td>
                <td></td>
                <td><a  class="ui icon tiny button" href="#" data-tooltip="编辑"><i class="edit icon"></i></a>
                    <a class="ui icon tiny red button" href="/store/delete/${ss}" data-tooltip="删除"><i class="delete icon"></i></a></td>
            </tr>
            </tbody>
        </table>

    </div>


</div>

</body>
</html>
