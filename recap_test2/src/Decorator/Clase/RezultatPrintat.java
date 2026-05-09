package Decorator.Clase;

public class RezultatPrintat implements RezultatMedic{
    private String stare;
    private String nume;

    public RezultatPrintat(String stare, String nume) {
        this.stare = stare;
        this.nume = nume;
    }

    public String getStare() {
        return stare;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void rezultat() {
        System.out.println("Pacientul "+ this.nume+ " stare: " +this.stare);
    }
}
