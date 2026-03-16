package ro.ase.cts.singleton2.main;

import ro.ase.cts.singleton.clase.Logger;
import ro.ase.cts.singleton2.clase.ConfigurationManager;

public class main {
    public static void main(String[] args) {

        ConfigurationManager instance= ConfigurationManager.getInstance("Facebook", "2");
        instance.afisareConfigurationManager("este actualizat");
        ConfigurationManager instance2= ConfigurationManager.getInstance("Instagram", "3");
        instance2.afisareConfigurationManager("actualizat");


    }
}
