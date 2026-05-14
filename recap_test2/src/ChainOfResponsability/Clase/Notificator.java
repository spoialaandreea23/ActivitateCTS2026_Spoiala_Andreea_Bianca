package ChainOfResponsability.Clase;

public abstract class Notificator {
    protected Notificator succesor;

//    public void setSuccesor(Notificator succesor) {
//        this.succesor = succesor;
//    }


    public void setSuccesor(Notificator succesor) {
        this.succesor = succesor;
    }

    public abstract void trimiteNotificare(Client client, String mesaj);
}
