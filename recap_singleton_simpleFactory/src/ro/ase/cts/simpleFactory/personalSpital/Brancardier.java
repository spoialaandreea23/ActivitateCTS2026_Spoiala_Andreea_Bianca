package ro.ase.cts.simpleFactory.personalSpital;

public class Brancardier implements PersonalSpital{

    private String nume;
    private String sectie;

    public Brancardier(String nume, String sectie) {
        this.nume = nume;
        this.sectie = sectie;
    }

    @Override
    public void afisareTipPersonal()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("Brancardierul ").append(this.nume).append(" este pe sectia ").append(this.sectie);
        System.out.println(sb.toString());
    }
}
