package Proxy.clase;

import Facade.clase.Pacient;

public class Spital {
    private String nume;

    public void interneazaPacient(Pacient pacient){
        System.out.println("Pacientul "+ pacient.getNume()+ " este internat in spitalul "+ this.nume);
    }
}
