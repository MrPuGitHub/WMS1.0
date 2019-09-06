<%--
  Created by IntelliJ IDEA.
  User: kluzhang
  Date: 2019/8/31
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>popup</title>
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
    // $('.ui.button')
    //     .popup({
    //         inline     : true,
    //         hoverable  : true,
    //         position   : 'bottom left',
    //         delay: {
    //             show: 300,
    //             hide: 800
    //         }
    //     })
    // ;

    $(function () {
        var popupLoading = '<!--<i class="notched circle loading icon teal"></i>--> <h2>您好</h2> ';
        $('.ui.example.button').on("click",function () {
            alert("sdsdssd");

            $('.ui.inverted.table.popup').popup({
                hoverable  : true,
                exclusive: true,
                // delay: {
                //     show: 400,
                //     hide: 400
                // },
                html: popupLoading,
                variation: 'wide',
                onShow: function (el) {
                    var popup = this;
                    popup.html(popupLoading);
                    // $.ajax({
                    //     url: '/user_summary',
                    //     data: {uid: $(el).data('uid')},
                    //     method: 'post'
                    // }).done(function(result) {
                    //     popup.html(result);
                    // }).fail(function() {
                    //     popup.html('error');
                    // });
                }
            });

        })


    })


</script>
<body>


<table class="ui inverted table popup">
    <thead>
    <tr>
        <th>品名型号</th>
        <th>规格</th>
        <th>单位</th>
        <th>入库数量</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>测试数据</td>
        <td>黄色</td>
        <td>包</td>
        <td>334</td>
    </tr>
    </tbody>
</table>
<div class="ui example button"  data-position="bottom left">fdfdf</div>



</body>
</html>
