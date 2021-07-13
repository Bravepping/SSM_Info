<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MrJping
  Date: 2021-07-13
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="${pageContext.request.contextPath}/admin/login" method="post">
        用户名：<input type="text" name="username"><br>
        密  码：<input type="password" name="password"><br>
        <input type="submit" value="登录">
    </form>
</div>

</body>
</html>
