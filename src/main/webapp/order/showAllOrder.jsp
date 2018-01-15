<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2018/1/9
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
    <title>查看所有订单</title>
</head>
<body>
<center>
    <table>
        <tr>
            <td colspan="6"><h3>用 户 订 单</h3></td>
        </tr>
        <tr>
            <td colspan="6">用户名：
                <form action="/searchOrderList" method="get">
                    <input type="text" name="queryCondition" value="${page.queryCondition}" id="condition">
                    <button type="submit" class="btn btn-info">查询</button>
                </form>
            </td>
        </tr>
    </table>
    <table  class="table table-bordered">
        <tr>
            <th>id</th>
            <th>用户名</th>
            <th>订单号</th>
            <th>订单日期</th>
            <th>订单金额</th>
            <th>订单状态</th>
            <th>发票金额</th>
            <th>用户详细地址</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${orderList}" var="item" varStatus="status">
            <tr
                    <c:if test="${status.count%2!=0}">
                        style="background-color:#dbce8f"
                    </c:if>
                    <c:if test="${status.count%2==0}"> style="background-color:grey"</c:if>>
                <td>${item.id}</td>
                <td>${item.username}</td>
                <td>${item.orderNum}</td>
                <td>${item.orderDate}</td>
                <td>${item.orderTrueMoney}</td>
                <td>${item.orderCondition}</td>
                <td>${item.invoiceMoney}</td>
                <td>${item.invoiceMoney}</td>
                <td>${item.userDetailAddress}</td>
                <td><a href="/deleteOrder?id=${item.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <br /> <br /> <label>第${page.currentPage}/${page.totalPage}页
    共${page.totalRows}条</label> <a href="/searchOrderList?currentPage=0">首页</a> <a
        href="/searchOrderList?currentPage=${page.currentPage-1}"
        onclick="return checkFirst()">上一页</a> <a
        href="/searchOrderList?currentPage=${page.currentPage+1}"
        onclick="return checkNext()">下一页</a> <a
        href="/searchOrderList?currentPage=${page.totalPage}">尾页</a> 跳转到:<input
        type="text" style="width:30px" id="turnPage" />页 <input
        type="button" onclick="startTurn()" value="跳转">
</center>

<script type="text/javascript">

    function checkFirst(){
        if(${page.currentPage>1}){

            return true;

        }
        alert("已到页首,无法加载更多");

        return false;
    }

    function checkNext(){

        if(${page.currentPage<page.totalPage}){

            return true;

        }
        alert("已到页尾，无法加载更多页");
        return false;

    }


    function startTurn(){

        var turnPage=document.getElementById("turnPage").value;

        if(turnPage>${page.totalPage}){

            alert("对不起已超过最大页数");

            return false;

        }

        var shref="/searchOrderList?currentPage="+turnPage;

        window.location.href=shref;
    }
</script>

</body>
</html>
