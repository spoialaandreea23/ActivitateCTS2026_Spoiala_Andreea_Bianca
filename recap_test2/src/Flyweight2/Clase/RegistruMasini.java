package Flyweight2.Clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruMasini {
    private Map<String, IMasina> masini=new HashMap<>();
    public RegistruMasini(){
        this.masini=new HashMap<>();
    }
    public IMasina getMasina(String model, int anFabricatie, String dimensiune){
        String cheie=model+"_"+anFabricatie;
        IMasina masina=masini.get(model);

        if(!masini.containsKey(cheie)){
            masina=new Masina(model,anFabricatie,dimensiune);
            masini.put(model,masina);
        }
        return masina;
    }
}
