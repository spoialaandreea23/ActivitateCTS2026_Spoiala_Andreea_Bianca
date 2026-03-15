package ro.ase.cts.simpleFactory.Factory;

import ro.ase.cts.simpleFactory.personalSpital.*;

public class Factory {

    public PersonalSpital getTipPersonal(TipPersonal tip, String nume, String sectie){
        switch (tip)
        {
            case TipPersonal.ASISTENT -> {return new Asistent(nume,sectie);}
            case TipPersonal.BRANCARDIER -> {return new Brancardier(nume,sectie);}
            case TipPersonal.MEDIC -> {return  new Medic(nume, sectie);}

            default-> { return null;}
        }

            }
        }


