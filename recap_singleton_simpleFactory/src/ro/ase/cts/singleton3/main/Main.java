package ro.ase.cts.singleton3.main;

import ro.ase.cts.singleton3.clase.Logger;

public class Main {
    public static void main(String[] args) {

        Logger instance= Logger.getInstance("Android", " telefoane");
        instance.afisareLogger("eroare");
        instance.afisareLogger("eroare1");
        Logger instance2= Logger.getInstance("IOS", "Iphone");
        instance.afisareLogger("eroare");
    }
}
