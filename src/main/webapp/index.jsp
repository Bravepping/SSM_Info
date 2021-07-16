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
    <title>SSM信息登记</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" />

</head>
<body>
<form action="${pageContext.request.contextPath}/infos/insert" method="post">
    <div class="form-structor">
        <div class="signup">
            <h2 class="form-title" id="signup">信息登记表</h2>
            <div class="form-holder">
                <input type="text" class="input" placeholder="编号" name="card" />
                <input type="text" class="input" placeholder="姓名" name="name"/>
                <input type="text" class="input" placeholder="年龄" name="age" />
                <input type="text" class="input" placeholder="地址" name="tress" />
            </div>
            <button class="submit-btn" type="submit" onclick="res()">登记</button>
        </div>
        <div class="login slide-up">
            <div class="center">
<%--                <h2 class="form-title" id="login"><span>或</span>登录</h2>--%>
<%--                <div class="form-holder">--%>
<%--                    <input type="email" class="input" placeholder="邮箱" />--%>
<%--                    <input type="password" class="input" placeholder="密码" />--%>
<%--                </div>--%>
<%--                <button class="submit-btn">登录</button>--%>
                <h4 align="center">${msg}</h4>
            </div>
        </div>
    </div>
</form>


<script src="${pageContext.request.contextPath}/js/script.js"></script>

</body>
</html>
