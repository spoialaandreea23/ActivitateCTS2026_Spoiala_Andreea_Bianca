package Composite2.Main;

import Composite2.Clase.Structura;
import Composite2.Clase.StructuraGrupata;
import Composite2.Clase.Virus;

public class main {
    static void main(String[] args) {
        Structura virus=new Virus("coronaVirus");
        Structura virus1=new Virus("hentavirus");
        Structura structura=new StructuraGrupata("Romania");
        ((StructuraGrupata)structura).adaugaStructura(virus1);
        ((StructuraGrupata)structura).adaugaStructura(virus);
        structura.afiseazaDetalii(" ");
    }
}
