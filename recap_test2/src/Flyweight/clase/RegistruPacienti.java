package Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruPacienti {
    private Map<String, PacientAbstract> pacienti= new HashMap<>();

    public RegistruPacienti() {
        this.pacienti = new HashMap<>();
    }

    public PacientAbstract getPacient(String adresa, String nrTelefon, String nume){
        PacientAbstract pacientAbstract=pacienti.get(nrTelefon);
        if(!pacienti.containsKey(nrTelefon)){
            pacientAbstract=new Pacient(adresa,nrTelefon,nume);
            pacienti.put(nrTelefon, pacientAbstract);
        }
        return pacientAbstract;
    }
}
