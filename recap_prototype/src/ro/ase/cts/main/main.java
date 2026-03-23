package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;

public class main {
    static void main(String[] args) {
        Rezervare rezervare1=new Rezervare("Aandrei", 10, 5,"0000000000000");
        Rezervare rezervare2= (Rezervare) rezervare1;
        System.out.println(rezervare2.toString());
        System.out.println(rezervare1.toString());
    }
}
