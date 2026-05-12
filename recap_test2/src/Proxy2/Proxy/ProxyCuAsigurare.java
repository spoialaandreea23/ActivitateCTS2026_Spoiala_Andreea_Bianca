package Proxy2.Proxy;

import Proxy2.Clase.ISpital;
import Proxy2.Clase.Vizitator;

public class ProxyCuAsigurare implements ISpital {
    private ISpital spital;

    public ProxyCuAsigurare(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void accesVizitator(Vizitator vizitator) {
        if(vizitator.isAreScrisoare() && vizitator.isAreEchpament()){
            spital.accesVizitator(vizitator);
        }
        else System.out.println("Nu puteti vvizita pacientul "+ vizitator.getNumePacientVizitator());
    }
}