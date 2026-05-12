package Strategy2.Main;

import Strategy2.Clase.*;

import java.util.ArrayList;
import java.util.List;

public class main {
    static void main(String[] args) {
        List<Produs> produsList=new ArrayList<>();
        Produs produs1=new Produs("Lapte", 20, 4);
        Produs produs2=new Produs("Malai", 14, 0);
        Produs produs3=new Produs("Faina", 5, 5);
        Produs produs4=new Produs("Apa", 7, 0);
        produsList.add(produs1);
        produsList.add(produs2);
        produsList.add(produs3);
        produsList.add(produs4);

//        PretOrdineCrescatoare pretOrdineCrescatoare=new PretOrdineCrescatoare();
//        pretOrdineCrescatoare.selecteazaListaProduse(produsList);
//        PretOrdineDescrescatoare pretOrdineDescrescatoare=new PretOrdineDescrescatoare();
//        pretOrdineDescrescatoare.selecteazaListaProduse(produsList);
        AfiseazaRecenzii afiseazaRecenzii=new AfiseazaRecenzii();
        afiseazaRecenzii.selecteazaListaProduse(produsList);


    }
}
