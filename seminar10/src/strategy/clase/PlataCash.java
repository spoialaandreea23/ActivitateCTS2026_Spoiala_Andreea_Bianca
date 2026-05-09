package strategy.clase;

public class PlataCash implements ModalitatePlata{
//    private double sumaDisponibila;
//
//    public PlataCash(double sumaDisponibila) {
//        this.sumaDisponibila = sumaDisponibila;
//    }

    public PlataCash() {
    }

    @Override
    public void plateste(String numeClient, double suma) {
//        sumaDisponibila=sumaDisponibila-suma;
        System.out.println("Clientul "+numeClient+ " a platit suma de "+suma+" cash.");

    }
}
