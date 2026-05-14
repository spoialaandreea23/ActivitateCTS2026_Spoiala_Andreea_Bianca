package ChainOfResponsabilIty2.Main;

import ChainOfResponsabilIty2.Clase.Alerta;
import ChainOfResponsabilIty2.Clase.Broker;
import ChainOfResponsabilIty2.Clase.CEO;
import ChainOfResponsabilIty2.Clase.Manager;

public class Main {
    public static void main(String[] args) {
        Alerta alerta=new Alerta(7);
        Broker broker=new Broker();
        CEO ceo=new CEO();
        Manager manager=new Manager();
        broker.setSuccesor(manager);
        manager.setSuccesor(ceo);

        manager.trimiteNotificare(alerta,"CASA");
    }
}
