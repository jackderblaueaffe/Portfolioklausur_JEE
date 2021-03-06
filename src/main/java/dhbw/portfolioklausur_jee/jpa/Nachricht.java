/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.portfolioklausur_jee.jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author Christian
 */
@Data
@Entity
public class Nachricht implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    
    @ManyToOne
    private Benutzer vonBenutzer;
    
    @ManyToOne
    private Benutzer anBenutzer;
    
    @ManyToOne
    private Anzeige zuArtikel;
    
    @Lob
    private String text;
    

    //Konstruktor
    //Getter + Setter
}
