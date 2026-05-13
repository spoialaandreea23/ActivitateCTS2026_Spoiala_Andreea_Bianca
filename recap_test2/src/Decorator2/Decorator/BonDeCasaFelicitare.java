package Decorator2.Decorator;

import Decorator2.Clase.BonDeCasaAbstract;

public class BonDeCasaFelicitare extends BonDeCasaDecorator{
    public BonDeCasaFelicitare(BonDeCasaAbstract bonDeCasa) {
        super(bonDeCasa);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("La Multi Ani!");
    }
}
