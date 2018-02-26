/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.portfolioklausur_jee.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Christian
 */
@Entity(name = "Benutzer")
public class Benutzer implements Serializable {

    @Id
    @Column(name = "Benutzername")
    private String benutzername;
    @Column(name = "Passwort Hash")
    private String passwordHash;
    @Column(name = "Vorname")
    private String vorname;
    @Column(name = "Nachname")
    private String nachname;
    @Column(name = "Straße")
    private String strasse;
    @Column(name = "Hausnummer")
    private int hausnr;
    @Column(name = "Postleitzahl")
    private int plz;
    @Column(name = "Ort")
    private String ort;
    @Column(name = "Land")
    private String land;
    @Column(name = "E-Mail")
    private String email;
    @Column(name = "Telefonnummer")
    private String telefonnr;

    @OneToMany
    List<Anzeige> anzeigenVeroeffentlicht = new ArrayList<>();
    
    @ManyToMany
    List<Anzeige> anzeigenMerktSich = new ArrayList<>();
    
    @OneToMany
    List<Nachricht> nachrichten = new ArrayList<>();
    
    //Konstruktor
    //Getter + Setter
    
}
