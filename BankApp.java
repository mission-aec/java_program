// Abstract class for Account
abstract class Account {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected double balance;
    protected int transactionCount;

    public Account(String name, String address, String phoneNumber, double balance) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.transactionCount = 0;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void displayDetails();

    public double getBalance() {
        return balance;
    }
}

// CurrentAccount class extends Account
class CurrentAccount extends Account {
    private static final double INTEREST_RATE = 4.5 / 100;
    private static final int MAX_TRANSACTIONS_PER_DAY = 6;
    private static final double MIN_OPENING_BALANCE = 40000;

    public CurrentAccount(String name, String address, String phoneNumber, double balance) {
        super(name, address, phoneNumber, balance);
        if (balance < MIN_OPENING_BALANCE) {
            throw new IllegalArgumentException("Minimum opening balance for Current Account is Tk. 40000");
        }
    }

    @Override
    public void deposit(double amount) {
        if (transactionCount < MAX_TRANSACTIONS_PER_DAY) {
            balance += amount;
            balance += (amount * INTEREST_RATE);
            transactionCount++;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Maximum transactions per day reached.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (transactionCount < MAX_TRANSACTIONS_PER_DAY) {
            if (balance >= amount) {
                balance -= amount;
                transactionCount++;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Maximum transactions per day reached.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Account Type: Current Account");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class extends Account
class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 2.75 / 100;
    private static final int MAX_TRANSACTIONS_PER_DAY = 3;
    private static final double MIN_OPENING_BALANCE = 1000;
    private static final double MAX_WITHDRAWAL_PER_TRANSACTION = 50000;
    private static final double DAILY_WITHDRAWAL_LIMIT = 120000;
    private double dailyWithdrawalAmount;

    public SavingsAccount(String name, String address, String phoneNumber, double balance) {
        super(name, address, phoneNumber, balance);
        this.dailyWithdrawalAmount = 0;
        if (balance < MIN_OPENING_BALANCE) {
            throw new IllegalArgumentException("Minimum opening balance for Savings Account is Tk. 1000");
        }
    }

    @Override
    public void deposit(double amount) {
        if (transactionCount < MAX_TRANSACTIONS_PER_DAY) {
            balance += amount;
            balance += (amount * INTEREST_RATE);
            transactionCount++;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Maximum transactions per day reached.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (transactionCount < MAX_TRANSACTIONS_PER_DAY) {
            if (balance >= amount && amount <= MAX_WITHDRAWAL_PER_TRANSACTION && dailyWithdrawalAmount + amount <= DAILY_WITHDRAWAL_LIMIT) {
                balance -= amount;
                dailyWithdrawalAmount += amount;
                transactionCount++;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient balance or withdrawal limit exceeded.");
            }
        } else {
            System.out.println("Maximum transactions per day reached.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Balance: " + balance);
    }
}

// BankApp class
public class BankApp {
    public static void main(String[] args) {
        // Create accounts
        CurrentAccount currentAccount = new CurrentAccount("John Doe", "123 Main St", "1234567890", 50000);
        SavingsAccount savingsAccount = new SavingsAccount("Jane Doe", "456 Elm St", "987654321",120000);
        currentAccount.displayDetails();
        savingsAccount.displayDetails();
    }
}