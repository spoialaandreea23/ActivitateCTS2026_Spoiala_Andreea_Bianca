package Facade2.Facade;

import Facade2.Clase.Client;
import Facade2.Clase.Depozit;

public class Facade {
//    private Client client;
//    private Depozit depozit;
//
//    public Facade(Client client, Depozit depozit) {
//        this.client = client;
//        this.depozit = depozit;
//    }

    public void cumparaMedicament(Client client, Depozit depozit){
        if(client.isReteta()){
            if(depozit.isMedicament()){
                if(client.isCardDeSanatate()){
                    System.out.println("Se poate cumpara!");
                }
                else System.out.println("Nu are card!");
            }
            else System.out.println("Nu avem in stoc!");
        }
        else System.out.println("Pacientul nu are reteta!");
    }
}
