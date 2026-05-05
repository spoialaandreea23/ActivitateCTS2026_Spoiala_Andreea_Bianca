package Facade.main;

import Facade.clase.Medic;
import Facade.clase.Pacient;
import Facade.clase.Salon;
import Facade.facade.SpitalFacade;

public class main {
    static void main(String[] args) {
        Pacient pacient=new Pacient("Olise", 7);
        Pacient pacient1=new Pacient("Diaz", 2);
        Pacient pacient2=new Pacient("Yamal", 5);
        Pacient pacient3=new Pacient("Bellingham", 9);
        Medic medic=new Medic("Doue");
        Salon salon=new Salon();
        if(pacient.getGravitate()>=4){
            if(medic.areBiletDeTrimitere(pacient)){
                int nrPat=salon.suntPaturiLibere();
                if(salon.suntPaturiLibere()!=-1){
                    System.out.println("Pacientul "+ pacient.getNume() + " poate fi internat in patul"+ nrPat);
                    salon.OcupaPat(nrPat);
                }
            }
        }
        SpitalFacade spitalFacade=new SpitalFacade(new Medic("Viorel"), new Salon());
        spitalFacade.internarePacient(pacient1);
        spitalFacade.internarePacient(pacient2);
        spitalFacade.internarePacient(pacient3);

    }

}
