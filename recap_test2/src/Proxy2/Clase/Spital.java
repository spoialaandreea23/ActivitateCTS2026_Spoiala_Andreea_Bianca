package Proxy2.Clase;

public class Spital implements ISpital {
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void accesVizitator(Vizitator vizitator) {
        System.out.println("Spitalul "+nume+ ". Vizitatorul: "+ vizitator.getNume() +" poate sa il viziteze pe : "+ vizitator.getNumePacientVizitator()+", deoarece indeplineste conditiile.");
    }
}
