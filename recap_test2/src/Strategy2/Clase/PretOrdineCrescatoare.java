package Strategy2.Clase;

import java.util.Comparator;
import java.util.List;

public class PretOrdineCrescatoare implements IProdus{
    public PretOrdineCrescatoare() {
    }


    @Override
    public void selecteazaListaProduse(List<Produs> produse) {
      produse.sort(Comparator.comparing(Produs::getPret));
            for(Produs produs: produse){
                System.out.println(produs.getNumeProdus() + " "+ produs.getPret());
        }
    }
}
