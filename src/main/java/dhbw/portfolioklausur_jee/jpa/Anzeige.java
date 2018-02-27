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
import lombok.Data;

/**
 *
 * @author Christian
 */

@Data
@Entity
public class Anzeige implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private AngebotArt angebotArt;
    private String titel;
    private String beschreibung;
    private Date erstellungsdatum;
    private Date onlineBis;
    private double preisvorstellung;
    private PreisArt preisArt;
    private int plz;
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
