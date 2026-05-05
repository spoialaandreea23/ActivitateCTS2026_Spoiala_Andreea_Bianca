package Facade.clase;

public class Salon {
    private boolean paturiLibere[] = new boolean[50];

    public Salon() {
        this.paturiLibere[1] = true;
        this.paturiLibere[2] = true;
        this.paturiLibere[3] = true;
        this.paturiLibere[6] = true;
        this.paturiLibere[8] = true;
        this.paturiLibere[13] = true;

    }

    public int suntPaturiLibere() {
        for (int i = 0; i < paturiLibere.length; i++) {
            if (paturiLibere[i] == true) {
                return i;
            }


        }
        return -1;
    }

    public void OcupaPat(int i){
        this.paturiLibere[i]=false;
    }
}
