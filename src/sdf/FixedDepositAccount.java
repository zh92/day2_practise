package sdf;

public class FixedDepositAccount {
    
    private String accountName;
    private String accountNo;
    private float accountBal;
    private boolean isClosed;
    private String accountTransactions;
    private String accountStartDate;
    private String accountEndDate;
    private float interest;
    private Integer duration;

    public String getAccountName() { return accountName; }
    public String getAccountNo() { return accountNo; }
    public float getAccountBal() {
        accountBal = (accountBal * (interest/100) * (duration/12));
        return accountBal;
    }
    public boolean isClosed() {return isClosed;}
    public String getAccountTransactions() {return accountTransactions;}
    public String getAccountStartDate() {return accountStartDate; }
    public String getAccountEndDate() {return accountEndDate;}

    public void setAccountBal(float accountBal) {this.accountBal = accountBal;}
    public void setClosed(boolean isClosed) { this.isClosed = isClosed;}
    public void setAccountTransactions(String accountTransactions) {this.accountTransactions = accountTransactions;}
    public void setAccountStartDate(String accountStartDate) {this.accountStartDate = accountStartDate;}
    public void setAccountEndDate(String accountEndDate) { this.accountEndDate = accountEndDate;}

    public float getInterest() {return interest;}
    public void setInterest(float interest) {this.interest = interest;}
    public Integer getDuration() {return duration;}
    public void setDuration(Integer duration) {this.duration = duration;}
    

    public FixedDepositAccount(String accountName, float accountBal) {
        this.accountName = accountName;
        this.accountBal = accountBal;
    }
    
    public FixedDepositAccount(String accountName, float accountBal, float interest) {
        this.accountName = accountName;
        this.accountBal = accountBal;
        this.interest = interest;
    }
    
    public FixedDepositAccount(String accountName, float accountBal, float interest, Integer duration) {
        this.accountName = accountName;
        this.accountBal = accountBal;
        this.interest = interest;
        this.duration = duration;
    }

    public void deposit (float deposit) throws IllegalArgumentException {
        //No operation
    }

    public void withdraw (float withdrawal) throws IllegalArgumentException {
      //No operation
    }

}
