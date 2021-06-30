package Servlets;
import javax.servlet.*;
import javax.servlet.annotation.WebListener;

import Model.AccountManager;

@WebListener
public class servletListener implements ServletContextListener{
    public void contextInitialized(ServletContextEvent sce) {
        AccountManager acc = new AccountManager();
        ServletContext sv = sce.getServletContext();
        sv.setAttribute("accounts", acc);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }

}
