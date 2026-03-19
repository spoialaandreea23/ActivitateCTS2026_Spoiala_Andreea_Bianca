package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.Pizza;
import ro.ase.cts.builder.clase.PizzaBuilder;
import ro.ase.cts.builder.clase.PizzaBuilderAlternativ;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder builder= new PizzaBuilder("-");
        Pizza pizza1= builder.setAreCiuperci(true).setAreSosDulce(true).build();
        System.out.println(pizza1.toString());
        builder.setAreMasline(true);
        System.out.println(pizza1.toString());

        PizzaBuilderAlternativ builderAlternativ=new PizzaBuilderAlternativ();
        Pizza pizza2=builderAlternativ.setCiuperci(true).build("Salami");
        System.out.println(pizza2.toString());

    }
}
