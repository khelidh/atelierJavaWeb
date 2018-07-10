/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.servlet;

import boutique.entity.Categorie;
import boutique.service.CategorieService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "AjouterCategorieServlet", urlPatterns = {"/ajouter-categorie-servlet"})
public class AjouterCategorieServlet extends HttpServlet {
    
    private CategorieService categorieService = new CategorieService();
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomCategorie = "Horreur";
        
        req.setAttribute("nomCategorie", nomCategorie);
        
        req.getRequestDispatcher("AjouterCategorie.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomCategorie = req.getParameter("nom");
        
        Categorie categorie = new Categorie();
        categorie.setNom(nomCategorie);
        
        categorieService.ajouterCategorie(categorie);
        
        // Demander au navigateur de faire une req HTTP GET vers la route de listeCarServlet
        // 
        
        resp.sendRedirect("lister-categorie");
        
    }
    
    
    
    
}
