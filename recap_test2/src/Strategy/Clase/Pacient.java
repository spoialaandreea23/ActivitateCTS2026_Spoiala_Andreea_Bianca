package Strategy.Clase;

public class Pacient {
    private String nume;
    private ModalitatePlata modalitatePlata;

    public Pacient(String nume) {
        this.nume = nume;
        this.modalitatePlata = new PlataCard() ;
    }

    public void setModalitatePlata(ModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }
    public void platesteTranzactie(Double suma){
        modalitatePlata.plateste(nume,suma);
    }
}
