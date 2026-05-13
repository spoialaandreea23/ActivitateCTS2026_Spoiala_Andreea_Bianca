package Decorator2.Decorator;

import Decorator2.Clase.BonDeCasa;
import Decorator2.Clase.BonDeCasaAbstract;

public abstract class  BonDeCasaDecorator implements BonDeCasaAbstract {
    private BonDeCasaAbstract bonDeCasa;

    public BonDeCasaDecorator(BonDeCasaAbstract bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }

    @Override
    public void printeaza() {
        bonDeCasa.printeaza();
    }

}
