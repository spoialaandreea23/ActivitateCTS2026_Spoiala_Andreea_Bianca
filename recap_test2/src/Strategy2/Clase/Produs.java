package Strategy2.Clase;

import java.util.ArrayList;
import java.util.List;

public class Produs {
    private String numeProdus;
    private float pret;
    private int nrRecenzii;
    private IProdus produs;

    public Produs(String numeProdus, float pret, int nrRecenzii) {
        this.numeProdus = numeProdus;
        this.pret = pret;
        this.nrRecenzii = nrRecenzii;
        this.produs = new PretOrdineCrescatoare();
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public float getPret() {
        return pret;
    }

    public IProdus getProdus() {
        return produs;
    }

    public int getNrRecenzii() {
        return nrRecenzii;
    }

    public void setProdus(IProdus produs) {
        this.produs = produs;
    }

    public void sorteaza(List<Produs> produs1){
        produs.selecteazaListaProduse(produs1);
    }
}
