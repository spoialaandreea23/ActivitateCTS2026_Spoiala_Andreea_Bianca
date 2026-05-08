package Proxy.clase;

public class Restaurant implements IRestaurant{
    private String locatie;

    public Restaurant(String locatie) {
        this.locatie = locatie;
    }

    @Override
    public void rezervareClient(Client client) {

           System.out.println("Clientul "+ client.getNume() + " are o rezervare de "+ client.getNrPersoane() + " persoane la restaurantul din "+ locatie);

    }
}
