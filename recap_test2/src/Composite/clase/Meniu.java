package Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Meniu implements Structura {
    private String denumire;
    private List<Structura> subsectiuni;

    public Meniu(String denumire) {
        this.denumire = denumire;
        this.subsectiuni = new ArrayList<>();
    }

    @Override
    public void afiseazaDetalii(String text) {
        System.out.println(text+ "Denumire: "+ denumire);
        for (Structura structura: subsectiuni)
        {
            structura.afiseazaDetalii(text+" ");
        }
    }

    public void adaugaStructura(Structura structura){ subsectiuni.add(structura);}
    public void stergeStructura(Structura structura){ subsectiuni.remove(structura);}
    public void getStructura(int pozitie){ subsectiuni.get(pozitie);}
}
