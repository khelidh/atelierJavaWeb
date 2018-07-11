/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.dao;

import boutique.entity.Client;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class ClientDAO {
    
    
    public void ajouter(Client c){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
    
    public List<Client> findAll(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query = em.createQuery("SELECT c FROM Client c");
        return query.getResultList();
    }

    public void supprimer(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Client.class, id));
        
        //  1 seule requete au lieu de 2
//        em.createQuery("DELETE FROM Client c WHERE c.id=:idClient")
//                .setParameter("idClient", id).executeUpdate();
        
        
        em.getTransaction().commit();
    }

    public Client find(String login, String pass) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query = em.createQuery("SELECT c FROM Client c WHERE  c.login=:login AND c.pass=:pass")
                .setParameter("login", login).setParameter("pass", pass);
       
            return (Client) query.getSingleResult(); 
    }
    
    
}
