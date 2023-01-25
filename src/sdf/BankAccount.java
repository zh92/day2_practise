package sdf;

import java.util.Date;

public class BankAccount {

    private String accountName;
    private String accountNo;
    private float accountBal;
    private boolean isClosed;
    private String accountTransactions;
    private String accountStartDate;
    private String accountEndDate;

    public String getAccountName() { return accountName; }
    public String getAccountNo() { return accountNo; }
    public float getAccountBal() {return accountBal;}
    public boolean isClosed() {return isClosed;}
    public String getAccountTransactions() {return accountTransactions;}
    public String getAccountStartDate() {return accountStartDate; }
    public String getAccountEndDate() {return accountEndDate;}

    public void setAccountBal(float accountBal) {this.accountBal = accountBal;}
    public void setClosed(boolean isClosed) { this.isClosed = isClosed;}
    public void setAccountTransactions(String accountTransactions) {this.accountTransactions = accountTransactions;}
    public void setAccountStartDate(String accountStartDate) {this.accountStartDate = accountStartDate;}
    public void setAccountEndDate(String accountEndDate) { this.accountEndDate = accountEndDate;}

    public BankAccount(String accountName) {
        this.accountName = accountName;
        this.accountBal = 0;
    }

    public BankAccount(String accountName, float accountBal) {
        this.accountName = accountName;
        this.accountBal = accountBal;
    }

    public void deposit (float deposit) throws IllegalArgumentException {
        if (deposit > 0.0) {
            this.accountBal += deposit;
        }
    }

    public void withdraw (float withdrawal) throws IllegalArgumentException {
        if (withdrawal < this.accountBal) {
            this.accountBal -= withdrawal;
        } else {
            System.out.println("Cannot withdraw more than account balance.");
        }
    }

}