package strategy.clase;

public class Client {
    private String nume;
    private ModalitatePlata modalitateDePlata;




    public Client(String nume) {
        this.nume = nume;
        this.modalitateDePlata =new PlataCard(500);
    }

    public void setModalitateDePlata(ModalitatePlata modalitateDePlata) {
        this.modalitateDePlata = modalitateDePlata;
    }

    public void platesteTranzactie(double suma){
        modalitateDePlata.plateste(nume,suma);
    }
}
