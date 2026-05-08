package Adapter.Main;

import Adapter.Aplicatie_bar.AdapterPrintare;
import Adapter.Aplicatie_bucatarie.PrintareFacturaBucatarie;

public class Main {

    public static void main(String[] args) {

        PrintareFacturaBucatarie bucatarie =
                new PrintareFacturaBucatarie();

        AdapterPrintare adapter =
                new AdapterPrintare(bucatarie);

        adapter.printeazaFacutura();
    }
}