package ro.ase.cts.simpleFactory3.Animale;

public class Caine implements TipuriAnimale {
    private String nume;
    private int varsta;

    public Caine(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void afisareTipAnimal(){
        StringBuilder sb= new StringBuilder();
        sb.append("Cainele ").append(this.nume).append(" are ").append(this.varsta).append(" anisori.");
        System.out.println(sb.toString());
    }
}
