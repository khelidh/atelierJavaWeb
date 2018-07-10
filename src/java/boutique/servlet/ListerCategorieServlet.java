/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.servlet;

import boutique.entity.Categorie;
import boutique.service.CategorieService;
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
@WebServlet(name = "ListerCategorie", urlPatterns = {"/lister-categorie"})
public class ListerCategorieServlet extends HttpServlet {
    
    private CategorieService categorieService = new CategorieService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Categorie> categories = categorieService.findAll();
        
        
        req.setAttribute("listeCat", categories);
        req.getRequestDispatcher("lister-categorie.jsp").forward(req, resp);
    }
    
    
    
    
}
