package Proxy2.Clase;

public class Vizitator {
    private String nume;
    private String numePacientVizitator;
    private boolean areEchpament;
    private boolean areScrisoare;

    public Vizitator(String nume, String numePacientVizitator, boolean areEchpament, boolean areScrisoare) {
        this.nume = nume;
        this.numePacientVizitator = numePacientVizitator;
        this.areEchpament = areEchpament;
        this.areScrisoare = areScrisoare;
    }

    public String getNume() {
        return nume;
    }

    public String getNumePacientVizitator() {
        return numePacientVizitator;
    }

    public boolean isAreEchpament() {
        return areEchpament;
    }

    public boolean isAreScrisoare() {
        return areScrisoare;
    }
}
