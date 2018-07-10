
package boutique.servlet;

import boutique.entity.Client;
import boutique.service.ClientService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mama
 */
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends HttpServlet {
    ClientService clientService = new ClientService();
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("inscription.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String rue = req.getParameter("rue");
        
        Integer numero = Integer.parseInt(req.getParameter("numero"));
        Integer codePostal = Integer.parseInt(req.getParameter("codePostal"));
        
        
        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setRue(rue);
        client.setNumero(numero);
        client.setCodePostal(codePostal);
        
        clientService.ajouter(client);
        
        resp.sendRedirect("lister-client");
    }
    
    
    
    
    
    
    
    
}
