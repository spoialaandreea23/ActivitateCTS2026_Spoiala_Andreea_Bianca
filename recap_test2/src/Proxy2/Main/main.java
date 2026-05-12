package Proxy2.Main;

import Proxy2.Clase.ISpital;
import Proxy2.Clase.Spital;
import Proxy2.Clase.Vizitator;
import Proxy2.Proxy.ProxyCuAsigurare;

public class main {
    static void main(String[] args) {
        ISpital spital=new Spital("Floreasca");
        Vizitator vizitator=new Vizitator("Alessia", "Bianca",false, true);
        ProxyCuAsigurare proxyCuAsigurare=new ProxyCuAsigurare(spital);
        proxyCuAsigurare.accesVizitator(vizitator);
    }
}
