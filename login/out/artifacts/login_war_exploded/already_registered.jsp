<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29-Jun-21
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Account</title>
</head>
<body>
    <h1>The name <%=request.getParameter("username")%> is already registered </h1>
    <p>Please enter another name and password</p>
    <form action="Register" method="post">
    User Name: <input type="text" name="username"/> <br/>
    Password: <input type="text" name="pass"/>
    <input type="submit" value="login"/>
    </form>
</body>
</html>
