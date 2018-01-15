<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2018/1/4
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<link rel="shortcut icon" type="image/x-icon" href="/theme/icon/favicon.ico">
<link rel="stylesheet" type="text/css" href="/theme/css/base.css">
<link rel="stylesheet" type="text/css" href="/theme/css/home.css">
<html>
<head>
    <title>歪秀购物</title>
</head>
<body>

<!--- header begin-->
<header id="pc-header">
    <div class="BHeader">
        <div class="yNavIndex">
            <ul class="BHeaderl">
                <li><a href="/userLogin">登录</a> </li>
                <li class="headerul">|</li>
                <li><a href="#">订单查询</a> </li>
                <li class="headerul">|</li>
                <li><a href="#">我的收藏</a> </li>
                <li class="headerul">|</li>
                <li><a href="#">我的商城</a> </li>
                <li class="headerul">|</li>
                <li><a href="#" class="M-iphone">手机悦商城</a> </li>
            </ul>
        </div>
    </div>
    <div class="container clearfix">
        <div class="header-logo fl"><h1><a href="#"><img src="theme/icon/logo.png"></a> </h1></div>
        <div class="head-form fl">
            <form class="clearfix">
                <input type="text" class="search-text" accesskey="" id="key" autocomplete="off"  placeholder="手机模型">
                <button class="button" onClick="search('key');return false;">搜索</button>
            </form>
            <div class="words-text clearfix">
                <a href="#" class="red">1元秒爆</a>
                <a href="#">低至五折</a>
                <a href="#">农用物资</a>
                <a href="#">买一赠一</a>
                <a href="#">佳能相机</a>
                <a href="#">稻香村月饼</a>
                <a href="#">服装城</a>
            </div>
        </div>
        <div class="header-cart fr"><a href="#"><img src="theme/icon/car.png"></a> <i class="head-amount">99</i></div>
        <div class="head-mountain"></div>
    </div>
    <div class="yHeader">
        <div class="yNavIndex">
            <div class="pullDown">
                <h2 class="pullDownTitle">全部商品分类</h2>
            </div>
            <ul class="yMenuIndex">
                <li><a href="" target="_blank">服装城</a></li>
                <li><a href="" target="_blank">美妆馆</a></li>
                <li><a href="" target="_blank">美食</a></li>
                <li><a href="" target="_blank">全球购</a></li>
                <li><a href="" target="_blank">闪购</a></li>
                <li><a href="" target="_blank">团购</a></li>
                <li><a href="" target="_blank">拍卖</a></li>
                <li><a href="" target="_blank">金融</a></li>
                <li><a href="" target="_blank">智能</a></li>
            </ul>
        </div>
    </div>
</header>
<!-- header End -->

<div class="containers"><div class="pc-nav-item"><a href="#"></a><a href="#"></a></div></div>

<div class="containers clearfix">
    <div class="pc-info fr">
        <div class="pc-term">
            <dl class="pc-term-dl clearfix">
                <dt>品牌：</dt>
                <dd><a href="#">三星（SAMSUNG）</a></dd>
                <dd><a href="#">华为（HUAWEI）</a></dd>
                <dd><a href="#">联想（lenovo）</a></dd>
                <dd><a href="#">索尼（SONY）</a></dd>
                <dd><a href="#">飞利浦（Philips）</a></dd>
                <dd><a href="#">Apple</a></dd>
                <dd><a href="#">小米（MI）</a></dd>
                <dd><a href="#">HTC</a></dd>
                <dd><a href="#">酷派（Coolpad）</a></dd>
                <dd><a href="#">诺基亚（NOKIA）</a></dd>
                <dd><a href="#">中兴（ZTE）</a></dd>
            </dl>
            <dl class="pc-term-dl clearfix">
                <dt>尺寸：</dt>
                <dd><a href="#">4.5英寸</a></dd>
                <dd><a href="#">4.7英寸</a></dd>
                <dd><a href="#">5.0英寸</a></dd>
                <dd><a href="#">5.5英寸</a></dd>
                <dd><a href="#">5.3英寸</a></dd>
                <dd><a href="#">7.0英寸</a></dd>
                <dd><a href="#">6.0英寸</a></dd>
                <dd><a href="#">3.5英寸</a></dd>
            </dl>
            <dl class="pc-term-dl clearfix">
                <dt>系统：</dt>
                <dd><a href="#">iOS</a></dd>
                <dd><a href="#">Android/安卓</a></dd>
                <dd><a href="#">Windows Phone</a></dd>
                <dd><a href="#">无操作系统</a></dd>
                <dd><a href="#">YunOS</a></dd>
                <dd><a href="#">FLyme</a></dd>
                <dd><a href="#">MIUI</a></dd>
                <dd><a href="#">MTK</a></dd>
                <dd><a href="#">iOS</a></dd>
            </dl>
            <div>
                <a href="#">更多</a>
            </div>

            <div class="pc-line"></div>
            <div class="pc-search clearfix">
                <div class="fl pc-search-in">
                    <input type="text" class="pc-search-w">
                    <input type="text" class="pc-search-s" placeholder="￥">
                    <input type="text" class="pc-search-s" placeholder="￥">
                    <a href="#" class="pc-search-a">搜索</a>
                </div>
            </div>
        </div>
        <div class="pc-term">
            <div class="clearfix pc-search-p">
                <div class="fl pc-search-e"><a href="#" class="cur">销量</a><a href="#">价格</a><a href="#">评价</a><a href="#">上架时间</a></div>
                <div class="fr pc-search-v">
                    <ul>
                        <li><input type="checkbox"><a href="#">有货</a> </li>
                        <li><input type="checkbox"><a href="#">限时抢购</a> </li>
                        <li><input type="checkbox"><a href="#">满减大促</a> </li>
                    </ul>
                </div>
            </div>
            <div class="pc-search-i">
                <div class="fr">
                    <span class="pc-search-t"><b>1</b><em>/</em><i>32</i></span>
                    <a href="#" class="pc-search-d">上一页</a>
                    <a href="#">下一页</a>
                </div>
            </div>
        </div>
        <div class="time-border-list pc-search-list clearfix">
            <ul class="clearfix">
                <c:forEach items="${goodsList}" var="goods" varStatus="loop">
                    <li>
                        <a href="/selectSingleGoodsInfo?goodsNum=${goods.goodsNum}"> <img src="${goods.goodsImgHttpURL}"></a>
                        <p class="head-name"><a href="/selectSingleGoodsInfo?goodsNum=${goods.goodsNum}">${goodsDetailList[loop.count-1].goodsDesc}</a> </p>
                        <br>
                        <img src="${goodsDetailList[loop.count-1].goodsDetailImgHttpURL1}">
                        &nbsp;&nbsp;&nbsp;
                        <img src="${goodsDetailList[loop.count-1].goodsDetailImgHttpURL2}">
                        &nbsp;&nbsp;&nbsp;
                        <img src="${goodsDetailList[loop.count-1].goodsDetailImgHttpURL3}">
                        <p><span class="price">￥${goodsDetailList[loop.count-1].goodsSalePrice}</span></p>
                        <p class="head-futi clearfix"><span class="fl">好评度：90% </span> <span class="fr">100人购买</span></p>
                        <p class="clearfix"><a href="/selectSingleGoodsInfo?goodsNum=${goods.goodsNum}" class="fr pc-search-c">详情</a></span> <a href="#" class="fr pc-search-c">购物车</a> </p>
                    </li>
                </c:forEach>

            </ul>
            <div class="clearfix">
                <div class="fr pc-search-g">
                    <a class="fl pc-search-f" href="#">上一页</a>
                    <a href="#" class="current">1</a>
                    <a href="javascript:;">2</a>
                    <a href="javascript:;">3</a>
                    <a href="javascript:;">4</a>
                    <a href="javascript:;">5</a>
                    <a href="javascript:;">6</a>
                    <a href="javascript:;">7</a>
                    <span class="pc-search-di">…</span>
                    <a title="使用方向键右键也可翻到下一页哦！" class="pc-search-n" href="javascript:;" onClick="SEARCH.page(3, true)">下一页</a>
                    <span class="pc-search-y">
                        <em>  共20页    到第</em>
                        <input type="text" class="pc-search-j" placeholder="1">
                        <em>页</em>
                        <a href="#" class="confirm">确定</a>
                    </span>

                </div>
            </div>
        </div>
        <div class="pc-search-re clearfix">
            <dl>
                <dt>重新搜索</dt>
                <dd>
                    <input type="text" value="三星"  id="key-re-search" class="text">
                    <input type="button" value="搜&nbsp;索" id="btn-re-search" class="button">
                </dd>
            </dl>
        </div>
    </div>
</div>
<!--- footer begin-->
<div class="aui-footer-bot">
    <div class="time-lists aui-footer-pd clearfix">
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="theme/icon/icon-d1.png"></span>
                <em>消费者权益</em>
            </h4>
            <ul>
                <li><a href="#">保障范围 </a> </li>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="theme/icon/icon-d2.png"></span>
                <em>新手上路</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="theme/icon/icon-d3.png"></span>
                <em>保障正品</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>
                <span><img src="theme/icon/icon-d1.png"></span>
                <em>消费者权益</em>
            </h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
    </div>
    <div style="border-bottom:1px solid #dedede"></div>
    <div class="time-lists aui-footer-pd time-lists-ls clearfix">
        <div class="aui-footer-list clearfix">
            <h4>购物指南</h4>
            <ul>
                <li><a href="#">保障范围 </a> </li>
                <li><a href="#">购物流程</a> </li>
                <li><a href="#">会员介绍 </a> </li>
                <li><a href="#">生活旅行</a> </li>
                <li><a href="#"> 常见问题 </a> </li>
                <li><a href="#"> 联系客服购物指南 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>特色服务</h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>帮助中心</h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
        <div class="aui-footer-list clearfix">
            <h4>新手指导</h4>
            <ul>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">退货退款流程</a> </li>
                <li><a href="#">服务中心 </a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#">服务中心</a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
                <li><a href="#"> 更多特色服务 </a> </li>
            </ul>
        </div>
    </div>
</div>
<!-- footer End -->
</body>
</html>