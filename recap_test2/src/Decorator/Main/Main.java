package Decorator.Main;

import Decorator.Clase.RezultatMedic;
import Decorator.Clase.RezultatPrintat;
import Decorator.Decorator.RezultatOnline;

public class Main {
    public static void main(String[] args) {
        RezultatMedic rezultatMedic=new RezultatPrintat("Stabil", "Ion");
        rezultatMedic.rezultat();
        RezultatMedic rezultatMedic1=new RezultatOnline(rezultatMedic);
        rezultatMedic1.rezultat();
    }
}
