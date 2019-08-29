<%--此页面用于显示出库单列表--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>


    <title>创建盘点单</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.js"></script>

</head>

<body>

<h2>
    <nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 当前位置:
        <span class="c-gray en">&gt;&gt;</span> 仓库管理
        <span class="c-gray en">&gt;&gt;</span> 盘点管理

        <input type="submit" class="btn btn-primary" value="返回" onclick="window.open('pandian.jsp')"/>

    </nav>
</h2>
<div class="container">

    <br>
    <br>
    <div style="width: 400px; margin: 0px auto;">
        <form class="form-horizontal" action="<%=path %>/addviewsub" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <h4>
                    盘点人:<input type="text" class="form-control" style="display: inline-block; width: 150px"
                               placeholder="请输入盘点人姓名">&nbsp;&nbsp;

                    时间: <input type="date" class="form-control" id="datemin" style="display: inline-block; width: 150px"
                               placeholder="盘点单生成时间"/>
                </h4>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">盘点单号</label>
                <div class="col-sm-10">
                    <input class="form-control commonbor" name="name" placeholder="输入盘点单编号">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">选择库位</label>
                <div class="col-sm-10">
                    <select name="warehouse" class="form-control commonbor">
              <c:forEach items="${warehouseList}" var="v">
                  <option>${v.warehouseName}</option>
              </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">选择货架</label>
                <div class="col-sm-10">
                    <select name="address" class="form-control commonbor">
                        ${addressStr }
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label  class="col-sm-2 control-label">选择商品</label>
                <div class="col-sm-10">
                    <select name="address" class="form-control commonbor">
                        ${addressStr }
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">实际数量</label>
                <div class="col-sm-10">
                    <input class="form-control commonbor" name="name" placeholder="输入盘点得到的实际数量">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary commonbor">添&nbsp;&nbsp;&nbsp;&nbsp;加</button>
                </div>
            </div>
        </form>
    </div>


</div>
</body>
</html>
