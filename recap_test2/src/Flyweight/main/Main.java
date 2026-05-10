package Flyweight.main;

import Flyweight.clase.Internare;
import Flyweight.clase.Pacient;
import Flyweight.clase.RegistruPacienti;

public class Main {
    public static void main(String[] args) {
        RegistruPacienti registruPacienti=new RegistruPacienti();
        Pacient pacient=new Pacient("Str. Vlad Tepes", "123456789", "Irinel");
        Internare internare=new Internare(1,1,4);
        pacient.afiseazaInternare(internare);
        registruPacienti.getPacient("Str. Vlad Tepes", "123456789", "Irinel").afiseazaInternare(internare);
        registruPacienti.getPacient("Str. Mihai Bravu", "123456789", "Bianca").afiseazaInternare(internare);
        registruPacienti.getPacient("Str. Vladuts", "1234567890", "Bianca").afiseazaInternare(internare);

    }
}
