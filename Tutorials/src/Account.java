public class Account {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        System.out.println("Starting balance: " + acc.deposit(0));
        System.out.println("Deposit $100, new balance: " + acc.deposit(100));
        System.out.println("Withdraw $200: " + acc.withdraw(200));
        System.out.println("Withdraw $1000: " + acc.withdraw(1000));
        System.out.println("Final balance: " + acc.deposit(200));
    }
}