package ChainOfResponsabilIty2.Clase;

public class CEO extends Handler{
    @Override
    public void trimiteNotificare(Alerta alerta, String mesaj) {
        if(alerta.getGradDeDificultate()>=10 )
            System.out.println("CEO-ul a rezolvat alerta "+mesaj);
        else if(succesor!=null) succesor.trimiteNotificare(alerta,mesaj);
    }
}
