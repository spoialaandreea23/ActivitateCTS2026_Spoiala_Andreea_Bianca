package Command2.Pachete;

public class Farmacist {
    private IComanda comanda;

    public void setComanda(IComanda comanda) {
        this.comanda = comanda;
    }

    public void trimiteComanda(IComanda comanda){
        if(comanda!=null){
            comanda.executa();
        }
    }
}
