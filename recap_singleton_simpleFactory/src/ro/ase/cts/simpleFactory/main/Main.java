package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.Factory.Factory;
import ro.ase.cts.simpleFactory.personalSpital.PersonalSpital;
import ro.ase.cts.simpleFactory.personalSpital.TipPersonal;

public class Main {
    public static void main(String[] args)
    {
        Factory spital=new Factory();
        PersonalSpital medic= spital.getTipPersonal(TipPersonal.MEDIC, "Eliza", " 2");
        medic.afisareTipPersonal();

        PersonalSpital asistent= spital.getTipPersonal(TipPersonal.ASISTENT, "Andra", "3");
        asistent.afisareTipPersonal();
    }
}
