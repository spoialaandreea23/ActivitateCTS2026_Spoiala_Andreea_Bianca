package Strategy.Clase;

public class PlataCash implements ModalitatePlata{
    public PlataCash() {
    }

    @Override
    public void plateste(String numePacient, double suma) {
        System.out.println("Clientul "+ numePacient +" a platit suma de: "+ suma+ " cash.");
    }
}
