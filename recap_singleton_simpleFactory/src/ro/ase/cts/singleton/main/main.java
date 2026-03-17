package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.clase.Logger;

public class main {
    public static void main(String[] args) {

        Logger instance= Logger.getInstance("Interfata", "afisare");
        instance.afiseazaLogger("eroare1");

        Logger instance2= Logger.getInstance("Mama", "tata");
        instance2.afiseazaLogger("eroare");


    }
}
