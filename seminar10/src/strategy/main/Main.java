package strategy.main;

import strategy.clase.Client;
import strategy.clase.ModalitatePlata;
import strategy.clase.PlataCard;
import strategy.clase.PlataCash;

public class Main {
    static void main(String[] args) {
        Client client=new Client("Andreea");
        client.platesteTranzactie(250);

        ModalitatePlata modalitate1= new PlataCash();
        ModalitatePlata modalitate2=new PlataCard();
        client.setModalitateDePlata(modalitate2);
        client.platesteTranzactie(200);
        client.setModalitateDePlata(modalitate1);
        client.platesteTranzactie(100);
        client.platesteTranzactie(50);
    }
}
