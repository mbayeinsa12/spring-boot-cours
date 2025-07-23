package sn.edu.isepdiamniadio.coursspring.domain;

public class Ecole {

    private Long id;
    private String nom;
    private String adresse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString(){
        return "Ecole: "+this.nom+" Adresse: "+this.adresse;
    }
}
