package Adapter.Main;

import Adapter.Aplicatie_farmacie.AdapterMedicament;
import Adapter.Aplicatie_spital.MedicamentSpital;

public class Main {
   public static void main(String[] args) {
        MedicamentSpital medicamentSpital=new MedicamentSpital();
        medicamentSpital.achizitioneazaMedicament();
        AdapterMedicament adapterMedicament= new AdapterMedicament(medicamentSpital);
        adapterMedicament.cumparaMedicament();
    }
}
