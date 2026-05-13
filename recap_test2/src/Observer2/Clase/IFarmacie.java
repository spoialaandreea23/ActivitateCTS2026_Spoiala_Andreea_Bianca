package Observer2.Clase;

public interface IFarmacie {
    public void trimiteNotificare(String mesaj);
    public void aboneazaClient(IClient client);
    public void dezaboneazaClient(IClient client);
}
