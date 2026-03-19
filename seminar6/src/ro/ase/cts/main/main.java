package ro.ase.cts.main;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.clase.SupaCrema;
import ro.ase.cts.fabrici.*;

public class main {
    public static void main(String[] args) {

        FelDeMancareFabrica fabrica=new SupaFabrica();
        FelDeMancare supaCrema=fabrica.getFelDeMancare(TipSupa.SUPACREMA, 300, "legume")  ;
        FelDeMancare ciorba= fabrica.getFelDeMancare(TipSupa.CIORBA, 400, "legume");
        supaCrema.afiseaza();

        FelDeMancareFabrica fabrica1=new DesertFabrica();
        FelDeMancare papanasi=fabrica1.getFelDeMancare(TipDesert.PAPANASI,400, "ciocolata ");
        papanasi.afiseaza();
    }
}
