package sdf;

public class Main {
    
    public static void main(String[] args) {
        
        BankAccount bankAcc = new BankAccount("David");
        System.out.println("Account balance: " + bankAcc.getAccountBal());

        bankAcc.deposit(100);
        System.out.println("Account balance: " + bankAcc.getAccountBal());

        bankAcc.withdraw(50);
        System.out.println("Account balance: " + bankAcc.getAccountBal());

        bankAcc.withdraw(80);
        System.out.println("Account balance: " + bankAcc.getAccountBal());

        FixedDepositAccount fixedAcc = new FixedDepositAccount("John", 100, 3, 6);

        System.out.println("Fixed deposit account balance: " + fixedAcc.getAccountBal());
    }
}
