public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234", 100.0);
        try {
            try {
                account.deposit(50);
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                account.withdraw(200);
            } catch (InsufficientFundsException | InvalidAmountException e) {
                System.out.println(e);
            }
            try {
                account.withdraw(50);
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                account.deposit(-10);
            } catch (InvalidAmountException e) {
                System.out.println(e);
            }
        } finally {
            double blnc = account.getBalance();
            System.out.println("balance: $" + blnc);
        }
    }
};
