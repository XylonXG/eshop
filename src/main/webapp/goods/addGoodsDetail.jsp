<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2018/1/1
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String goodsNum = request.getParameter("goodsNum");
%>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    /*选择仓库*/
    $(function () {


            $("#depotName").empty();
            /* alert("******")*/
            $.ajax({
                type : "post",// 指定是post还是get
                //data : "username=" + username + "&userpass=" + userpass,//发送到服务器的数据
                url : "/selectDepot",//发送请求的地址
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
            var textNode = document.createTextNode(data[i].depotName);//创建文本节点
            op.appendChild(textNode);//把文本子节点添加到op元素中，指定其显示值

            document.getElementById("depotName").appendChild(op);

        }
    }
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<fieldset>
    <legend>商品明细</legend>
    <form action="/addGoodsDetail?goodsNum=<%=goodsNum%>" method="post" enctype="multipart/form-data">
        详细描述:<textarea name="goodsDesc"></textarea><br><br>
        明细图片1:<input type="file" name="goodsDetailImg1"><br><br>
        明细图片2:<input type="file" name="goodsDetailImg2"><br><br>
        明细图片3:<input type="file" name="goodsDetailImg3"><br><br>
        商品原价:<input type="text" name="goodsOriginalPrice"><br><br>
        销售价格:<input type="text" name="goodsSalePrice"><br><br>

        添加库存:<input type="number" name="goodsCount"><br><br>

        所在仓库:<select name="depotName" id="depotName">
                    <option>==选择仓库==</option>
                    <option>1号仓库</option>
                </select><br><br>
        是否可用:<input type="checkbox" name="isUsed"><br><br>
        <button type="submit" class="btn btn-primary">添加</button>
        <button type="reset" class="btn btn-primary">重置</button>
    </form>
</fieldset>
</center>
</body>
</html>
