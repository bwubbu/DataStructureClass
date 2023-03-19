public class BankAccount {
    private int balance;
    public BankAccount(int startbal){
        this.balance = startbal;
    }
    public int deposit(int amt){
        balance += amt;
        return balance;
    }
    public boolean withdraw(int amt){
        if(amt <= balance){
            balance -= amt;
            return true;
        } else {
            return false;
        }
    }
}
