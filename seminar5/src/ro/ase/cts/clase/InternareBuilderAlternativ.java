package ro.ase.cts.clase;

public class InternareBuilderAlternativ implements InternareBuilderAbstractAlt {
    // Builder-ul are propriile atribute temporare, nu un obiect Internare inca
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public InternareBuilderAlternativ() {
        // Initializam setarile implicite in builder
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuci = false;
        this.halat = false;
    }


    // Metode fluide care seteaza variabilele LOCALE ale builder-ului
    public InternareBuilderAlternativ setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilderAlternativ setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public InternareBuilderAlternativ setPapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public InternareBuilderAlternativ setHalat(boolean halat) {
        this.halat = halat;
        return this;

    }

    @Override
    public Internare build(String nume) {
        // Abia ACUM chemam constructorul clasei Internare si ii dam toate datele colectate
        // Este mai sigur deoarece obiectul Internare este creat dintr-o data, complet
        Internare internare = new Internare(this.patRabatabil, this.micDejun, this.papuci, this.halat, nume);
        return internare;
    }
}
