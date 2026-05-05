package recap_protorype.main;

import recap_protorype.clase.Autobuz;

public class main {
    static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Mercedes", 52, "Targoviste-Bucuresti");
        Autobuz autobuz1=(Autobuz) autobuz;
        System.out.println(autobuz1.toString());
        System.out.println(autobuz.toString());

    }
}
