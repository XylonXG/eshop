<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2018/1/1
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
        <legend>商 品 明 细</legend>
        商品名称:${goods.goodsName}<br>
        商品图片:<img src="${goods.goodsImgHttpURL}"><br>
        明细图片:<img src="${goodsDetail.goodsDetailImgHttpURL1}">
                <img src="${goodsDetail.goodsDetailImgHttpURL2}">
                <img src="${goodsDetail.goodsDetailImgHttpURL3}"><br>
        类型:${goods.goodsType}<br>
        供货商:${goods.goodsSupplier}<br>
        上架时间:${goods.goodsShelfTime}<br>
        是否赠品:${goods.isGift}<br>
        支持退货:${goods.isReturn}<br>
        商品描述:${goodsDetail.goodsDesc}<br>
        成本价格:${goodsDetail.goodsOriginalPrice}<br>
        销售价格:${goodsDetail.goodsSalePrice}<br>
        创建时间:${goodsDetail.goodsCreateTime}
    </fieldset>
</center>
</body>
</html>
