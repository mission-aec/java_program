
import java.util.*;

class BankAccount {

    public String AccountNumber;
    public double Balance=0;

    public BankAccount(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void Deposit(double amount) {

        Balance = Balance + amount;
        System.out.println(amount);
    }

    public void Deposit(double amount, String Currency) {

        Balance = Balance + amount;
        System.out.println(amount + Currency);
    }

}

class SavingAccount extends BankAccount {
    super(AccountNumber);
    @Override
    public void Deposit(double amount) {
        System.out.println("Deposit successful in saving account");
    }
}

class CurrentAccount extends BankAccount {

    @Override
    public void Deposit(double amount) {
        System.out.println("Deposit successful in current account");
    }
}

public class Account {

    public static void main(String[] args) {

        SavingAccount SA = new SavingAccount();
        CurrentAccount CA = new CurrentAccount();

        System.out.println("Enter your deposit amount: ");
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();

        System.out.println("Enter your Currency: ");
        Scanner input2 = new Scanner(System.in);
        String Currency = input2.nextLine();

        SA.Deposit(amount);
        SA.Deposit(amount, Currency);

    }
}
