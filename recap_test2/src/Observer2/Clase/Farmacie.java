package Observer2.Clase;

import Observer2.Clase.IClient;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements IFarmacie{
    List<IClient> clienti;

    public Farmacie() {
        this.clienti = new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IClient client : clienti){
            client.receptioneazaNotificare(mesaj);
        }
    }

    @Override
    public void dezaboneazaClient(IClient client) {
    clienti.remove(client);
    }

    @Override
    public void aboneazaClient(IClient client) {
    clienti.add(client);
    }

    public void ofertaPret(){ trimiteNotificare("Avem o noua oferta la medicament!");}
}
