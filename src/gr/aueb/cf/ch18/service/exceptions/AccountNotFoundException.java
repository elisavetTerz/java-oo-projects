package gr.aueb.cf.ch18.service.exceptions;

import gr.aueb.cf.ch18.model.Account;

public class AccountNotFoundException extends Exception {
    private static final long serialVersionUID = 67235093L;

    public AccountNotFoundException(String iban) {
        super("The account with iban : " + iban + " not found");
    }
    public AccountNotFoundException(Long id) {
        super("The account with id: " + id + " not found");
    }
    public AccountNotFoundException(Account account) {
        super("The mobile contact with id: " + account.getId()
                + " and phone number: " + account.getIban()
                + " not found");
    }
}
