<%@ page import="Model.DBData" %>
<%@ page import="Model.Item" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Students Store</title>
</head>
<body>
    <h1>Student Store</h1>
    <p>Items available:</p>
    <ul>
        <%
            DBData db = (DBData) application.getAttribute("DBData");
            try {
                for (Item item : db.getItems(null)) {
                    String id = item.id;
                    String name = item.name;
                    out.println(
                            "<li><a href=\"ItemPage.jsp?id=" + id + "\">" + name + "</a></li>"
                    );
                }
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        %>
    </ul>
</body>
</html>