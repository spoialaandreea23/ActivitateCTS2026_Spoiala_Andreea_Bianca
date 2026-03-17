package ro.ase.cts.simpleFactory3.Factory;

import ro.ase.cts.simpleFactory3.Animale.*;

public class Factory {

    public TipuriAnimale getTipAnimal(TipAnimal tip, String nume, int varsta ){
        switch (tip)
        {
            case TipAnimal.Pisica -> { return new Pisica(nume, varsta); }
            case TipAnimal.Caine -> {return new Caine(nume,varsta);}
            case TipAnimal.Peste -> {return new Peste(nume,varsta);}

            default -> {return null;}
            }

        }

    }


//getTipAnimal(Peste, "Victor", 3)
