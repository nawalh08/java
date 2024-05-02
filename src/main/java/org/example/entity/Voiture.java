package org.example.entity;



public class Voiture {
    @Override
    public String toString() {
        return "Voiture{" +
                "nom='" + nom + '\'' +
                ", couleur='" + couleur + '\'' +
                ", position=" + position +
                '}';
    }

    private String nom;
    private String couleur;
    private int position;

    private Voiture(VoitureBuilder builder){
        couleur = builder.couleur;
        nom = builder.nom;
        position = builder.position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public static class VoitureBuilder extends AbstractVoitureBuilder{
        private String nom;
        private String couleur;
        private int position;

        public VoitureBuilder nom(String nom){
            this.nom = nom;
            return this;
        }

        public VoitureBuilder couleur(String couleur){
            this.couleur = couleur;
            return this;
        }

        public VoitureBuilder position(int position){
            this.position = position;
            return this;
        }

        public Voiture build() {
            return new Voiture(this);
        }


    }
}

