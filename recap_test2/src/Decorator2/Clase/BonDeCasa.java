package Decorator2.Clase;

public class BonDeCasa implements BonDeCasaAbstract{
    private int id;
    private String medicamente;
    private float pret;

    public BonDeCasa(int id, String medicamente, float pret) {
        this.id = id;
        this.medicamente = medicamente;
        this.pret = pret;
    }

    @Override
    public void printeaza() {
        System.out.println("Bonul: "+ id+ "Medicamente: "+ medicamente+ " este in valoare de: "+ pret);
    }
}
