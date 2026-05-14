package ChainOfResponsabilIty2.Clase;

public abstract class Handler {
    protected Handler succesor;

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public abstract void trimiteNotificare(Alerta alerta, String mesaj);
}
