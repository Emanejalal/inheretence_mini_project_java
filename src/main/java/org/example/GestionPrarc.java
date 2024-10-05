package org.example;

import java.util.ArrayList;

public class GestionPrarc {
    private ArrayList<Vehicule> ListeVehicules;
    private ArrayList<Client> ListeClients;
    public GestionPrarc() {
         ListeVehicules = new ArrayList<>();
         ListeClients = new ArrayList<>();
    }

    public void AjouterVehicule(Vehicule vehicule) {
        ListeVehicules.add(vehicule);
    }
    public void AjouterClient(Client client) {
        ListeClients.add(client);
    }
    public void affecterVehiculeAClient(Client client, int idV) {
            client.louerVehicule(ListeVehicules.get(idV));

    }

    public void retournerVehicule(Client client) {
        client.retournerVehicule(client.getVehiculeloue());

    }
}



