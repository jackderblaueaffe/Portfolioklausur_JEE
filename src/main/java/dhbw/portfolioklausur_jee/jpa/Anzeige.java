/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.portfolioklausur_jee.jpa;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Christian
 */
@Entity(name = "Anzeige")
public class Anzeige implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private long id;
    @Column(name = "Art")
    private AngebotArt angebotArt;
    @Column(name = "Titel")
    private String titel;
    @Column(name = "Beschreibung")
    private String beschreibung;
    @Column(name = "Erstellungsdatum")
    private Date erstellungsdatum;
    @Column(name = "Online bis")
    private Date onlineBis;
    @Column(name = "Preisvorstellung")
    private double preisvorstellung;
    @Column(name = "Art des Preises")
    private PreisArt preisArt;
    @Column(name = "Postleitzahl")
    private int plz;
    @Column(name = "Ort")
    private String ort;

    @ManyToOne
    Benutzer benutzerVeroeffentlicht = new Benutzer();
    
    @ManyToMany(mappedBy="anzeigenMerktSich")
    List<Benutzer> benutzerMerktSich = new ArrayList<>();
    
    @ManyToMany
    List<Kategorie> kategorien = new ArrayList<>();
    
    @OneToMany
    List<Foto> fotos = new ArrayList<>();
    
    //Konstruktor
    //Getter + Setter
}
