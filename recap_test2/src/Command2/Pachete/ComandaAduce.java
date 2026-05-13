package Command2.Pachete;

public class ComandaAduce implements IComanda{
    private AjutorFarmacist ajutorFarmacist;
    private String medicament;

    public ComandaAduce(AjutorFarmacist ajutorFarmacist, String medicament) {
        this.ajutorFarmacist = ajutorFarmacist;
        this.medicament = medicament;
    }

    @Override
    public void executa() {
        ajutorFarmacist.aduceMedicamente(medicament);
    }
}
