package Strategy2.Clase;

import java.util.List;

public class AfiseazaRecenzii implements IProdus{
    public AfiseazaRecenzii() {
    }

    @Override
    public void selecteazaListaProduse(List<Produs> produse) {
        for(Produs produs: produse){
            if(produs.getNrRecenzii()>1)
            System.out.println(produs.getNumeProdus() + " "+ produs.getPret());
        }
    }
}
