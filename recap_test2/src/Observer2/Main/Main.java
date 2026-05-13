package Observer2.Main;

import Observer2.Clase.ClientAbonat;
import Observer2.Clase.Farmacie;
import Observer2.Clase.IClient;
import Observer2.Clase.IFarmacie;

public class Main {
    public static void main(String[] args) {
        IClient client=new ClientAbonat("Alessia");
        IClient client1=new ClientAbonat("Bianca");

        IFarmacie farmacie=new Farmacie();

        farmacie.aboneazaClient(client);
        ((Farmacie)farmacie).ofertaPret();
    }
}
