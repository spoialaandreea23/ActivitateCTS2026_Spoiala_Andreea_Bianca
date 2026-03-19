package ro.ase.cts.main;

import ro.ase.cts.clase.IRezervare;
import ro.ase.cts.clase.Rezervare;

public class main {
    static void main(String[] args) {
        Rezervare rezervare=new Rezervare("Eze", 21, 3, "3333333333333338");
        Rezervare rezervare1=(Rezervare) rezervare.copiaza();
    }

}
