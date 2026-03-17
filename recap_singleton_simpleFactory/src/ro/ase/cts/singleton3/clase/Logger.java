package ro.ase.cts.singleton3.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;
    private static Logger instantaSingleton=null;


    private Logger(String sender, String categorie) {
        this.cod=0;
        this.sender = sender;
        this.categorie = categorie;
    }

    public void afisareLogger(String text){
        System.out.println("Logg-ul cu codul "+ cod + " efectuat de utilizatorul "+ sender+ " din categoria "+ categorie +" a efectuat "+ text);
        this.cod++;
    }

    public static synchronized Logger getInstance(String sender, String categorie){
        if(instantaSingleton==null)
            instantaSingleton=new Logger(sender, categorie);
        return instantaSingleton;
    }

}
