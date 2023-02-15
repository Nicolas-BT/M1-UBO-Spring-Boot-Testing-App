package fr.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class T_GROUPE {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grp_id")
    private Integer id;      // Id du groupe
    @Column(name = "grp_nom")
    private String nom;   // Nom de/s l'artiste/s (séparés par des ',')
    @Column(name = "grp_prenom")
    private String prenom;// Prenom de/s l'artiste/s (séparés par des ',')
    @Column(name = "grp_pseudo")
    private String pseudo;// Nom du groupe
    @Column(name = "grp_ville")
    private String ville; // Ville d'origine du groupe
    @Column(name = "grp_age")
    private String age;   // Age de/s l'artiste/s (séparés par des ',')
    @Column(name = "grp_nb")
    private String nb;    // Nombre d'artistes dans le groupe
}
