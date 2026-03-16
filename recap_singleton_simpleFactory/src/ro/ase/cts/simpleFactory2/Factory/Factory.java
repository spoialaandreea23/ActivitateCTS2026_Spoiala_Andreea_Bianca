package ro.ase.cts.simpleFactory2.Factory;

import ro.ase.cts.simpleFactory2.tipuriSupe.*;

public class Factory {
    public Supe getTipSupa(TipuriSupe tip, int nrKcal, int cantitate){
        switch (tip)
        {
            case TipuriSupe.CIUPERCI -> { return new Ciuperci(nrKcal,cantitate);}
            case TipuriSupe.VITA -> {return new Vita(nrKcal,cantitate);}
            case TipuriSupe.LEGUME -> {return new Legume(nrKcal,cantitate);}

            default -> {return null;}
            }
        }
    }

