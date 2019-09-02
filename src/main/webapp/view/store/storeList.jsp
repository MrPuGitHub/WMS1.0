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
    <title>入库列表</title>
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


    // function btn() {
    //     // $('.button')
    //     //     .popup({
    //     //         inline: true
    //     //     })
    //     // ;
    //
    //     alert("dsdsds");
    //
    //     $('.button')
    //         .popup({
    //             popup: '.special.popup'
    //         })
    //     ;
    // }

    $('#exampleModal').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) // Button that triggered the modal
        var recipient = button.data('whatever') // Extract info from data-* attributes
        // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
        // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        var modal = $(this)
        modal.find('.modal-title').text('New message to ' + recipient)
        modal.find('.modal-body input').val(recipient)
    })

    function selectAll(obj) {
        //获取当前复选框的选中状态
        var flag = obj.checked;

        //获取所有的复选框
        var arr = document.getElementsByClassName("itemSelect");

        //遍历数组,将所有的复选框和flag相同
        for (var i = 0; i < arr.length; i++) {
            arr[i].checked = flag;
        }
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

                <h3 class="ui right floated header" style="text-align: center">入库列表</h3>
            </div>

            <hr>


            <div class="ui image ">
                <a href="#" class="item ui">
                    <img src="/img/store/export.svg" style="width: 40px;height: 40px">导出
                </a>
            </div>

            <div class="ui category search">
                <div class="ui icon input">
                    <input class="prompt" type="text" placeholder="入库单号\入库产品\序...">
                    <i class="search icon"></i>
                </div>
                <div class="results"></div>
            </div>

        </div>

        <table class="ui red table">
            <thead>
            <tr>
                <th><input type="checkbox" name="selectAll" id="selectAll" onclick="selectAll(this)"></th>
                <th>入库单号</th>
                <th>创建时间</th>
                <th>仓库</th>
                <th>来货单位</th>
                <th>入库产品</th>
                <th>入库数量</th>
                <th>入库金额</th>
                <th>创建人</th>
                <th>入库人</th>
                <th>入库状态</th>
                <th>序列号</th>
                <th>备注</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${ruKuDanList }" var="v" varStatus="vs">
                <tr>
                    <td><input type="checkbox" name="${v.id}" class="itemSelect"></td>
                    <td><a href="/store/selectById/${v.id}">${v.id }</a></td>
                    <td>${v.intime}</td>
                    <td>总仓</td>
                    <td>200</td>
                    <td data-inverted="" data-html="false" data-tooltip="<h1>xscsdss</h1>">jjjjj</td>
                    <td>Apples</td>
                    <td>200</td>
                    <td>0g</td>
                    <td>Apples</td>


                    <c:choose>
                        <c:when test="${v.state==1}">
                            <td data-inverted="" data-tooltip="已入库" data-position="top left"><i class="check icon"></i>
                            </td>
                        </c:when>
                        <c:otherwise>  <td data-inverted="" data-tooltip="未入库" data-position="top left"><i class="error icon"></i>
                        </td></c:otherwise>
                    </c:choose>



                    <td>序列号</td>
                    <td data-inverted="" data-tooltip="备注信息" data-position="left center"><i class="info icon"></i></td>
                </tr>
            </c:forEach>

            </tbody>
        </table>


        <!--入库产品弹出框显示表格-->
        <%--    <table class="ui inverted table">--%>
        <%--        <thead>--%>
        <%--        <tr>--%>
        <%--            <th>品名型号</th>--%>
        <%--            <th>规格</th>--%>
        <%--            <th>单位</th>--%>
        <%--            <th>入库数量</th>--%>
        <%--        </tr>--%>
        <%--        </thead>--%>
        <%--        <tbody>--%>
        <%--        <tr>--%>
        <%--            <td>测试商品</td>--%>
        <%--            <td>黄色</td>--%>
        <%--            <td>盒/箱</td>--%>
        <%--            <td>122</td>--%>
        <%--        </tr>--%>
        <%--        </tbody>--%>
        <%--    </table>--%>

    </div>


    <%--    <div class="ui button">Activator</div>--%>
    <%--    <div class="ui special popup">--%>
    <%--        <div class="header">Custom Header</div>--%>
    <%--        <div class="ui button">Click Me</div>--%>
    <%--    </div>--%>

    <%--    <button onclick="btn()">点我</button>--%>

    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">
        Open modal for @mdo
    </button>


    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
         data-keyboard="false" data-backdrop="false" data-show="false">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="exampleModalLabel">New message</h4>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="form-group">
                            <label for="recipient-name" class="control-label">Recipient:</label>
                            <input type="text" class="form-control" id="recipient-name">
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">Message:</label>
                            <textarea class="form-control" id="message-text"></textarea>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Send message</button>
                </div>
            </div>
        </div>
    </div>


</div>

</body>
</html>
