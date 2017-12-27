<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/26
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">

</script>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<center>
    <br><br><h1>会 员 注 册</h1><br>
    <form action="/userReg" method="post" class="form-inline" role="form">
        会员账号:<input type="text" name="userAccount"><br><br>
        会员密码:<input type="password" name="userPassword"><br><br>
        确认密码:<input type="password" name="reuserPassword"><br><br>
        身份证号:<input type="text" name="userIDcard"><br><br>
        会员生日:<input type="date" name="userBirth"><br><br>
        真实姓名:<input type="text" name="userTrueName"><br><br>
        会员邮箱:<input type="text" name="userEamil"><br><br>
        手机号码:<input type="text" name="userPhone"><br><br>
        <button type="submit" class="btn btn-primary" >注册</button>
        <button type="reset"  class="btn btn-primary" >重置</button>
    </form>
</center>
</body>
</html>
