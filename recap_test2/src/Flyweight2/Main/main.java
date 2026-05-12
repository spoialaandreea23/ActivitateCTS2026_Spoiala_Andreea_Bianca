package Flyweight2.Main;

import Flyweight2.Clase.IMasina;
import Flyweight2.Clase.Masina;
import Flyweight2.Clase.RegistruMasini;
import Flyweight2.Clase.Sticker;

public class main {
    static void main(String[] args) {
        IMasina masina=new Masina("bmw",2020,"mica");
        Sticker sticker=new Sticker(" o tunam bine rau ca e bmw.");


        RegistruMasini masini=new RegistruMasini();
        masini.getMasina("bmw", 2020, "mica").creareSticker(sticker);
        masini.getMasina("bmw", 2020, "grea").creareSticker(sticker);
        masini.getMasina("bmw",2019,"mare").creareSticker(sticker);

    }
}
