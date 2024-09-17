public class BankAccount {
    //creating initial global variable.
    private String accountNumber;
    private double balance;

    //constructor
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    };

    //method for deposit
    public void deposit(double amount) throws InvalidAmountException{
        if(amount <= 0){
            throw new InvalidAmountException("deposit amount must be positive");
        }

        balance += amount;
        System.out.println("deposited successfully!");
    };

    //method for withdraw
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if(amount <= 0){
            throw new InvalidAmountException("withdrawal amount must be positive");
        }
        if(amount > balance){
            throw new InsufficientFundsException("insufficient balance");
        }

        balance -= amount;
        System.out.println("withdrawal successfully!");
    };

    //method for getting the current balance
    public double getBalance(){
        return balance;
    };

    public String getAccountNumber(){
        return accountNumber;
    };

}