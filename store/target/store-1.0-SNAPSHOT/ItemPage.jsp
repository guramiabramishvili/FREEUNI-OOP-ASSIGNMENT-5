<%@ page import="Model.DBData" %>
<%@ page import="Model.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%  DBData db = (DBData) application.getAttribute("DBData");
    String id = request.getParameter("id");
    Item item = db.getSingleItem(id);
%>
<html>
<head>
    <title><%= item.name %></title>
</head>
<body>

    <h1><%= item.name %></h1>
    <img src = "<%= "./store-images/" + item.image%>">
    <form action="CartServlet" method="post">
        $<%= item.price %> <input name="itemID" type="hidden" value="<%= item.id %>"/>
        <input type="submit" value="Add to cart"/>
    </form>
</body>
</html>
