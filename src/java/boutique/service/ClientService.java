/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.service;

import boutique.dao.ClientDAO;
import boutique.entity.Client;
import java.util.List;

/**
 * @author Mama
 */
public class ClientService {
    
    ClientDAO clientDAO = new ClientDAO();
    
    public void ajouter(Client c) {
        clientDAO.ajouter(c);
    }
    
    public List<Client> findAll(){
        return clientDAO.findAll();
    }

    public void supprimer(Long id) {
        clientDAO.supprimer(id);
    }
}
