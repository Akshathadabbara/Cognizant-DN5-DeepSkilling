package Week1.LiskovSubstutionprinciple;

public class LSP {
    public static void main(String[] args){
        employee em = new employee();
        employee em1 = new Developer();
        employee em2 = new Tester();
        employee em3 = new Manager();
        em.Work();
        em1.Work();
        em2.Work();
        em3.Work();

    }
}
class employee{
    void Work(){
        System.out.println("Employee is working..");
    }
}
class Developer extends employee{
    @Override
    void Work(){
        System.out.println("Developer Write The Code.");
    }
}
class Tester extends employee{
    @Override
    void Work(){
        System.out.println("Tester Test the Code.");
    }
}
class Manager extends employee{
    @Override
    void Work(){
        System.out.println("Manager Manages the Company.");
    }
}