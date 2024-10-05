package org.example;

public class Main {
    public static void main(String[] args) {
        Camion cam = new Camion(1,"volvo",98,125);
        Voiture voi = new Voiture(2,"BM",70,2);
        Scotter sco = new Scotter(3,"BMM",100,true);

        System.out.println(cam.toString());

    }
}