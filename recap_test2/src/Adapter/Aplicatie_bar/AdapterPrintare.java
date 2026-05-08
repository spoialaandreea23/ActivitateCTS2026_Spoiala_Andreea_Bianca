package Adapter.Aplicatie_bar;

import Adapter.Aplicatie_bucatarie.PrintareFacturaBucatarie;

public class AdapterPrintare extends  PrintareFacturaBar{
    private PrintareFacturaBucatarie printareFacturaBucatarie;

    public AdapterPrintare(PrintareFacturaBucatarie printareFacturaBucatarie) {
        this.printareFacturaBucatarie = printareFacturaBucatarie;
    }

    @Override
    public void printareFactura(){ printareFacturaBucatarie.tiparesteFacutura();}
}
