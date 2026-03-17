package ro.ase.cts.singleton.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;
    private static Logger instantaSingleton=null; //O variabilă statică privată: Aceasta va păstra singura instanță a clasei.

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    //Constructor privat: Împiedici alte clase să creeze obiecte noi folosind new
    private Logger( String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }
     public void afiseazaLogger(String text){
        System.out.println("Log cu codul "+ cod + " efectuat de utilizatorul "+ sender + " din categoria "+ categorie+ " a constat in "+ text );
        this.cod++;
     }

    //O metodă statică publică (de obicei numită getInstance()): Aceasta verifică dacă obiectul există deja. Dacă nu, îl creează; dacă da, îl returnează pe cel existent.
    public static synchronized Logger getInstance(String sender, String categorie){
        if(instantaSingleton==null)
            instantaSingleton=new Logger(sender,categorie);
        return instantaSingleton;

    }


}
