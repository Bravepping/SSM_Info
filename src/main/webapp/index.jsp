<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MrJping
  Date: 2021-07-05
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>SSM信息登记表</title>

    <link rel="stylesheet" href="<c:url value="/css/style.css"/>" rel="stylesheet" />
</head>
<body>

<div class="form-structor">

    <div class="signup">
        <h2 class="form-title" id="signup"><span></span>信息登记表</h2>
        <div class="form-holder">
            <form action="${pageContext.request.contextPath}/infos/insert" method="post">
            <input type="text" name="card" class="input" placeholder="编号" />
            <input type="text" name="name" class="input" placeholder="姓名" />
            <input type="text" name="age" class="input" placeholder="年龄" />
            <input type="text" name="tress" class="input" placeholder="地址">
            <input type="submit" class="submit-btn" value="登记" onclick="register()">
            </form>
        </div>
        <h4 align="center">${msg}</h4>
    </div>

</div>
<script src="<c:url value="/js/script.js"/>"></script>
</body>
</html>
