<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/27
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>会员登录</title>
</head>
<body>
<br><br><br><br>
<center>
    <fieldset>
        <legend><h1>会 员 登 录</h1></legend>
        <form action="/userLogin" method="post" class="form-horizontal" role="form">
            <font size="5">账 号:</font><input type="text" class="form-control input-lg" name="username" placeholder="请输入账号">
            <br><br><br>
            <font size="5">密 码:</font><input type="password" class="form-control" name="password" placeholder="请输入密码">
            <br><br><br>
            <button type="submit" class="btn btn-primary">登录</button>
            <button type="reset" class="btn btn-danger">重置</button>
        </form>
    </fieldset>
</center>
</body>
</html>
