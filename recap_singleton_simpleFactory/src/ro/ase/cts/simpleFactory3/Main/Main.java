package ro.ase.cts.simpleFactory3.Main;

import ro.ase.cts.simpleFactory3.Animale.TipAnimal;
import ro.ase.cts.simpleFactory3.Factory.Factory;
import ro.ase.cts.simpleFactory3.Animale.TipuriAnimale;

public class Main {
    public static void main(String[] args){

        Factory animal= new Factory();
        TipuriAnimale caine=animal.getTipAnimal(TipAnimal.Caine, "Max", 5);
        caine.afisareTipAnimal();
        TipuriAnimale caine1=animal.getTipAnimal(TipAnimal.Caine, "Leyla", 3);
        caine1.afisareTipAnimal();


    }
}
