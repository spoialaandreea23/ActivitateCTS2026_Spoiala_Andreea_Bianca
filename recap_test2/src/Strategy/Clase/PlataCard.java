package Strategy.Clase;

public class PlataCard implements ModalitatePlata {
    public PlataCard() {
    }

    @Override
    public void plateste(String numePacient, double suma) {
        System.out.println("Clientul "+ numePacient +" a platit suma de: "+ suma+ " cu cardul.");
    }
}
