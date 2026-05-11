package observer.main;

import observer.clase.ISpital;
import observer.clase.Pacient;
import observer.clase.PacientAbonat;
import observer.clase.Spital;

public class main {
    public static void main(String[] args) {
        Pacient pacient1=new PacientAbonat("Andreea",22);
        Pacient pacient2=new PacientAbonat("Daniela",22);
        Pacient pacient3=new PacientAbonat("Denis",12);

        ISpital spital=new Spital("Militar");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);


        ((Spital)spital).notificaEpidemie();
        System.out.println("\n-------------\n");
        spital.dezaboneazaPacient(pacient2);
        ((Spital)spital).notificaVirus();


    }
}
