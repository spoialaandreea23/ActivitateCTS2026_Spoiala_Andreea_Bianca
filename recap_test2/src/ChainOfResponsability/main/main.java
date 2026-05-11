package ChainOfResponsability.main;

import ChainOfResponsability.Clase.Client;
import ChainOfResponsability.Clase.Notificator;
import ChainOfResponsability.Clase.NotificatorEmail;
import ChainOfResponsability.Clase.NotificatorSMS;

public class main {
    static void main(String[] args) {
        Notificator notificatorSMS=new NotificatorSMS();
        Notificator notificatorEmail=new NotificatorEmail();

        notificatorSMS.setSuccesor(notificatorEmail);

        Client client=new Client("Marius","0720750254",null);
        Client client1=new Client("Ana",null, "bibicuta@yahoo.com");
        notificatorSMS.trimiteNotificare(client," AVEM MENIU NOU!");
    }
}
