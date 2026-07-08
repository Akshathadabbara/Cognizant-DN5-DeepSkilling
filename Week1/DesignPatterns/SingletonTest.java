package Week1.DesignPatterns;
public class SingletonTest{
    public static void main(String[] args){
        Logger log1 =Logger.getInstance();
        Logger log2 = Logger.getInstance();
        Logger log3 = Logger.getInstance();
        log3.Logg("User Login Successfully");
        log2.Logg("Database Created Successfully");
        log1.Logg("Application Created ");
        System.out.println("Log1==LOG2: "+(log1==log2));
        System.out.println("Log2==Log3: "+(log2==log3));

    }
}
class Logger{
    private static Logger Instance;
    private Logger(){
        System.out.println("Object Created");
    }
    public static Logger getInstance(){
        if(Instance==null){
            Instance=new Logger();
        }
        return Instance;
    }
    public void Logg(String message){
        System.out.println("LOGG: "+message);
    }
}