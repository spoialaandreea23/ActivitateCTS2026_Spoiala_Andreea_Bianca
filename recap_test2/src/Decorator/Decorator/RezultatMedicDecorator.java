package Decorator.Decorator;

import Decorator.Clase.RezultatMedic;
import Decorator.Clase.RezultatPrintat;

public abstract class RezultatMedicDecorator implements RezultatMedic {
    private RezultatMedic rezultatMedic;

    public RezultatMedicDecorator(RezultatMedic rezultatMedic) {
        this.rezultatMedic = rezultatMedic;
    }

    @Override
    public void rezultat() {
        rezultatMedic.rezultat();
    }

}
