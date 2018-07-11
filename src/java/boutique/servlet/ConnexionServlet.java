/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.servlet;

import boutique.entity.Client;
import boutique.service.ClientService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/ConnexionServlet"})
public class ConnexionServlet extends HttpServlet {
    
    ClientService clientService = new ClientService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("template/connexion.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String login = req.getParameter("login");
        String pass = req.getParameter("password");
        
        Client client = clientService.checkIdentifiants(login,pass);
        
        if (client != null){
            
            req.getSession().setAttribute("login", login);
            req.getSession().setAttribute("pass", pass);
            
            resp.sendRedirect("affiche-template");
        }
        else
            resp.sendRedirect("ConnexionServlet");
   
    }
    
    
    
}
