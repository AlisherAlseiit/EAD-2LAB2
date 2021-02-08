<%--
  Created by IntelliJ IDEA.
  User: Алишер
  Date: 08/02/2021
  Time: 15:35
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
        <div class="register-switch" required = "true">
            <input type="radio" name="sex" value="F" id="sex_f" class="register-switch-input" checked>
            <label for="sex_f" class="register-switch-label">Female</label>
            <input type="radio" name="sex" value="M" id="sex_m" class="register-switch-input">
            <label for="sex_m" class="register-switch-label">Male</label>
        </div>
        <input type="email" class="register-input" placeholder="Email address" name="email" required = "true">
        <input type="password" class="register-input" placeholder="Password" name="password" required = "true">
        <input type="firstName" class="register-input" placeholder="first Name" required = "true">
        <input type="lastName" class="register-input" placeholder="last Name" required = "true">
        <input type="submit" value="Create Account" class="register-button" required = "true">
    </form>
</body>
</html>
