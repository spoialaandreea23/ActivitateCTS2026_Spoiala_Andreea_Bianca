package ro.ase.cts.simpleFactory2.tipuriSupe;

public class Vita implements Supe {
    private int nrKcal;
    private int cantitate;

    public Vita(int nrKcal, int cantitate) {
        this.nrKcal = nrKcal;
        this.cantitate = cantitate;
    }

    @Override
    public void afisareTipSupa(){
        StringBuilder sb=new StringBuilder();
        sb.append(" Supa de vita are ").append(nrKcal).append(" calorii si ").append(cantitate).append( "grame.");
        System.out.println(sb.toString());
    }
}
