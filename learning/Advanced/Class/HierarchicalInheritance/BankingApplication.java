

public class BankingApplication{
    public static void main(String[] args){
        
    }
}

class BankAccount{

    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void display(){
        System.out.println("Acc. No.: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount{

    double intrestRate;

    SavingAccount(int accountNumber, double balance, double intrestRate){
        super( accountNumber,  balance);
        this.intrestRate = intrestRate;
    }

    void calculateIntrest(int time){
        System.out.println("intrest: " + 0.05*balance*time);
    }
}

class CurrentAccount extends BankAccount{

    double overdraftLimit;

    CurrentAccount(int accountNumber, double balance,double overdraftLimit){
        super( accountNumber,  balance);
        this.overdraftLimit = overdraftLimit;
    }

}