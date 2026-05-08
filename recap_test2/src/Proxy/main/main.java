package Proxy.main;

import Proxy.clase.Client;
import Proxy.clase.Restaurant;
import Proxy.proxy.proxy;

import java.lang.reflect.Proxy;

public class main {
    static void main(String[] args) {
        Client client=new Client("Bianca", 3);
        Restaurant restaurant=new Restaurant("Jiului");
        restaurant.rezervareClient(client);

        proxy proxy=new proxy(restaurant);
        proxy.rezervareClient(client);

    }
}
