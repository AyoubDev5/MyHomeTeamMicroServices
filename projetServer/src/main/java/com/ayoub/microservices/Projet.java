package com.ayoub.microservices;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.text.DateFormat;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Projet {
    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )
    private Integer id_projet;
    private Integer id_taches;
    private String nomProjet;
   /* private DateFormat dateDebut;
    private DateFormat dateFin;*/

    public Integer getId_projet() {
        return id_projet;
    }

    public Integer getId_taches() {
        return id_taches;
    }

    public String getNomProjet() {
        return nomProjet;
    }
    /*
    public DateFormat getDateDebut() {
        return dateDebut;
    }

    public DateFormat getDateFin() {
        return dateFin;
    }
    */
    public void setId_projet(Integer id_projet) {
        this.id_projet = id_projet;
    }

    public void setId_taches(Integer id_taches) {
        this.id_taches = id_taches;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }
    /*
    public void setDateDebut(DateFormat dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(DateFormat dateFin) {
        this.dateFin = dateFin;
    }
    */
}
