package Composite2.Clase;

import java.util.ArrayList;
import java.util.List;

public class StructuraGrupata implements Structura{
    private String numeTara;

    List<Structura> substructuri;

    public StructuraGrupata(String numeTara) {
        this.numeTara = numeTara;
        this.substructuri = new ArrayList<>();
    }

    @Override
    public void afiseazaDetalii(String text) {
        System.out.println("Tara: "+ numeTara);
        for(Structura structura:substructuri){
            structura.afiseazaDetalii(text+ " ");
        }
    }

    public void adaugaStructura(Structura structura){
        substructuri.add(structura);
    }
    public void stergeStructura(Structura structura){
        substructuri.remove(structura);
    }

    public void getStructura(int pozitie){
        substructuri.get(pozitie);
    }
}
