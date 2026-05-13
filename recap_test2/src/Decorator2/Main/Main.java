package Decorator2.Main;

import Decorator2.Clase.BonDeCasa;
import Decorator2.Clase.BonDeCasaAbstract;
import Decorator2.Decorator.BonDeCasaDecorator;
import Decorator2.Decorator.BonDeCasaFelicitare;

public class Main {
    static void main(String[] args) {
        BonDeCasaAbstract bonDeCasa =new BonDeCasa(1,"Zinerit, Claritine", 200);
        BonDeCasaFelicitare bonDeCasaFelicitare=new BonDeCasaFelicitare(bonDeCasa);
        bonDeCasaFelicitare.printeaza();
    }
}
