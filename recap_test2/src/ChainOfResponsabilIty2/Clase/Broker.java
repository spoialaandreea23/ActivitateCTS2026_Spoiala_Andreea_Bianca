package ChainOfResponsabilIty2.Clase;

public class Broker extends Handler{

    @Override
    public void trimiteNotificare(Alerta alerta, String mesaj) {
        if(alerta.getGradDeDificultate()<5)
            System.out.println("Broker-ul a rezolvat alerta "+mesaj);
        else if(succesor!=null) succesor.trimiteNotificare(alerta,mesaj);    }
}
