package Command.Main;

import Command.Clase.*;

public class Main {
    static void main(String[] args) {
        Operator operator=new Operator();
        Masa masa=new Masa(1);
        Command command=new MasaOcupata(masa, 4);

        Masa masa1=new Masa(2);
        Command command1=new MasaRezervata(masa1, 5);
        operator.adaugaComanda(command);
        operator.adaugaComanda(command1);
        operator.executaComanda();
        operator.executaComanda();
    }
}
