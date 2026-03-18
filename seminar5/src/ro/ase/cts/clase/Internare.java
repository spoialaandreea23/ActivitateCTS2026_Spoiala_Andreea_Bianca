package ro.ase.cts.clase;

public class Internare {
    // Atributele obiectului final
    protected boolean patRabatabil;
    protected boolean micDejun;
    protected boolean papuci;
    protected boolean halat;
    protected String numePacient;

    // Generam constructor
    public Internare(boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat, String numePacient) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
        this.numePacient = numePacient;
    }


    // Setteri protected - accesibili doar pentru Builder (in cadrul aceluiasi pachet)
    protected void setPatRabatabil(boolean patRabatabil) { this.patRabatabil = patRabatabil; }
    protected void setMicDejun(boolean micDejun) { this.micDejun = micDejun; }
    protected void setPapuci(boolean papuci) { this.papuci = papuci; }
    protected void setHalat(boolean halat) { this.halat = halat; }
    protected void setNumePacient(String numePacient) { this.numePacient = numePacient; }


    @Override
    public String toString() {
        return "Internare{" +
                "patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuci=" + papuci +
                ", halat=" + halat +
                ", numePacient='" + numePacient + '\'' +
                '}';
    }
}