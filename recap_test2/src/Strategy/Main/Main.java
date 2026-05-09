package Strategy.Main;

import Strategy.Clase.ModalitatePlata;
import Strategy.Clase.Pacient;
import Strategy.Clase.PlataCard;
import Strategy.Clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Vasile");
        ModalitatePlata modalitatePlata=new PlataCard();
        ModalitatePlata modalitatePlata1=new PlataCash();
        pacient.setModalitatePlata(modalitatePlata);
        pacient.platesteTranzactie(200.00);
        pacient.setModalitatePlata(modalitatePlata1);
        pacient.platesteTranzactie(200.00);
    }
}
