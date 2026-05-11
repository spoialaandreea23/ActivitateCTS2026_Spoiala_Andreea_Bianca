package ChainOfResponsability.Clase;

public class NotificatorManager extends Notificator{

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println("NOTIFICARE MANAGER! Clientul: "+client.getNume() + " nu are date de contact.");
    }
}
