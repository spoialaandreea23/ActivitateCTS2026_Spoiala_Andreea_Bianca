package ChainOfResponsability.Clase;

public class CalatorieMetrou extends CalatorieHandler {
    @Override
    public String recomandaMijlocDeTransport(double distanta) {
        if(distanta>10){
        return "Metrou";}
        return super.succesor.recomandaMijlocDeTransport(distanta);
    }
}
