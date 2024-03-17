package gr.aueb.cf.ch12.bankapp.model;

/**
 *
 */

public class JointAccount {
    private String iban;
    private String holder1;
    private String holder2;
    private long ssn;
    private double balance;

    public JointAccount() {
    }

    public JointAccount(String iban, String holder1, String holder2, long ssn, double balance) {
        this.iban = iban;
        this.holder1 = holder1;
        this.holder2 = holder2;
        this.ssn = ssn;
        this.balance = balance;
    }

    public JointAccount(JointAccount jointAccount) {
        iban = jointAccount.getIban();
        ssn = jointAccount.getSsn();
        balance = jointAccount.getBalance();
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolder1() {
        return holder1;
    }

    public void setHolder1(String holder1) {
        this.holder1 = holder1;
    }

    public String getHolder2() {
        return holder2;
    }

    public void setHolder2(String holder2) {
        this.holder2 = holder2;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public double getAccountBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "holder1= '" + holder1 + "' , " +
                "holder2= '" + holder2 + "' , " +
                "balance= " + balance +
                '}';
    }

}
