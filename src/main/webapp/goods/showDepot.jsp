<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2018/1/1
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
    <title></title>
</head>
<body>
<center>
    <table>
        <tr>
            <td colspan="6"><h3>仓 库 信 息</h3></td>
        </tr>
        <tr>
            <td colspan="6">供应商名称：
                <form action="/searchDepotList" method="get">
                    <input type="text" name="queryCondition" value="${page.queryCondition}" id="condition">
                    <button type="submit" class="btn btn-info">查询</button>
                </form>
            </td>
        </tr>
    </table>
    <table  class="table table-bordered">
        <tr>
            <th>id</th>
            <th>仓库名称</th>
            <th>仓库地址</th>
            <th>是否可用</th>
            <th>创建时间</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${depotList}" var="item" varStatus="status">
            <tr
                    <c:if test="${status.count%2!=0}">
                        style="background-color:#dbce8f"
                    </c:if>
                    <c:if test="${status.count%2==0}"> style="background-color:grey"</c:if>>
                <td>${item.id}</td>
                <td>${item.depotName}</td>
                <td>${item.depotAddress}</td>
                <td>${item.isUsed}</td>
                <td>${item.createTime}</td>
                <td><a href="/deleteDepot?id=${item.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <br /> <br /> <label>第${page.currentPage}/${page.totalPage}页
    共${page.totalRows}条</label> <a href="/searchDepotList?currentPage=0">首页</a> <a
        href="/searchDepotList?currentPage=${page.currentPage-1}"
        onclick="return checkFirst()">上一页</a> <a
        href="/searchDepotList?currentPage=${page.currentPage+1}"
        onclick="return checkNext()">下一页</a> <a
        href="/searchDepotList?currentPage=${page.totalPage}">尾页</a> 跳转到:<input
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

        var shref="/searchDepotList?currentPage="+turnPage;

        window.location.href=shref;
    }
</script>

</body>
</html>
