package ro.ase.cts.simpleFactory.personalSpital;

public class Medic implements PersonalSpital {
    private String nume;
    private String sectie;

    public Medic(String nume, String sectie) {
        this.nume = nume;
        this.sectie = sectie;
    }

    @Override
    public void afisareTipPersonal()
    {
        StringBuilder sb= new StringBuilder();
        sb.append("Medicul ").append(this.nume).append(" este pe sectia ").append(this.sectie);
        System.out.println(sb.toString());
    }
}
