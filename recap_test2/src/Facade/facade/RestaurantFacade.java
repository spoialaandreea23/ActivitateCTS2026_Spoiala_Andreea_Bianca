package Facade.facade;

import Facade.clase.VerificareMasaDebarasata;
import Facade.clase.VerificareMasaLibera;
import Facade.clase.VerificareServetele;

public class RestaurantFacade {
    private VerificareMasaLibera verificareMasaLibera;
    private VerificareMasaDebarasata verificareMasaDebarasata;
    private VerificareServetele verificareServetele;

    public RestaurantFacade(VerificareMasaLibera verificareMasaLibera, VerificareMasaDebarasata verificareMasaDebarasata, VerificareServetele verificareServetele) {
        this.verificareMasaLibera = verificareMasaLibera;
        this.verificareMasaDebarasata = verificareMasaDebarasata;
        this.verificareServetele = verificareServetele;
    }

    public void rezervareMasa() {
        int k = 0;
        int i=0;
        while (k == 0 && i<25)
             {
                if (verificareMasaLibera.suntMeseLibere(i) != -1) {
                    if (verificareMasaDebarasata.suntMeseDebarasate(i) != -1) {
                        if (verificareServetele.suntServetele(i) != -1) {
                            System.out.println("Avem masa pregatita: masa= " + i);
                            k = 1;

                        } else System.out.println("Masa " + i + " libera nu are servetele pregatite");
                    } else System.out.println("Masa " + i + " nu a fost debarasata");

                } else System.out.println("Masa " + i + " nu este libera.");
                i++;
            }
    }
}
