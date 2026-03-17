package ro.ase.cts.simpleFactory3.Animale;

public class Peste implements TipuriAnimale {
    private String nume;
    private int varsta;

    public Peste(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void afisareTipAnimal(){
        StringBuilder sb=new StringBuilder();
        sb.append("Pestele ").append(this.nume).append(" are varsta de ").append(this.varsta).append(" anisori");
        System.out.println(sb.toString());

    }
}
