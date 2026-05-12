package Composite2.Clase;

import java.util.ArrayList;
import java.util.List;

public class Virus implements Structura{
    private String numeVirus;

    public Virus(String numeVirus) {
        this.numeVirus = numeVirus;
    }

    @Override
    public void afiseazaDetalii(String text) {
        System.out.println(text + numeVirus);
    }
}
