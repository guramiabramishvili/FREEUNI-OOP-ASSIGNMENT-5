<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29-Jun-21
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Welcome <%= request.getParameter("username")%> </title>
</head>
<body>
    <h1> Welcome <%= request.getParameter("username")%> </h1>
</body>
</html>
