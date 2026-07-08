package Week1.InterfaceSegerigationPrinciple;

public class ISP {

    public static void main(String[] args) {

        Developer dev = new Developer();
        Tester tester = new Tester();
        Manager manager = new Manager();

        System.out.println("=== Developer Role ===");
        dev.code();

        System.out.println("\n=== Tester Role ===");
        tester.test();

        System.out.println("\n=== Manager Role ===");
        manager.manage();
    }
}

// Interface for Coding
interface Coder {

    void code();
}

// Interface for Testing
interface TesterRole {

    void test();
}

// Interface for Management
interface ManagerRole {

    void manage();
}

// Developer implements only Coder
class Developer implements Coder {

    @Override
    public void code() {

        System.out.println(
                "Developer Writes Code."
        );
    }
}

// Tester implements only TesterRole
class Tester implements TesterRole {

    @Override
    public void test() {

        System.out.println(
                "Tester Tests Software."
        );
    }
}

// Manager implements only ManagerRole
class Manager implements ManagerRole {

    @Override
    public void manage() {

        System.out.println(
                "Manager Manages Team."
        );
    }
}