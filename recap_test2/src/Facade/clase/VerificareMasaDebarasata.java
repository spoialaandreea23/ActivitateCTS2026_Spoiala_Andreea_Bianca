package Facade.clase;

import java.sql.Array;

public class VerificareMasaDebarasata {
    public  boolean masaDebarasata[]=new boolean[25];

    public VerificareMasaDebarasata(){
        this.masaDebarasata[1] = true;
        this.masaDebarasata[4] = true;

    }

    public int suntMeseDebarasate(int i){
            if(masaDebarasata[i]==true){
                return i;
            }
        return -1;
    }



}
