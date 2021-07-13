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
    <a href="<c:url value="/infos/findall"/>">查询所有信息</a><br>

    <form action="<c:url value="/infos/findbyid"/>" method="post">
        编号：<input type="text" name="card">
        <input type="submit" value="查询">
    </form>
</div>

</body>
</html>
