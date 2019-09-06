<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>入库单详情</title>
</head>

<script src="/js/jquery-1.11.0.min.js"></script>
<script src="/js/jquery.form.js"></script>

<!--semantic引入的文件-->
<script src="/js/semantic.min.js"></script>
<link rel="stylesheet" href="/css/semantic.min.css">

<script>

    $(function () {
        // $(".ui.green.button").on("click", function () {
        //     $('.ui.mini.modal')
        //         .modal({
        //             inverted: true
        //         })
        //         .modal('show');
        // });

        $(function () {
            $(".ui.second.modal")
                .modal(
                    'attach events',
                    '.first.modal .positive.button',
                    'show');
        });

        // 编辑按钮模态执行事件
        // function editModal() {
        //     $('.ui.mini.first.modal')
        //         .modal({
        //             inverted: true
        //         }).modal('show');
        // }

        <!--确定按钮执行事件-->
        $(".ui.positive.button").on("click", function () {
            alert("确定按钮执行事件");
        });

        <!--取消按钮执行事件-->
        $(".ui.negative.button").on("click", function () {
            alert("取消按钮执行事件");
        });

    });


    function deleteGoodById(id) {
        alert(id);
        var choice = confirm('确认要删除该商品吗？');
        if (!choice) {
            return;
        }
        $.ajax({
            url: '/store/delete',
            method: 'post',
            data: {'id': id},
            success: function (response) {
                alert(response.message);
                if (response.success) //删除成功
                    window.location.reload(); //刷新页面
            }
        });
    }
</script>
<style>
    .ui.mini.modal {
        text-align: center;
    }

</style>

<body>

<div class="<%--container--%>">

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
        <div class="">
            <div>
                <a class="ui label image" style="display: inline-block" href="javascript:void(0);" onclick="javascript:history.back(-1);">
                    <img class="ui basic image " src="/img/store/back.svg"> 返回
                </a>
            </div>
            <div><h3 class="ui center header" style="text-align: center">入库单详情</h3></div>
            <hr>
        </div>

        <div><h4 style="text-align: center">已入库</h4></div>

        <table class="ui red table" style="border: dotted;text-align: center">
            <tbody>
            <tr style="border: dotted">
                <td>入库单号:${instore.id}</td>
                <td>仓　　库:</td>
                <td>入库数量:</td>
                <td>入库金额:</td>
            </tr>
            <tr style="border: dotted">
                <td>创建时间:${instore.intime}</td>
                <td>创建人:${userName}</td>
                <td>来货单位:<%--${ruKuDan.stockCompany}--%></td>
            </tr>
            <tr style="border: dotted">
                <td>备　　注:</td>
            </tr>
            </tbody>
        </table>
        <br>

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
                <td><a class="ui icon tiny button" href="javascript:void(0);" onclick="editModal()" data-tooltip="编辑"><i
                        class="edit icon"></i></a>
                    <a class="ui icon tiny red button" href="javascript:void(0);" onclick="deleteGoodById(1)"
                       data-tooltip="删除"><i
                            class="delete icon"></i></a></td>
            </tr>
            </tbody>
        </table>
    </div>


    <!--修改商品模态-->
    <div class="ui piled segment modal">
        <div class="ui mini first modal">
            <i class="close icon"></i>
            <div class="ui header">
                <span class="center">修改产品</span>
            </div>
            <div class="content">
                <div class="center">
                    <p>品　　名:</p>
                    <p>货　　号:</p>
                    <p>规　　格:</p>
                    <hr>
                    <div class="ui labeled input">
                        <div class="ui label">
                            价　　格
                        </div>
                        <input type="text" placeholder="请输入价格(元)">
                    </div>
                    <br>
                    <br>
                    <div class="ui labeled input">
                        <div class="ui label">
                            入库数量
                        </div>
                        <input type="text" placeholder="请输入入库数量">
                    </div>
                    <br>
                    <br>
                    <div class="ui labeled input">
                        <div class="ui label">
                            备　　注
                        </div>
                        <input type="text" placeholder="请输入备注信息">
                    </div>
                </div>
            </div>
            <div class="actions center">
                <div class="ui positive button">确定</div>
                <div class="ui negative button">取消</div>
            </div>
        </div>
    </div>

    <div class="ui second modal">
        <h2 class="header">正在保存...</h2>
        <div class="content">
            <div class="ui progress active">
                <div class="bar" style="width: 30%;"></div>
            </div>
        </div>
    </div>


</div>

</body>


<script>
    // 编辑按钮模态执行事件
    function editModal() {
        $('.ui.mini.first.modal')
            .modal({
                inverted: true
            }).modal('show');
    }
</script>
</html>
