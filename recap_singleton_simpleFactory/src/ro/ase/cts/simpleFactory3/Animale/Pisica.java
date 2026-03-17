package ro.ase.cts.simpleFactory3.Animale;

public class Pisica  implements TipuriAnimale{
    private String nume;
    private int varsta;

    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void afisareTipAnimal(){
        StringBuilder sb=new StringBuilder();
        sb.append("Pisica ").append(this.nume).append(" are varsta de ").append(this.varsta).append(" anisori");
        System.out.println(sb.toString());

    }
}
