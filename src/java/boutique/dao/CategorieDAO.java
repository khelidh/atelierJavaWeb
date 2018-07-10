/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.dao;

import boutique.entity.Categorie;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class CategorieDAO {
    
    public void ajouter(Categorie categorie){
         EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
         
         em.getTransaction().begin();
         
         em.persist(categorie);
         
         em.getTransaction().commit();
    }

    public List<Categorie> findAll() {
        
        String requete = "SELECT c FROM Categorie c";
        
        Query query = Persistence.createEntityManagerFactory("PU").createEntityManager().createQuery(requete);
        
        return query.getResultList();
    }
    
    
    
}
