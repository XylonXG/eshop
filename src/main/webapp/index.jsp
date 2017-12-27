<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">

</script>
<html>
<head>
    <title>电商平台首页</title>
    <style type="text/css">
        #Container{
            width:1000px;
            margin:0 auto;/*设置整个容器在浏览器中水平居中*/
            background:#CF3;
            border: solid;
        }
        #Header{
            height:80px;
            border: solid;

        }
        #logo{
            padding-left:50px;
            padding-top:20px;
            padding-bottom:50px;

        }
        #Content{
            height:600px;
            /*此处对容器设置了高度，一般不建议对容器设置高度，一般使用overflow:auto;属性设置容器根据内容自适应高度，如果不指定高度或不设置自适应高度，容器将默认为1个字符高度，容器下方的布局元素（footer）设置margin-top:属性将无效*/
            margin-top:20px;/*此处讲解margin的用法，设置content与上面header元素之间的距离*/
            background:#0FF;

        }
        #Content-Left{
            height:400px;
            width:200px;
            margin:20px;/*设置元素跟其他元素的距离为20像素*/
            float:left;/*设置浮动，实现多列效果，div+Css布局中很重要的*/
            background-color: #7ab5d3;

        }
        #Content-Main{
            height:400px;
            width:720px;
            margin:20px;/*设置元素跟其他元素的距离为20像素*/
            float:left;/*设置浮动，实现多列效果，div+Css布局中很重要的*/
            background-color: #d0e9c6;


        }
        /*注：Content-Left和Content-Main元素是Content元素的子元素，两个元素使用了float:left;设置成两列，这个两个元素的宽度和这个两个元素设置的padding、margin的和一定不能大于父层Content元素的宽度，否则设置列将失败*/
        #Footer{
            height:40px;

            margin-top:20px;
        }
        .Clear{
            clear:both;
        }
    </style>
</head>
<body>
<div id="Container">
    <div id="Header">
        <div id="logo">
            <center><h2>电 商 平 台</h2></center>
            <br>
            <a href="/user/userLogin.jsp">登录</a>
            <a href="/user/userReg.jsp">注册</a>
            <a href="">完善个人信息</a>
        </div>
    </div>
    <div id="Content">
        <div id="Content-Left">

        </div>
        <div id="Content-Main">Content-Main</div>
    </div>
    <div class="Clear"><!--如何你上面用到float,下面布局开始前最好清除一下。--></div>
    <div id="Footer">Footer</div>
</div>
</body>
</html>
