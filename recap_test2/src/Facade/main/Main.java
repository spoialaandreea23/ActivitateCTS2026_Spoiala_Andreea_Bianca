package Facade.main;

import Facade.clase.VerificareMasaDebarasata;
import Facade.clase.VerificareMasaLibera;
import Facade.clase.VerificareServetele;
import Facade.facade.RestaurantFacade;
import Proxy.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        VerificareMasaLibera verificareMasaLibera=new VerificareMasaLibera();
        VerificareMasaDebarasata verificareMasaDebarasata=new VerificareMasaDebarasata();
        VerificareServetele verificareServetele=new VerificareServetele();
        RestaurantFacade restaurantFacade=new RestaurantFacade(verificareMasaLibera,verificareMasaDebarasata,verificareServetele);
        restaurantFacade.rezervareMasa();
    }
}
