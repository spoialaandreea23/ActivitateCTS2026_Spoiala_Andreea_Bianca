package ChainOfResponsability.main;

import ChainOfResponsability.Clase.*;

public class main {
    static void main(String[] args) {
        Notificator notificatorSMS=new NotificatorSMS();
        Notificator notificatorEmail=new NotificatorEmail();
        Notificator notificatorManager=new NotificatorManager();


        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        Client client=new Client("Marius","0720750254",null);
        Client client1=new Client("Ana",null, null);
        notificatorSMS.trimiteNotificare(client1,"AVEM");

        notificatorSMS.trimiteNotificare(client," AVEM MENIU NOU!");
    }
}
