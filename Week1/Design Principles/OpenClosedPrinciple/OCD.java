package Week1.OpenClosedPrinciple;

public class OCD {
    public static void main(String[] args){
        Payment p = new Payment();
        Payment p1 = new UPI();
        Payment p2 = new NetBanking();
        Payment p3 = new CreditCard();

        p.Method();
        p1.Method();
        p2.Method();
        p3.Method();
        

    }
    
}
class Payment{
    void Method(){
        System.out.println("Amount Paid Through...");
    }
}
class UPI extends Payment{
    @Override
    void Method(){
        System.out.println("Amount Paid Through UPI.");
    }
}
class NetBanking extends Payment{
    @Override
    void Method(){
        System.out.println("Amount Paid Through NetBanking.");
    }
}
class CreditCard extends Payment{
    @Override
    void Method(){
        System.out.println("Amount Paid Through CreditCard.");
    }
}