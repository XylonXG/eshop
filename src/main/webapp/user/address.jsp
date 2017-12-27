<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/27
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    function showProvince() {
        $.ajax({
            url:'/selectAllProvince',
            type:'post',
            data:{'id':0},
            dataType:'json',
            success:function (data) {
                var p="<option value=''>--请选择省份--</option>";

            }

        })
    }
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center>
  <fieldset>
      <legend>添加收获地址</legend>
      <form>
          会员编号:<input type="text" name="username"><br><br>
           省:<input type="text" name="province" id="province">
           市:<input type="text" name="city" id="city"><br><br>
      </form>
  </fieldset>
</center>
</body>
</html>
