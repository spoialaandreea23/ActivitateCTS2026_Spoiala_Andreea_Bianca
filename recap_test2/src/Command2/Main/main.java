package Command2.Main;

import Command2.Pachete.AjutorFarmacist;
import Command2.Pachete.ComandaAduce;
import Command2.Pachete.Farmacist;
import Command2.Pachete.IComanda;

public class main {
    static void main(String[] args) {
        AjutorFarmacist ajutorFarmacist=new AjutorFarmacist("Alessia");
        IComanda comanda=new ComandaAduce(ajutorFarmacist, "Zinerit");
        comanda.executa();
        Farmacist farmacist=new Farmacist();
        farmacist.setComanda(comanda);
        farmacist.trimiteComanda(comanda);
    }
}
