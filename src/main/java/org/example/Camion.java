package org.example;

public class Camion extends Vehicule {
    int CapaciteChargement;

    public Camion(int id, String modele, int automieBatterie,int CapaciteChargement) {
        super(id, modele, automieBatterie);
        this.CapaciteChargement =CapaciteChargement;


    }
    public String toString(){
        return "Camion " + super.toString() + "CapaciteChargement "+CapaciteChargement;
    }
}
