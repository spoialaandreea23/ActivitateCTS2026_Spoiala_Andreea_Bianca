package Proxy.main;

import Proxy.clase.Pacient;
import Proxy.Proxy.ProxyCuAsigurare;
import Proxy.clase.Spital;

public class main {
    static void main(String[] args) {
        Pacient pacient=new Pacient("Andreea",false);
        Spital spital=new Spital("Militar");
        spital.interneazaPacient(pacient);

        ProxyCuAsigurare proxy=new ProxyCuAsigurare(spital);
        proxy.interneazaPacient(pacient);
    }
}
