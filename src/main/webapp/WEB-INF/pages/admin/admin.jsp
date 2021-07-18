<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MrJping
  Date: 2021-07-13
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <a href="<c:url value="/admin/findall"/>">查询所有信息</a><br>
    <h2>根据编号查询信息</h2>
    <form action="<c:url value="/admin/findbyid"/>" method="post">
        编号：<input type="text" name="card">
        <input type="submit" value="查询">
    </form>
</div>
<div align="center">
    <h2>根据编号修改信息</h2>
    <form action="${pageContext.request.contextPath}/admin/updatebyid" method="post">
        编号：<input type="text" name="card"><br>
        姓名：<input type="text" name="name"><br>
        年龄：<input type="text" name="age"><br>
        地址：<input type="text" name="tress"><br>
        <input type="submit" value="修改">
    </form>
</div>
<div align="center">
    <h2>根据编号删除信息</h2>
    <form action="${pageContext.request.contextPath}/admin/deletebyid" method="post">
        编号：<input type="text" name="card">
        <input type="submit" value="删除信息">
    </form>
</div>
</body>
</html>
