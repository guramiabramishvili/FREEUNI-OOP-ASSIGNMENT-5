package Servlets;

import Model.Cart;
import com.sun.net.httpserver.HttpContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "CartServlet", value = "/CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("Cart");
        String id =  request.getParameter("itemID");

        if (id == null) {
            Enumeration<String> params = request.getParameterNames();
            Cart newCart = new Cart();

            while(params.hasMoreElements()){
                id = params.nextElement();
                newCart.addProduct(id, request.getParameter(id));
            }

            cart = newCart;
        } else {
            cart.addItem(id, 1);
        }

        session.setAttribute("Cart", cart);

        RequestDispatcher rd = request.getRequestDispatcher("Cart.jsp");
        rd.forward(request, response);
    }
}
