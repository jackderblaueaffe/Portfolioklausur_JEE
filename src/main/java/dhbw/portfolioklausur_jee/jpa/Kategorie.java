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

/**
 *
 * @author Christian
 */
@Entity(name = "Kategorie")
public class Kategorie implements Serializable {

    @Id
    @Column(name = "Slug")
    private String slug;
    @Column(name = "Name")
    private String name;
    
    @ManyToMany(mappedBy="kategorien")
    List<Anzeige> anzeigen = new ArrayList<>();
    
    //Konstruktor
    //Getter + Setter
}
