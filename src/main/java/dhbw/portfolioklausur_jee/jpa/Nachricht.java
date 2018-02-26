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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Christian
 */
@Entity(name = "Nachricht")
public class Nachricht implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private long id;
    @Column(name="Von Benutzer")
    private Benutzer vonBenutzer;
    @Column(name="An Benutzer")
    private Benutzer anBenutzer;
    @Column(name="Zu Artikel")
    private Anzeige zuArtikel;
    @Column(name="Text")
    private String text;
    
    @ManyToOne
    Benutzer benutzer = new Benutzer();
    
    //Konstruktor
    //Getter + Setter
}
