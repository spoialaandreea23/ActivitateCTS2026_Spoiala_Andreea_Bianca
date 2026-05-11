package Command.Clase;

public class MasaRezervata implements Command{
    private Masa masa;
    int nrPersoane;

    public MasaRezervata(Masa masa, int nrPersoane) {
        this.masa = masa;
        this.nrPersoane = nrPersoane;
    }


    @Override
    public void seteazaStareMasa() {
        System.out.println("Masa: " + masa.getNrMasa()+" este rezervata de "+ nrPersoane+" persoane" );
    }
}
