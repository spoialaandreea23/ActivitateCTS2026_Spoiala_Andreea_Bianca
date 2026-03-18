package ro.ase.cts.clase;

public class InternareBuilder implements InternareBuilderAbstract {
    // Builder-ul detine deja o referinta catre obiectul pe care il construieste
    private Internare internare;

    public InternareBuilder(String nume) {
        // In momentul in care instantiem Builder-ul, se creeaza si obiectul cu valori implicite
        this.internare = new Internare(false, false, false, false, nume);
    }

    // Metode de tip FLUENT - Returneaza "this" (adica insusi Builder-ul)
    // Acest lucru permite inlantuirea: .setPat(true).setMicDejun(true)
    public InternareBuilder setPat(boolean arePat) {
        internare.patRabatabil = arePat; // Modificam direct atributul din obiectul continut
        return this; // Returnam builder-ul pentru a continua configurarea
    }

    public InternareBuilder setMicDejun(boolean areMicDejun) {
        internare.micDejun = areMicDejun;
        return this;
    }

    public InternareBuilder setPapuci(boolean arePapuci) {
        internare.papuci = arePapuci;
        return this;
    }

    public InternareBuilder setHalat(boolean areHalat) {
        // Atentie: Aici in codul tau era o mica eroare, se seta patRabatabil in loc de halat
        internare.halat = areHalat;
        return this;
    }

    public InternareBuilder setnume(String nume) {
        internare.numePacient = nume;
        return this;
    }

    @Override
    public Internare build() {
        // Metoda finala care livreaza obiectul deja configurat
        return internare;
    }
}
