<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/28
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>添加银行卡</title>
</head>
<body>
<center>
    <fieldset>
        <legend>添加银行卡</legend>
        <form action="/addBank?userNum=${userNum}" method="post">
            会员编号:<input type="text" name="userNum" value="${user.userNum}" readonly="readonly">
            <br><br>
            银行卡号:<input type="text" name="bankNum">
            <br><br>
            银行名称:<input type="text" name="bankName">
            <br><br>
            开户行 :<input type="text" name="bankOpen">
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
