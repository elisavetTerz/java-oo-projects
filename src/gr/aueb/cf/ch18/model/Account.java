package gr.aueb.cf.ch18.model;

import gr.aueb.cf.ch18.service.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch18.service.exceptions.NegativeAmountException;
import gr.aueb.cf.ch18.service.exceptions.SsnNotValidException;

public class Account extends AbstractEntity {
    private String iban;
    private User user;
    private double balance;

    public Account() {

    }

    public Account(String iban, User user, double balance) {
        this.iban = iban;
        this.user = user;
        this.balance = balance;
    }

    public Account(Account account) {
        iban = account.getIban();
        user = account.getUser();
        balance = account.getBalance();
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", holder=" + user +
                ", balance=" + balance +
                '}';
    }

    /*
     * Public API
     */

    /**
     *
     * @param amount
     * @throws NegativeAmountException
     *              if the amount to be deposited is negative.
     */
    public void deposit(double amount) throws NegativeAmountException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            balance += amount;
        } catch (NegativeAmountException e) {
            System.err.println("Negative amount exception");
            throw e;
        }
    }

    public void withdraw(double amount, String ssn)
            throws InsufficientBalanceException, SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }
            balance -= amount;
        } catch (InsufficientBalanceException | SsnNotValidException e) {
            System.err.println("Error " + e.getMessage());
            throw e;
        }
    }

    public double getAccountBalance() {
        return balance;
    }

    protected boolean isSsnValid(String ssn) {
        if (ssn == null || getUser().getSsn() == null) return false;

        return getUser().getSsn().equals(ssn);
    }
}