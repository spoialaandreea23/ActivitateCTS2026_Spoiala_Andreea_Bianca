package Facade.facade;

import Facade.clase.Medic;
import Facade.clase.Pacient;
import Facade.clase.Salon;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }


    public void internarePacient(Pacient pacient) {
        if (pacient.getGravitate() >= 4) {
            if (medic.areBiletDeTrimitere(pacient)) {
                int nrPat = salon.suntPaturiLibere();
                if (salon.suntPaturiLibere() != -1) {
                    System.out.println("Pacientul " + pacient.getNume() + " poate fi internat in patul" + nrPat);
                    salon.OcupaPat(nrPat);
                }
                else System.out.println("Pacientul trebuie internat, dar nu are loc in spitalul nostru!");
            }
            else System.out.println("Pacientul nu are bilet de trimitere!");
        }
        else System.out.println("Pacientul nu este asa bolnav!");
    }
}