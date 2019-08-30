<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css"
      href="<%=path%>/css/bootstrap.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.4.2.js"></script>
<html>
<head>
<body>

<h2 style="text-align: center">员工业绩统计查询</h2>
<hr />

<div class="container">
    <br> <br>
    <div class="table-responsive">

        <form class="form-horizontal" action="<%=path%>/selAllempandwork/1">
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">名字</label>
                <div class="col-sm-5">
                    <input type="text" name="empname" class="form-control" id="inputEmail3"
                           placeholder="输入名字">
                </div>
                <div class="col-sm-5">
                    <button type="submit" class="btn btn-default">搜索</button>

                </div>
            </div>


        </form>

        <table
                class="table table-condensed table-hover table-bordered table-striped">

            <tr>
                <td></td>
                <td>序号</td>
                <td>员工姓名</td>
                <td>员工编号</td>
                <td>工作岗位</td>
                <td>工作量</td>
                <td>评分</td>
                <td>操作</td>
            </tr>



            <c:forEach items="${emps}" var="v" varStatus="vs">
                <tr>
                    <td><input type="checkbox" ></td>
                    <td>${v.id}</td>
                    <td>${v.empname }</td>
                    <td>${v.empid}</td>
                    <c:forEach items="${v.workList}" var="vss" varStatus="vsss">
                    <td>${vss.workname}</td>
                        <td>${vss.worknum}</td>
                        <td>${vss.workcorde}</td>
                    </c:forEach>


                    <td> <a type="button"  href="<%=path%>/deletebyid?id=${v.id}" class="btn btn-danger btn-sm">
                        <span class="" aria-hidden="true" ></span>
                        删除</a>
                        <button type="button" class="btn btn-info"
                                onclick="location.href='<%=path%>/updatestu?id=${v.id }'">修改</button></td>

                </tr>
            </c:forEach>

        </table>
        <div style="text-align: center;">
            <nav >
                <ul class="pagination">
                    <li>
                        <a href="<%=path%>/selAllempandwork/1" aria-label="Previous">
                            <span aria-hidden="true">首页</span>
                        </a>
                        <a href="<%=path%>/selAllempandwork/${pageinfo.pageNum-1}" aria-label="Previous">
                            <span aria-hidden="true">上一页</span>
                        </a>

                    </li>
                    <c:forEach items="${pageinfo.getNavigatepageNums() }" var="page">

                        <c:choose>
                            <c:when test="${page==pageinfo.pageNum}">
                                <li><a style="background-color: #00BFFF" href="<%=path%>/selAllempandwork/${page }">${page}</a></li>
                            </c:when>
                            <c:otherwise>
                                <li><a href="<%=path%>/selAllempandwork/${page }">${page}</a></li>
                            </c:otherwise>

                        </c:choose>

                    </c:forEach>
                    <li>
                        <a href="<%=path%>/selAllempandwork/${pageinfo.pageNum+1}" aria-label="Previous">
                            <span aria-hidden="true">下一页</span>
                        </a>
                        <a href="<%=path%>/selAllempandwork/${pageinfo.getPages() }" aria-label="Next">
                            <span aria-hidden="true">尾页</span>
                        </a>
                        <td><button type="button" class="btn btn-info"
                                    onclick="location.href='<%=path%>/addstu'">增加</button>
                            <button type="button" class="btn btn-info"
                                    onclick="location.href='<%=path%>/updatestu?id=${v.id }'">批量修改</button>
                            <button type="button" class="btn btn-danger">批量删除</button></td>

                    </li>
                </ul>
            </nav>
        </div>

    </div>

</div>



</body>
</html>