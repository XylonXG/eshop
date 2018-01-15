<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2018/1/5
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<link rel="stylesheet" href="/shoppingCart/css/reset.css">
<link rel="stylesheet" href="/shoppingCart/css/carts.css">
<html>
<head>
    <title>购物车</title>
</head>
<body>
<section class="cartMain">
    <div class="cartMain_hd">
        <ul class="order_lists cartTop">
            <li class="list_chk">
                <!--所有商品全选-->
                <input type="checkbox" id="all" class="whole_check" checked="checked">
                <label for="all"></label>
                全选
            </li>
            <li class="list_con">商品信息</li>
            <li class="list_info">商品参数</li>
            <li class="list_price">单价</li>
            <li class="list_amount">数量</li>
            <li class="list_sum">金额</li>
            <li class="list_op">操作</li>
        </ul>
    </div>
    <c:forEach items="${shoppingCartList}" var="shoppingCart" varStatus="loop">
    <div class="cartBox">
        <div class="shop_info">
            <div class="shop_name">
                店铺:搜猎人艺术生活</a>
            </div>
        </div>

        <div class="order_content">
            <ul class="order_lists">
                <li class="list_chk">
                    <input type="checkbox" id="checkbox_*" checked="checked" value="on" class="son_check">
                    <label for="checkbox_*"></label>
                </li>
                <li class="list_con">
                    <div class="list_img"><a href="javascript:;"><img src="${shoppingCart.goodsImgHttpURL}" alt=""></a></div>
                    <div class="list_text"><a href="javascript:;">${shoppingCart.goodsDesc}</a></div>
                </li>
                <li class="list_info">
                    <p>规格：默认</p>
                    <p>尺寸：16*16*3(cm)</p>
                </li>
                <li class="list_price">
                    <p class="price">￥${shoppingCart.salePrice}</p>
                </li>
                <li class="list_amount">
                    <div class="amount_box">
                        <a href="javascript:;" class="reduce reSty">-</a>
                        <input type="text" value="1" class="sum" name="buyCount">
                        <a href="javascript:;" class="plus">+</a>
                    </div>
                </li>
                <li class="list_sum">
                    <p class="sum_price">￥${shoppingCart.salePrice}</p>
                </li>
                <li class="list_op">
                    <p class="del"><a href="/deleteFromShoppingCartById?id=${shoppingCart.id}" class="delBtn">移除商品</a></p>
                </li>
            </ul>
        </div>
    </div>
    </c:forEach>
</section>
    <!--底部-->
    <div class="bar-wrapper">
        <div class="bar-right">
            <div class="piece">已选商品<strong class="piece_num">0</strong>件</div>
            <div class="totalMoney">共计: <strong class="total_text">0.00</strong></div>
            <div class="calBtn"><a href="/addOrder">提交</a></div>
        </div>
    </div>
</section>
<section class="model_bg"></section>

<section class="my_model">
    <p class="title">删除宝贝<span class="closeModel">X</span></p>
    <p>您确认要删除该宝贝吗？</p>
    <div class="opBtn"><a href="javascript:;" class="dialog-sure">确定</a><a href="javascript:;" class="dialog-close">关闭</a></div>

</section>
<script src="/shoppingCart/js/jquery.min.js"></script>
<script src="/shoppingCart/js/carts.js"></script>

</body>
</html>