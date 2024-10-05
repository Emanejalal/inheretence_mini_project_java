package org.example;

public class Scotter extends Vehicule{
    boolean besoinPermis;
    public Scotter(int id, String modele, int automieBatterie,boolean besoinPermis) {
        super(id, modele, automieBatterie);
        this.besoinPermis = besoinPermis;
    }
    public String toString(){
        return "Scotter " + super.toString() + " besoinPermis: " + besoinPermis;
    }
}
