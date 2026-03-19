package ro.ase.cts.clase;

public class Clatita extends Desert{
    public Clatita(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }
    @Override
    public void afiseaza(){
        System.out.println("Clatitele cu "+super.denumire + "au "+super.gramaj + " si " + super.calorii +" calorii");

    }
}
