package gr.aueb.cf.ch19.dao;


import gr.aueb.cf.ch19.model.Account;
import gr.aueb.cf.ch19.model.User;

import java.util.*;

public class AccountDAOImpl implements IAccountDAO {
    private static final Map<Long, Account> accounts = new HashMap<>();


    @Override
    public Account insert(Account account) {
        accounts.put(account.getId(), account);
        return account;
    }

    @Override
    public Account update(Account oldAccount, Account newAccount) {
        accounts.put(oldAccount.getId(), newAccount);
        return newAccount;
    }

    @Override
    public void delete(Long id) {
        accounts.remove(id);
    }

    @Override
    public Account get(Long id) {
        return accounts.get(id);
    }

    @Override
    public List<Account> getAll() {
        return new ArrayList<>(accounts.values());
    }

    @Override
    public Account get(String iban) {
        return accounts.values().stream().filter(a -> a.getIban()
                .equals(iban)).findFirst().orElse(null);
    }

    @Override
    public boolean ibanExists(String iban) {
        return accounts.values().stream().anyMatch(c -> c.getIban().equals(iban));
    }

    public boolean idExists(Long id) {
        return accounts.values().stream().anyMatch(c -> c.getId().equals(id));
    }

    @Override
    public boolean userExists(String ssn) {
        return accounts.values().stream().anyMatch(c -> ssn.equals(c.getUser().getSsn()));
    }

    @Override
    public void delete(String iban) {
        accounts.values().removeIf(account -> account.getIban().equals(iban));
    }
}
