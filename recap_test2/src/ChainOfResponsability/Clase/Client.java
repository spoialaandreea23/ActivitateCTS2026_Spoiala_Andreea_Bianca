package ChainOfResponsability.Clase;

public class Client {
    private String nume;
    private String nrTelefon;
    private String adresaMail;

    public Client(String nume, String nrTelefon, String adresaMail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresaMail() {
        return adresaMail;
    }
}
