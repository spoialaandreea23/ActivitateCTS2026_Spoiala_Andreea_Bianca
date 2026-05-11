package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;
    List<Client> clienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String text) {
        System.out.println("De la restaurantul: "+ nume);
        for(Client client: clienti){
           client.receptioneazaNotificare(text);
        }
    }

    @Override
    public void aboneazaClient(Client client) {
        clienti.add(client);
    }

    @Override
    public void dezaboneazaClient(Client client) {
    clienti.remove(client);
    }

    public void ofertaPret(){
        trimiteMesaj("Avem o oferta noua!");
    }

    public  void  introducereMeniu(){

        trimiteMesaj("Avem un meniu nou!");
    }
}
