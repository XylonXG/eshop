<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/28
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>添加商品</title>
</head>
<body>
<center>
    <fieldset>
        <legend>商 品 添 加</legend>
        <form action="/addGoods" method="post" enctype="multipart/form-data">
            商品名称:<input type="text" name="goodsName"><br><br>
            商品简码:<input type="text" name="goodsCode"><br><br>
            商品类型:<input type="text" name="goodsType"><br><br>
             供应商:<input type="text" name="goodsSupplier"><br><br>
            上架时间:<input type="date" name="goodsShelfTime"><br><br>
            商品图片:<input type="file" name="goodsPhoto"><br><br>
            是否赠品<input type="checkbox" name="isGift">
                 支持退换<input type="checkbox" name="isReturn"><br><br>
            <button type="submit" class="btn btn-primary">添加</button>
            <button type="reset" class="btn btn-primary">重置</button>
        </form>
    </fieldset>
</center>
</body>
</html>
