package ChainOfResponsability.Clase;

public class NotificatorEmail extends Notificator{

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getAdresaMail()!=null)
            System.out.println("Mail trimis catre: " +client.getNume() + " "+ mesaj);
        else if(succesor!=null) succesor.trimiteNotificare(client,mesaj);
    }
}
