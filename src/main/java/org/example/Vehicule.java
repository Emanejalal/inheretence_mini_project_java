package org.example;

public class Vehicule {
    private int id;
    private String modele;
    private int automieBatterie;
    private boolean estDiponible;
    public Vehicule(int id, String modele, int automieBatterie) {
        this.id = id;
        this.modele = modele;
        this.automieBatterie = automieBatterie;
        estDiponible = true;


    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public int getAutomieBatterie() {
        return automieBatterie;
    }
    public void setAutomieBatterie(int automieBatterie) {
        this.automieBatterie = automieBatterie;
    }
    public boolean isEstDiponible() {
        return estDiponible;
    }
    public void setEstDiponible(boolean estDiponible) {

    }
    public String toString() {
        return modele + " " + automieBatterie + " " + id+" "+estDiponible;
    }

}
