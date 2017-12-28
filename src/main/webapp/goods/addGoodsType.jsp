<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/28
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <fieldset>
        <legend>添加商品类型</legend>
        <form action="/addGoodsType" method="post">
            类型名称:<input type="text" name="goodsTypeName">
            <br><br>
            是否可用:<input type="checkbox" name="isUsed">
            <br><br>
            <button type="submit" class="btn btn-primary">添加</button>
            <button type="reset" class="btn btn-primary">重置</button>
        </form>
    </fieldset>
</center>
</body>
</html>
