package Observer.main;

import Observer.clase.Client;
import Observer.clase.ClientAbonat;
import Observer.clase.IRestaurant;
import Observer.clase.Restaurant;

public class main {
    static void main(String[] args) {
        Client client=new ClientAbonat("Marius ");
        Client client1=new ClientAbonat("Andri");
        Client client2=new ClientAbonat("Alessia ");


    IRestaurant restaurant=new Restaurant("Towers");
        restaurant.aboneazaClient(client);
        restaurant.aboneazaClient(client2);

        ((Restaurant)restaurant).ofertaPret();
        restaurant.dezaboneazaClient(client);
        ((Restaurant)restaurant).introducereMeniu();


    }
}
