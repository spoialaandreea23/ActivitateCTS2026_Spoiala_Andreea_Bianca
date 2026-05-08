package Proxy.proxy;

import Proxy.clase.Client;
import Proxy.clase.IRestaurant;
import Proxy.clase.Restaurant;

public class proxy implements IRestaurant {
 private IRestaurant restaurant;

    public proxy(IRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezervareClient(Client client) {
        if(client.getNrPersoane()>=4)
            restaurant.rezervareClient(client);

        else System.out.println("Puteti merge direct la locatie. Nu putem face rezervare");
    }
}
