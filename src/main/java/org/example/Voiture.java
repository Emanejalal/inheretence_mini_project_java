package org.example;

public class Voiture extends Vehicule{
    int nombrePortes;
    public Voiture(int id, String modele, int automieBatterie,int nombrePortes) {
        super(id, modele, automieBatterie);
        this.nombrePortes = nombrePortes;
    }
    public String toString(){
        return "Voiture " + super.toString() + " nombre portes " + nombrePortes;
    }
}
