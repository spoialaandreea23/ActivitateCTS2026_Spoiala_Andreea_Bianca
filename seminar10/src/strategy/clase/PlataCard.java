package strategy.clase;

public class PlataCard  implements ModalitatePlata{
//    private double sumaDisponibila;
//
//    public PlataCard(double sumaDisponibila) {
//        this.sumaDisponibila = sumaDisponibila;
//    }


    public PlataCard() {
    }

    @Override
    public void plateste(String numeClient, double suma) {
//        sumaDisponibila=sumaDisponibila-suma;
        System.out.println("Clientul "+numeClient+ " a platit suma de "+suma+ " pe card");
    }

}
