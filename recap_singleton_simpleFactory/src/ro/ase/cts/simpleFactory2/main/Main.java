package ro.ase.cts.simpleFactory2.main;



import ro.ase.cts.simpleFactory2.Factory.Factory;
import ro.ase.cts.simpleFactory2.tipuriSupe.Supe;
import ro.ase.cts.simpleFactory2.tipuriSupe.TipuriSupe;
public class Main {
    public static void main(String[] args)
    {
        Factory supa=new Factory();
        Supe legume=supa.getTipSupa(TipuriSupe.LEGUME, 300, 600);
        legume.afisareTipSupa();

    }
}
