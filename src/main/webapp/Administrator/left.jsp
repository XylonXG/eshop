<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/27
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>功能区</title>
</head>
<body bgcolor="#add8e6">
    <div class="dropdown">
        <button type="button" class="btn dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown">会员管理
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/user/address.jsp" target="rightFrame">添加收获地址</a>
            </li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/user/bank.jsp" target="rightFrame">添加银行卡</a>
            </li>
            <li role="presentation"></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/searchUserList" target="rightFrame">查看用户</a>
            </li>
        </ul>
    </div>
    <br>

    <div class="dropdown">
        <button type="button" class="btn dropdown-toggle" id="dropdownMenu2" data-toggle="dropdown">商品管理
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/goods/addGoods.jsp" target="rightFrame">添加商品</a>
            </li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/searchGoodsList" target="rightFrame">查看商品</a>
            </li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/goods/addGoodsType.jsp" target="rightFrame">商品分类</a>
            </li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/searchGoodsTypeList" target="rightFrame">查看商品分类</a>
            </li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/goods/addGoodsSupplier.jsp" target="rightFrame">供应商</a>
            </li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/searchGoodsSupplierList" target="rightFrame">查看供应商</a>
            </li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/goods/addDepot.jsp" target="rightFrame">添加仓库</a>
            </li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/searchDepotList" target="rightFrame">查看仓库</a>
            </li>

        </ul>
    </div>
    <br>
    <div class="dropdown">
        <button type="button" class="btn dropdown-toggle" id="dropdownMenu4" data-toggle="dropdown">订单管理
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/searchOrderList" target="rightFrame">查看订单</a>
            </li>
        </ul>
    </div>
    <br>
    <div class="dropdown">
        <button type="button" class="btn dropdown-toggle" id="dropdownMenu3" data-toggle="dropdown">企划管理
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/user/address.jsp" target="rightFrame">添加优惠</a>
            </li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/user/bank.jsp" target="rightFrame">添加银行卡</a>
            </li>
            <li role="presentation"></li>
            <li role="presentation">
                <a role="menuitem" tabindex="-1" href="/searchUserList" target="rightFrame">查看用户</a>
            </li>
        </ul>
    </div>
    <br>
    <button type="button" class="btn btn-warning"><a href="/logout" target="_top">退出</a></button>
</body>
</html>
