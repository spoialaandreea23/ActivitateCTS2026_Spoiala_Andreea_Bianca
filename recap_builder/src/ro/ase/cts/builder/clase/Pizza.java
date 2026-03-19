package ro.ase.cts.builder.clase;

public class Pizza {

    // atributele protected
    protected String denumire;
    protected boolean areCiuperci;
    protected boolean areMasline;
    protected boolean areSosDulce;

    //constructor protected generat


    protected Pizza(String denumire, boolean areCiuperci, boolean areMasline, boolean areSosDulce) {
        this.denumire = denumire;
        this.areCiuperci = areCiuperci;
        this.areMasline = areMasline;
        this.areSosDulce = areSosDulce;
    }

    //setteri protected


    protected void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    protected void setAreCiuperci(boolean areCiuperci) {
        this.areCiuperci = areCiuperci;
    }

    protected void setAreMasline(boolean areMasline) {
        this.areMasline = areMasline;
    }

    protected void setAreSosDulce(boolean areSosDulce) {
        this.areSosDulce = areSosDulce;
    }


    //override to string

    @Override
    public String toString() {
        return "Pizza{" +
                "denumire='" + denumire + '\'' +
                ", areCiuperci=" + areCiuperci +
                ", areMasline=" + areMasline +
                ", areSosDulce=" + areSosDulce +
                '}';
    }
}
