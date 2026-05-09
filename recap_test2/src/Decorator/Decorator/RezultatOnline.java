package Decorator.Decorator;

import Decorator.Clase.RezultatMedic;
import Decorator.Clase.RezultatPrintat;

public class RezultatOnline extends RezultatMedicDecorator{
    public RezultatOnline(RezultatMedic rezultatMedic) {
        super(rezultatMedic);
    }

    @Override
    public void rezultat() {
        super.rezultat();
        System.out.println("S-a trimis și pe platforma ONLINE rezultatul.");
    }

}
