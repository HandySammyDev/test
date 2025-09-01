package ver2;

public class AccountTest {
    private static void testAccountCreationWithNameAndBalance() {
        System.out.println("-->testAccountCreationWithNameAndBalance()");
        Account a1 = new Account("Ceasar", 1000.0);
        System.out.println("balance should be $1000, balance=$" + a1.getBalance());
        System.out.println("name should be 'Ceasar', name=" + a1.getName());
    }

    private static void testAccountCreationWithBalanceOnly() {
        System.out.println("-->testAccountCreationWithBalanceOnly()");
        Account a1 = new Account(1000.0);
        System.out.println("balance should be $1000, balance=$" + a1.getBalance());
        System.out.println("name should be 'Unknown', name=" + a1.getName());
    }

    private static void testMergeAccount_Successful() {
        System.out.println("-->testMergeAccount_Successful()");
        Account a1 = new Account("Shay", 1000.0);
        Account a2 = new Account("Shay", 500.0);
        a1.mergeAccount(a2);
        System.out.println("balance for a1 should be $1500, balance=$" + a1.getBalance());
    }

    private static void testMergeAccount_Unsuccessful() {
        System.out.println("-->testMergeAccount_Unsuccessful()");
        Account a1 = new Account("Shay", 1000.0);
        Account a2 = new Account("Wren", 500.0);
        a1.mergeAccount(a2);
        System.out.println("balance for a1 should be $1000, balance=$" + a1.getBalance());
    }


    public static void main(String[] args){
        testAccountCreationWithNameAndBalance();
        testAccountCreationWithBalanceOnly();
        testMergeAccount_Successful();
        testMergeAccount_Unsuccessful();
    }
}
