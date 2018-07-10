/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.servlet;

import boutique.entity.Client;
import boutique.service.ClientService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ListerClientServlet", urlPatterns = {"/lister-client"})
public class ListerClientServlet extends HttpServlet {
    
    private ClientService clientService = new ClientService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Client> clients = clientService.findAll();
        
        req.setAttribute("clients", clients);
        
        req.getRequestDispatcher("lister-client.jsp").forward(req, resp);
    }

    
}
