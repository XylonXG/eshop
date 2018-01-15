<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2018/1/4
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>判断用户的类型</title>
</head>
<body>
<c:choose>
    <c:when test="${user.username eq 'zhangsan'}">
        ;
    </c:when>
    <c:otherwise>
        windows.location.href="/index.jsp";
    </c:otherwise>
</c:choose>
</body>
</html>
