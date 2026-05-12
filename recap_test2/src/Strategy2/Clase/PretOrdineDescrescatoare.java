package Strategy2.Clase;

import java.util.Comparator;
import java.util.List;

public class PretOrdineDescrescatoare implements IProdus{
    public PretOrdineDescrescatoare() {
    }
    @Override
    public void selecteazaListaProduse(List<Produs> produse) {
        produse.sort(Comparator.comparing(Produs::getPret).reversed());
        for(Produs produs: produse){
            System.out.println(produs.getNumeProdus() + " "+ produs.getPret());
        }
    }
}
