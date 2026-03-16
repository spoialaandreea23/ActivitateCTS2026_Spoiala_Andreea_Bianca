package ro.ase.cts.singleton2.clase;

public class ConfigurationManager {
    protected int id;
    protected String appName;
    protected String version;
    private static ConfigurationManager instantaSingleton=null;


    private ConfigurationManager( String appName, String version) {
        this.id = 0;
        this.appName = appName;
        this.version = version;
    }

    public void afisareConfigurationManager(String text){
        System.out.println("Congigurarea cu id- ul "+ id+ " cu numele "+ appName + " are versiunea "+ version + text);
        this.id++;
    }

    public static synchronized ConfigurationManager getInstance( String appName, String version){
        if(instantaSingleton==null)
            instantaSingleton=new ConfigurationManager(appName,version);
        return instantaSingleton;
    }
}
