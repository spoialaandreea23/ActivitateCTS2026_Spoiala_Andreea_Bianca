package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.clase.Logger;

public class main {
    public static void main(String[] args) {

        Logger instance= Logger.getInstance("Interfata", "afisare");
        instance.afiseazaLogger("Fisierul nu a fost corect");
        instance.afiseazaLogger("eroare");

    }
}
