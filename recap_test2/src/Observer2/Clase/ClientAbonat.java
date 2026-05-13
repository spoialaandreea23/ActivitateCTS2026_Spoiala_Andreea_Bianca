package Observer2.Clase;

public class ClientAbonat implements IClient{
    private String nume;

    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Clientul: "+nume+ " a fost notificat de oferta." + mesaj);
    }
}
