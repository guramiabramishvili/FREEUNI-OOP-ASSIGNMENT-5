package Servlets;

import Model.AccountManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Register", value = "/Register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("pass");
        AccountManager accountManager = (AccountManager)getServletContext().getAttribute("accounts");
        if(!accountManager.isRegistered(username)){
            accountManager.register(username,password);
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request,response);
        }
        else if(username != null && password != null){
            RequestDispatcher rd = request.getRequestDispatcher("already_registered.jsp");
            rd.forward(request,response);
        }else{
            RequestDispatcher rd = request.getRequestDispatcher("wrong_credentials.jsp");
            rd.forward(request,response);
        }
    }
}
