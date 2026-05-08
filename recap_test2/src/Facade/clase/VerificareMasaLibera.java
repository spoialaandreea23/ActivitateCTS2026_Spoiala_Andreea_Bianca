package Facade.clase;

import java.lang.reflect.Array;

public class VerificareMasaLibera {
    private boolean meseLibere[] = new boolean[25];

    public VerificareMasaLibera() {
        this.meseLibere[1] = true;
        this.meseLibere[3] = true;
        this.meseLibere[4] = true;
        this.meseLibere[7] = true;

    }

    public int suntMeseLibere(int i){

            if(meseLibere[i]==true) {
                return i;

        }
        return -1;
    }

    public void ocupaMasa(int i){this.meseLibere[i]=false;}

}
