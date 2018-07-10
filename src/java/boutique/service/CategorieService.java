/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import boutique.dao.CategorieDAO;
import boutique.entity.Categorie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class CategorieService {
    
    CategorieDAO categorieDAO = new CategorieDAO();
    
    
    public void ajouterCategorie(Categorie categorie){
        categorieDAO.ajouter(categorie);
    }
    
    public List<Categorie> findAll(){
        return categorieDAO.findAll();
    }
    
    
}
