package gr.aueb.cf.ch19.dao;

import gr.aueb.cf.ch19.model.Account;

import java.util.List;

public interface IAccountDAO {
    Account insert(Account account); //Create

    Account update(Account oldAccount, Account newAccount); //Update

    void delete(Long id); //Delete

    Account get(Long id);

    List<Account> getAll();

    Account get(String iban);

    boolean ibanExists(String iban);

    boolean idExists(Long id);


    boolean userExists(String ssn);

    void delete(String iban);
}
