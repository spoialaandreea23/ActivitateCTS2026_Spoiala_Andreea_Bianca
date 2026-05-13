package Facade2.Clase;

public class Depozit {
    private String numeMedicament;
    private boolean medicament;

    public Depozit(String numeMedicament, boolean medicament) {
        this.numeMedicament = numeMedicament;
        this.medicament = medicament;
    }

    public boolean isMedicament() {
        return medicament;
    }

}
