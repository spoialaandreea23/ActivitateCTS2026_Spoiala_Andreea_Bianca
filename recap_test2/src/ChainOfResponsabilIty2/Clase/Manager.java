package ChainOfResponsabilIty2.Clase;

public class Manager extends Handler{
    @Override
    public void trimiteNotificare(Alerta alerta, String mesaj) {
        if(alerta.getGradDeDificultate()>=5 && alerta.getGradDeDificultate()<10)
            System.out.println("Manager-ul a rezolvat alerta "+mesaj);
        else if(succesor!=null) succesor.trimiteNotificare(alerta,mesaj);
    }
}
