package Servlets;

import Model.Cart;
import Model.DBData;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class ServletListener implements HttpSessionListener,ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        context.setAttribute("DBData", new DBData());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
       // Cookie c = new Cookie("test","value");
        httpSessionEvent.getSession().setAttribute("Cart", new Cart());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        HttpSessionListener.super.sessionDestroyed(httpSessionEvent);
    }

}


