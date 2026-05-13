package Command2.Pachete;

public class AjutorFarmacist {
    private String numeF;

    public AjutorFarmacist(String nume) {
        this.numeF = nume;
    }

    public void aduceMedicamente(String nume){
        System.out.println(numeF+" aduce medicemanetul: "+nume);
    }
}
