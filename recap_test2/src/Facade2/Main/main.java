package Facade2.Main;

import Facade2.Clase.Client;
import Facade2.Clase.Depozit;
import Facade2.Facade.Facade;

public class main {
    static void main(String[] args) {
        Client client=new Client("Alessia", true, true);
        Depozit depozit=new Depozit("Claritine", false);
        Facade facade=new Facade();
        facade.cumparaMedicament(client,depozit);
    }
}
