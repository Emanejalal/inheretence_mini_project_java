package org.example;

public class Client {
    private int id;
    private String name;
    private Vehicule vehiculeloue;
    public Client(int id, String name) {
        this.id = id;
        this.name = name;
        vehiculeloue = null;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Vehicule getVehiculeloue() {
        return vehiculeloue;

    }
    public void setVehiculeloue(Vehicule vehiculeloue) {
        this.vehiculeloue = vehiculeloue;
    }
    public void louerVehicule(Vehicule vehicule) {
        if (vehicule.isEstDiponible() == true) {
            System.out.println("Est diponible pour louer");
            this.vehiculeloue = vehicule;
            vehicule.setEstDiponible(false);
        }
        else {
            System.out.println("n\'est pas disponible");
        }
    }
    public void retournerVehicule(Vehicule vehicule) {
        vehicule.setEstDiponible(true);
    }
    public String toString() {
        return id + " " + name + " " + vehiculeloue;
    }


}
