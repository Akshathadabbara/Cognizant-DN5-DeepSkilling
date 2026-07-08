package Week1.DesignPatterns;

public class DatabaseConnectionManager_singleton {
    public static void main(String[] args){
        DbConnection dc =  DbConnection.getInstance();
        DbConnection dc1 =  DbConnection.getInstance();
        DbConnection dc2 =  DbConnection.getInstance();
        dc.connect("Login to Database.");
        dc2.connect("Data Entered Successfully.");
        dc1.connect("Data Typed.");
        System.out.println("dc==dc1 "+(dc==dc1));
        System.out.println("dc1==dc2 "+(dc1==dc2));
    }
}
class DbConnection{
    private static DbConnection instance;
    private DbConnection(){
        System.out.println("Database Connected Successfully.");
    }
    public static DbConnection getInstance(){
        if(instance==null){
            instance=new DbConnection();
        }
        return instance;
    }
    public void connect(String message){
        System.out.println("Connection: "+message);
    }
}