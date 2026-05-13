package Facade2.Clase;

public class Client {
    private String nume;
    private boolean reteta;
    private boolean cardDeSanatate;

    public Client(String nume, boolean reteta, boolean cardDeSanatate) {
        this.nume = nume;
        this.reteta = reteta;
        this.cardDeSanatate = cardDeSanatate;
    }

    public String getNume() {
        return nume;
    }

    public boolean isReteta() {
        return reteta;
    }

    public boolean isCardDeSanatate() {
        return cardDeSanatate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", reteta=").append(reteta);
        sb.append(", cardDeSanatate=").append(cardDeSanatate);
        sb.append('}');
        return sb.toString();
    }
}
