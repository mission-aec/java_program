

class BankAccount{

    double  balance;
    String accountNumber;

    public BankAccount(String accountNumber){

        this.accountNumber=accountNumber;

    }


    public void deposit(double amount){
        
        balance += amount;
    }

    public void deposit(double amount, String currency){
        if(currency.equalsIgnoreCase("USD")){
            balance += amount*100;
        }
        else if (currency.equalsIgnoreCase("URO")) {
            balance +=  amount*120;
        }
        else{
            balance+=amount;
        }
        
    
}

}

class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber){
        super(accountNumber);
    }
    
    
    
    @Override
    public void deposit(double amount){
        System.out.println("this is Saving Account");

    }
    public void show(){
        System.out.println("Acount NUmber:"+accountNumber);
        System.out.println("Balance:"+balance);
    }
    
}

class CurrentAccount extends BankAccount{

    public CurrentAccount(String accountNumber){
        super(accountNumber);
    }
    @Override
    public void deposit(double amount) {
        System.out.println("this is Current Account");
        
    }
    public void show(){
        System.out.println("Acount NUmber:"+accountNumber);
        System.out.println("Balance:"+balance);
    }
}



public class MyAccount {
    public static void main(String[] args) {
      SavingsAccount savingsAccount=new SavingsAccount("SA1234");
      savingsAccount.deposit(400);
      savingsAccount.deposit(110,"USD");
      savingsAccount.deposit(300,"URO");
      savingsAccount.show();

      CurrentAccount currentAccount=new CurrentAccount("CA$326");
      currentAccount.deposit(1000);
      currentAccount.deposit(16443000, "URO");
      currentAccount.show();  

    }
    
}
