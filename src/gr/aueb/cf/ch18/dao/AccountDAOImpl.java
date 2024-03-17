package gr.aueb.cf.ch18.dao;


import gr.aueb.cf.ch18.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {
    private static final List<Account> accounts = new ArrayList<>();


    @Override
    public Account insert(Account account) {
        accounts.add(account);
        return account;
    }

    @Override
    public Account update(Account oldAccount, Account newAccount) {
        accounts.set(accounts.indexOf(oldAccount), newAccount);
        return newAccount;
    }

    @Override
    public void delete(Long id) {
        accounts.removeIf(account -> account.getId().equals(id));
    }

    @Override
    public Account get(Long id) {
        //Optional is a wrapper class, with orElse method
        Optional<Account> account = accounts.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();

        return account.orElse(null);
    }

    @Override
    public List<Account> getAll() {
        //We do NOT want to return a reference, but a copy by creating a new ArrayList with the contacts
        return new ArrayList<>(accounts);
    }

    @Override
    public Account get(String iban) {
        Optional<Account> account = accounts.stream()
                .filter(c -> c.getIban().equals(iban))
                .findFirst();
        return account.orElse(null); //if contact not found returns null
    }

    @Override
    public boolean ibanExists(String iban) {
        return accounts.stream()
                .anyMatch(c -> c.getIban().equals(iban));
    }

    public boolean idExists(Long id) {
        return accounts.stream()
                .anyMatch(c -> c.getId().equals(id));
    }

    @Override
    public boolean userExists(String ssn) {
        return accounts.stream()
                .anyMatch(c -> ssn.equals(c.getUser().getSsn()));
    }

    @Override
    public void delete(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));

    }
}
