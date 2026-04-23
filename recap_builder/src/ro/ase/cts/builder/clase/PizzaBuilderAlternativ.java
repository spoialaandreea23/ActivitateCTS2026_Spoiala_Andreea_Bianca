package ro.ase.cts.builder.clase;

public class PizzaBuilderAlternativ implements PizzaBuilderAbstractAlt {
    //luam atributele si le facem private
    private boolean areCiuperci;
    private boolean areMasline;
    private boolean areSosDulce;

    // Initializam setarile implicite in builder

//    public PizzaBuilderAlternativ() {
//        this.areCiuperci = false;
//        this.areMasline = false;
//        this.areSosDulce = false;
//    }



    // Metode fluide care seteaza variabilele LOCALE ale builder-ului
    //la fel ca la cel normal, doar ca are this.

    public PizzaBuilderAlternativ setCiuperci(boolean Ciuperci){
        this.areCiuperci=Ciuperci;
        return this;
    }

    public PizzaBuilderAlternativ setMasline( boolean Masline){
        this.areMasline=Masline;
        return this;
    }

    public PizzaBuilderAlternativ setSosDulce(boolean sosDulce){
        this.areSosDulce=sosDulce;
        return this;
    }

    @Override
    public Pizza build(String nume){
        Pizza pizza=new Pizza(nume,this.areCiuperci,this.areMasline,this.areSosDulce);
        return pizza;


    }
}
