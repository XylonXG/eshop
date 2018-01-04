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
<script type="text/javascript">
    window.onload = function ajaxSend() {
        /*   alert("asd");*/
        $.ajax({
            type : "post",// 指定是post还是get
            //data : "username=" + username + "&userpass=" + userpass,//发送到服务器的数据
            url : "/selectGoodsType",//发送请求的地址
            dataType : "json",
            error : function(err) {//如果确定能正确运行,可不写
                alert(err.code);
            },
            success : ajaxSendCallBack
        })
    }
    function ajaxSendCallBack(data) {
        /*  alert(data[0].name);*/
        for ( var i = 0; i < data.length; i++) {
            var op = document.createElement("option");//创建一个指名名称元素
            op.value = data[i].goodsTypeName;//设置op的实际值为当前的省份名称
            var textNode = document.createTextNode(data[i].goodsTypeName);//创建文本节点
            op.appendChild(textNode);//把文本子节点添加到op元素中，指定其显示值

            document.getElementById("goodsType").appendChild(op);
        }
    }

    /*选择供应商*/
    $(function () {

           $("#goodsSupplier").empty();
            $.ajax({
                type : "post",// 指定是post还是get
                //data : "username=" + username + "&userpass=" + userpass,//发送到服务器的数据
                url : "/selectGoodsSupplier",//发送请求的地址
                dataType : "json",
                error : function(err) {//如果确定能正确运行,可不写
                    alert(err.code);
                },
                success : ajaxSendGoodsSupplierCallBack
            })

    });
    function ajaxSendGoodsSupplierCallBack(data) {
        /*  alert(data[0].name);*/

        for ( var i = 0; i < data.length; i++) {
            var op = document.createElement("option");//创建一个指名名称元素
            op.value = data[i].goodsSupplierName;//设置op的实际值为当前的省份名称
            var textNode = document.createTextNode(data[i].goodsSupplierName);//创建文本节点
            op.appendChild(textNode);//把文本子节点添加到op元素中，指定其显示值

            document.getElementById("goodsSupplier").appendChild(op);
        }
    }



</script>
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
            商品类型:<select name="goodsType" id="goodsType">
                        <option>==商品类型==</option>
                    </select>
            <br><br>
             供应商:<select name="goodsSupplier" id="goodsSupplier">
                        <option>==供应商==</option>
                    </select><br><br>
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
