<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MrJping
  Date: 2021-07-13
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h3>${msg}</h3>
    <c:forEach items="${infos}" var="infos">
        ${infos.card}
        ${infos.name}
        ${infos.age}
        ${infos.tress}<br>
    </c:forEach>
</div>
</body>
</html>
