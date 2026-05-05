package composite.main;

import composite.clase.Departament;
import composite.clase.Sectie;
import composite.clase.Structura;

public class main {
    public static void main(String[] args) {

        Structura departamentSpital=new Departament("Spital");
        Structura departamentAdministrativ=new Departament("Administrativ");

        Structura sectieSecretariat=new Sectie("Secretariat",12);
        Structura sectieManagement=new Sectie("Management",8);

        ((Departament)departamentSpital).adaugaStructura(departamentAdministrativ);
        ((Departament)departamentSpital).adaugaStructura(sectieManagement);

        ((Departament)departamentAdministrativ).adaugaStructura(sectieSecretariat);

        departamentSpital.afiseazaDetalii("");


        ((Departament)departamentSpital).stergeStructura(sectieManagement);
        ((Departament)departamentAdministrativ).adaugaStructura(sectieManagement);

        System.out.println("\n-----------\n");
        departamentSpital.afiseazaDetalii("");
    }
}
