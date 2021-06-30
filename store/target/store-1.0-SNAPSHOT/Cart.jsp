<%@ page import="Model.Cart" %>
<%@ page import="Model.DBData" %>
<%@ page import="Model.Item" %>
<%@ page import="java.util.HashSet" %>
<%@ page import="java.math.BigDecimal" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<%
    BigDecimal price = new BigDecimal(0);
    Cart cart = (Cart) session.getAttribute("Cart");
    DBData dm = (DBData) application.getAttribute("DBData");
    HashSet<Item> items = dm.getItems(cart.getItemIDs());
%>
<head>
    <title>Shopping Cart</title>
</head>
<body>
    <h1>Shopping Cart</h1>

    <form action="CartServlet" method="post">
            <%
                for (Item item : items) {
                    int quantityOfItems = cart.getCount(item.id);
                    price = price.add(item.price.multiply(new BigDecimal(quantityOfItems)));
                    out.println("<li> <input type ='number' value='" + quantityOfItems
                            + "' name='" + item.id
                            + "'>" + item.name + ","
                            + " " + item.price + "</li>");
                }
            %>
        Total: $ <%= price %> <input type="submit" value="Update Cart"/>
    </form>
    <a href="index.jsp">Continue shopping</a>

</body>
</html>
