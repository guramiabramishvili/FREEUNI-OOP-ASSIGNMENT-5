<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29-Jun-21
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information Incorrect</title>
</head>
<body>
    <h1>Please Try Again</h1>

    <p>Either your username or password is incorrect. Please try Again</p>

    <form action="login" method="post">
        User Name: <input type="text" name="username"/> <br/>
        Password: <input type="text" name="pass"/>
        <input type="submit" value="login"/>
    </form>
    <a href="register.jsp">Create New Account</a>
</body>
</html>
