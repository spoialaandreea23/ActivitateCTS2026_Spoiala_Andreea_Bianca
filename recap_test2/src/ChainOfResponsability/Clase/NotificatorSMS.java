package ChainOfResponsability.Clase;

public class NotificatorSMS extends Notificator{

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getNrTelefon()!=null){
            System.out.println("SMS trimis catre: " + client.getNume()+ " "+ mesaj);
        }
        else if(succesor!=null) succesor.trimiteNotificare(client,mesaj);

    }
}
