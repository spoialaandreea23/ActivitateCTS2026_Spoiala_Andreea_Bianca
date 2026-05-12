package Flyweight2.Clase;

public class Masina implements IMasina {
    private String model;
    private int anFabricatie;
    private String dimensiune;

    public Masina(String model, int anFabricatie, String dimensiune) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.dimensiune = dimensiune;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", dimensiune='").append(dimensiune).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void creareSticker(Sticker sticker) {
        System.out.println("Pentru modelul: "+ model + " din anul "+ anFabricatie+ " cu dimensiunea"+ dimensiune+ " facem : "+ sticker.toString());
    }
}
