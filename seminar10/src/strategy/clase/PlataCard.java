package strategy.clase;

public class PlataCard  implements ModalitatePlata{
    private double sumaDisponibila;

    public PlataCard(double sumaDisponibila) {
        this.sumaDisponibila = sumaDisponibila;
    }

    @Override
    public void plateste(String numeClient, double suma) {
        sumaDisponibila=sumaDisponibila-suma;
        System.out.println("Clientul "+numeClient+ " a platit suma de "+suma+ " cu cardul. Mai are disponibili: "+sumaDisponibila+ "lei");
    }

}
