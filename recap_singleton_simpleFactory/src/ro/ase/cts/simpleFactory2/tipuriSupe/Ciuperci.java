package ro.ase.cts.simpleFactory2.tipuriSupe;

public class Ciuperci implements Supe {
    private int nrKcal;
    private int cantitate;

    public Ciuperci(int nrCkal, int cantitate) {
        this.nrKcal = nrCkal;
        this.cantitate = cantitate;
    }

    @Override
    public void afisareTipSupa(){
        StringBuilder sb= new StringBuilder();
        sb.append(" Supa de ciuperci are ").append(nrKcal).append(" calorii si ").append(cantitate).append( "grame.");
        System.out.println(sb.toString());
    }
}
