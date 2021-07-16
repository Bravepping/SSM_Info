<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MrJping
  Date: 2021-07-13
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>login UI</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Login.css">
</head>
<body>
<div class="box">
    <h2>简易信息管理系统登录</h2>
    <form action="${pageContext.request.contextPath}/admin/login" method="post">
        <div class="inputBox">
            <input type="text" name="username" required="">
            <label>用户名</label>
        </div>
        <div class="inputBox">
            <input type="password" name="password" required="">
            <label>密码</label>
        </div>
        <input type="submit" name="" value="登录">
    </form>
</div>
</body>
</html>
