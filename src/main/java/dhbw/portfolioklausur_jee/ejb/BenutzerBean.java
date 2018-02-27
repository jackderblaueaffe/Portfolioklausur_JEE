package dhbw.portfolioklausur_jee.ejb;


import dhbw.portfolioklausur_jee.jpa.Benutzer;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larau
 */
@Stateless
public class BenutzerBean extends EntityBean<Benutzer, String>{
    
    @PersistenceContext
    EntityManager em;

    public BenutzerBean() {
        super(Benutzer.class);
    }
     
    @PostConstruct
    public void blub(){
       //System.out.println("blub");
        em.find(Benutzer.class, 1L);
    }
   
    
}