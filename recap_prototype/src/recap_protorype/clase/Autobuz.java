package recap_protorype.clase;

public class Autobuz implements IAutobuz {
    private String model;
    private int nrLocuri;
    private String traseu;

    public Autobuz(String model, int nrLocuri, String traseu) {
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.traseu = traseu;
    }

    private Autobuz(){

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public void setTraseu(String traseu) {
        this.traseu = traseu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", traseu='").append(traseu).append('\'');
        sb.append('}');
        return sb.toString();
    }



    @Override
    public IAutobuz copiaza() {
        Autobuz autobuz=new Autobuz();
        autobuz.model=this.model;
        autobuz.traseu=this.traseu;
        autobuz.nrLocuri=this.nrLocuri;
        return autobuz;
    }
}
