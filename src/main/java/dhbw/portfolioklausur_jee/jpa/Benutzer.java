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
import lombok.Data;

/**
 *
 * @author Christian
 */
@Data
@Entity
public class Benutzer implements Serializable {

    @Id
    private String benutzername;
    private String passwordHash;
    private String vorname;
    private String nachname;
    private String strasse;
    private int hausnr;
    private int plz;
    private String ort;
    private String land;
    private String email;
    private String telefonnr;

    @OneToMany
    List<Anzeige> anzeigenVeroeffentlicht = new ArrayList<>();

    @ManyToMany
    List<Anzeige> anzeigenMerktSich = new ArrayList<>();

    public Benutzer() {
    }
}
