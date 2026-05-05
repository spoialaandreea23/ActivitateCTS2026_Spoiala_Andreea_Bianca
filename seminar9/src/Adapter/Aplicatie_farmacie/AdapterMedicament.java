package Adapter.Aplicatie_farmacie;

import Adapter.Aplicatie_spital.MedicamentSpital;

public class AdapterMedicament extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;



    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
