<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'addview.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <link rel="stylesheet" type="text/css"
          href="<%=path%>/css/bootstrap.css">
    <script type="text/javascript" src="<%=path%>/js/jquery-1.4.2.js"></script>

    <style type="text/css">
        .commonbor {
            border-radius: 0px
        }
        .ss{

            width: 290px;
            height: 35px;
        }
    </style>

</head>

<body>


<div class="container">

    <br>
    <br>
    <div style="width: 400px; margin: 0px auto;">
        <form class="form-horizontal" action="<%=path %>/addEmpview" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-4 control-label">员工姓名</label>
                <div class="col-sm-8">
                    <input class="form-control commonbor" name="empname" placeholder="输入员工名字">
                </div>
            </div>
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-4 control-label">员工编号</label>
                <div class="col-sm-8">
                    <input class="form-control commonbor" name="empid" placeholder="输入员工编号">
                </div>
            </div>

            <div class="form-group">
                <label for="inputEmail3" class="col-sm-3 control-label">工作岗位</label>
                <select class="ss" name="workname">
                    <option>打单</option>
                    <option>拣货</option>
                    <option>上架</option>
                    <option>交接</option>
                    <option>盘点</option>
                    <option>复合</option>
                </select>
                <div class="col-sm-9">

                </div>
            </div>

            <div class="form-group">
                <label for="inputEmail3" class="col-sm-4 control-label">工作量</label>
                <div class="col-sm-8">
                    <input class="form-control commonbor" name="worknum" placeholder="输入工作量">
                </div>
            </div>

            <div class="form-group">
                <label for="inputEmail3" class="col-sm-4 control-label">评分</label>
                <div class="col-sm-8">
                    <input class="form-control commonbor" name="workcorde" placeholder="评分">
                </div>
            </div>


            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary commonbor">增&nbsp;&nbsp;&nbsp;&nbsp;加</button>
                </div>
            </div>
        </form>
    </div>


</div>



</body>
</html>
