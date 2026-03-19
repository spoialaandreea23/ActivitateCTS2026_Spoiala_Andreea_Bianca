package ro.ase.cts.builder.clase;

public class PizzaBuilder implements PizzaBuilderAbstract {
    //declaram un obiect de tipul clasei noastre
    private Pizza pizza;

    public PizzaBuilder(String denumire){
        this.pizza=new Pizza(denumire, false, false, false);

    }

    public PizzaBuilder setAreCiuperci(boolean ciuperci){
        pizza.areCiuperci= ciuperci;
        return this;
    }

    public PizzaBuilder setAreMasline(boolean masline){
        pizza.areMasline= masline;
        return this;
    }

    public PizzaBuilder setAreSosDulce(boolean sosdulce){
        pizza.areSosDulce=sosdulce;
        return this;
    }

    public PizzaBuilder setDenumire(String Denumire){
        pizza.denumire=Denumire;
        return this;
    }

    @Override
    public Pizza build(){
        return pizza;
    }

}
