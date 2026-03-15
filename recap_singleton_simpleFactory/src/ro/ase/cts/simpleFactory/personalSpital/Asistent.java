package ro.ase.cts.simpleFactory.personalSpital;

public class Asistent implements PersonalSpital{
    private String nume;
    private String sectie;

    public Asistent(String nume, String sectie) {
        this.nume = nume;
        this.sectie = sectie;
    }
    
    @Override
    public void afisareTipPersonal(){
        StringBuilder sb =new StringBuilder();
        sb.append("Asistentul ").append(this.nume).append(" este pe sectia ").append(this.sectie);
        System.out.println(sb.toString());
    }
}
