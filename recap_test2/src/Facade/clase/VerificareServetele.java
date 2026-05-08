package Facade.clase;

public class VerificareServetele {
    private boolean meseServetele[] = new boolean[25];

    public VerificareServetele() {

        this.meseServetele[1] = true;
        this.meseServetele[4] = true;

    }

    public int suntServetele(int i){
        if(meseServetele[i]==true){
            return i;
        }
        return -1;
    }
}
