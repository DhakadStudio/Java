

interface Payment{
    void pay(double amount);
}

class UPI implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid "+amount+" using UPI");
    }
}

class CreditCard implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid "+amount+" using credit card");
    }
}

class Cash implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid "+amount+" by cash");
    }
}

public class Main{
    public static void main(String[] args){
        Payment p;

        p = new UPI();
        p.pay(500);
        
        p = new CreditCard();
        p.pay(560);
        
        p = new Cash();
        p.pay(700);
    }
}
 