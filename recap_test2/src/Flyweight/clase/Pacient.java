package Flyweight.clase;

public class Pacient implements PacientAbstract{
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String adresa, String nrTelefon, String nume) {
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
        this.nume = nume;
    }

    @Override
    public void afiseazaInternare(Internare internare) {
        System.out.println("Pacientul: "+ nume+ " numar telefon: "+ nrTelefon+ " cu adresa " + adresa+ " este internat: " + internare.toString());
    }
}
