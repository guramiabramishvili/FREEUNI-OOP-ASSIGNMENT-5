<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29-Jun-21
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
    <h1>Welcome to Homework 5</h1>

    <p>Please log in.</p>

    <form action="login" method="post">
        User Name: <input type="text" name="username"/> <br/>
        Password:  <input type="text" name="pass"/>
        <input type="submit" value="login"/>
    </form>

    <a href="register.jsp">Create New Account</a>
</body>
</html>
