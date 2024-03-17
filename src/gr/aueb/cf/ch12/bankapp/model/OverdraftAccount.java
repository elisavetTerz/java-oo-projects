package gr.aueb.cf.ch12.bankapp.model;


import gr.aueb.cf.ch12.bankapp.exceptions.SsnNotValidException;

public class OverdraftAccount extends JointAccount{

    public OverdraftAccount() {
    }

    public OverdraftAccount(JointAccount jointAccount) {
        super(jointAccount);
    }

    protected boolean isSsnValid(long ssn) {
//      return ssn == 0 || getSsn() == 0 ? false : true;
        return ssn == 0 || getSsn() == 0;
    }


    public void withdraw(double balance, double amount, long ssn) throws SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            setBalance(getBalance() - amount);

        } catch (SsnNotValidException e) {
            System.out.println("Error " + e.getMessage());
            throw e;
        }
    }
}
