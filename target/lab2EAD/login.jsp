<%--
  Created by IntelliJ IDEA.
  User: Алишер
  Date: 08/02/2021
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="styles/main.css">
</head>
<body>
<form class="register" action="MainPage" method="GET">

    <input type="email" class="register-input" placeholder="Email address" name="email" required="true">
    <input type="password" class="register-input" placeholder="Password" name="password" required="true">
    <input type="submit" value="Login" class="register-button">
</form>
</body>
</html>
