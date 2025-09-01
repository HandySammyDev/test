package ver1;

public class Account {

    private double balance;

    public Account(double initBalance){
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double newBal) {
        if(newBal>0.0){
            this.balance = newBal;
        }
    }

    public void deposit(double amount) {
        if(amount>0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if(amount>0) {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        Account a1 = new Account(1000.0);
        System.out.println("Balance=$" + a1.getBalance());
        a1.deposit(500.0);
        System.out.println("Balance=$" + a1.getBalance());

        a1.withdraw(200.0);
        System.out.println("Balance=$" + a1.getBalance());

        System.out.println(a1.toString());
        System.out.println(a1);

    }

    @Override
    public String toString() {
        String msg = "balance=$" + balance;
        return msg;
    }
}