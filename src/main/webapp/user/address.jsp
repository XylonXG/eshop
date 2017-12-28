<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/27
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    window.onload = function ajaxSend() {
        alert("asd");
        $.ajax({
            type : "post",// 指定是post还是get
            //data : "username=" + username + "&userpass=" + userpass,//发送到服务器的数据
            url : "/province",//发送请求的地址
            dataType : "json",
            error : function(err) {//如果确定能正确运行,可不写
                alert(err.code);
            },
            success : ajaxSendCallBack
        })
    }
    function ajaxSendCallBack(data) {
        alert(data[0].name);
        for ( var i = 0; i < data.length; i++) {
            var op = document.createElement("option");//创建一个指名名称元素
            op.value = data[i].name;//设置op的实际值为当前的省份名称
            var textNode = document.createTextNode(data[i].name);//创建文本节点
            op.appendChild(textNode);//把文本子节点添加到op元素中，指定其显示值

            document.getElementById("p").appendChild(op);
        }
    }

    function city() {
        alert("asd");

        var provincename = $("#p").val();

        $.ajax({
            type : "post",// 指定是post还是get
            data : "provincename=" + provincename,//发送到服务器的数据
            url : "/city",//发送请求的地址
            dataType : "json",
            error : function(err) {
                alert(err.code);
            },
            success : ajaxSendCallBackcity
        })
    }

    function ajaxSendCallBackcity(data) {
        //如果是jsonArray这样返回
        alert(data[0].name);
        //返回json结果
        /*
                把select中的所有option移除（除了请选择）
         */
        var citySelect = document.getElementById("c");
        // 获取其所有子元素
        var optionEleList = citySelect.getElementsByTagName("option");
        // 循环遍历每个option元素，然后在citySelect中移除
        while (optionEleList.length > 1) {//子元素的个数如果大于1就循环，等于1就不循环了！
            citySelect.removeChild(optionEleList[1]);//总是删除1下标，因为1删除了，2就变成1了！
        }

        for ( var i = 0; i < data.length; i++) {
            var op = document.createElement("option");//创建一个指名名称元素
            op.value = data[i].name;//设置op的实际值为当前的省份名称
            var textNode = document.createTextNode(data[i].name);//创建文本节点
            op.appendChild(textNode);//把文本子节点添加到op元素中，指定其显示值

            document.getElementById("c").appendChild(op);
        }
    }
</script><html>
<head>
    <title>Title</title>
</head>
<body>

<center>
  <fieldset>
      <legend>添加收获地址</legend>

      <form action="/addAddress?userNum=${user.userNum}" method="post">
          会员编号:<input type="text" name="username" value="${user.userNum}" readonly="readonly">
          <br>
          省:<select name="province" id="p" onchange="city()">
              <option>===请选择省===</option>
          </select>
          <br>
          地市:<select name="city" id="c">
              <option>===请选择市===</option>
          </select>
          <br>
          详细地址:<textarea class="form-control" rows="3" name="addressDetail"></textarea>
          <br>
          是否主收获地址<input type="checkbox" name="isOften">
            是否可用<input type="checkbox" name="isUsed">
          <br><br>

          <button type="submit" class="btn btn-info">添加</button>
          <button type="reset" class="btn btn-info">重置</button>
      </form>
  </fieldset>
</center>
</body>
</html>
