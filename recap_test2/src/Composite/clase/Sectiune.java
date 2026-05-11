package Composite.clase;

public class Sectiune implements Structura{
    private String numeSectiune;

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void afiseazaDetalii(String text) {
        System.out.println(text + numeSectiune);
    }
}
