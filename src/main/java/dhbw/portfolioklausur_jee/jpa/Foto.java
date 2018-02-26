/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.portfolioklausur_jee.jpa;

import java.io.Serializable;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Christian
 */
@Entity(name = "Foto")
public class Foto implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private long id;
    @Column(name = "Bezeichnung")
    private String bezeichnung;
    @Lob
    @Column(name = "Bilddaten")
    private byte[] bilddaten; // https://javabydeveloper.com/save-image-working-large-objects/
    
    @ManyToOne
    Anzeige anzeige = new Anzeige();
    
    
    
    //Konstruktor
    //Getter + Setter
}
