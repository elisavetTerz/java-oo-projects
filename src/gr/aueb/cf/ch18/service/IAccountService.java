package gr.aueb.cf.ch18.service;

import gr.aueb.cf.ch12.bankapp.exceptions.SsnNotValidException;
import gr.aueb.cf.ch18.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.dto.AccountUpdateDTO;
import gr.aueb.cf.ch18.dto.UserInsertDTO;
import gr.aueb.cf.ch18.model.Account;
import gr.aueb.cf.ch18.model.User;
import gr.aueb.cf.ch18.service.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.service.exceptions.IbanNotValidException;


import java.util.List;

public interface IAccountService {
    //Service Layer takes as parameters DTOs

    Account insertAccount(AccountInsertDTO accountInsertDTO)
            throws IbanNotValidException;

    Account updateAccount(AccountUpdateDTO oldDTO, AccountUpdateDTO newDTO)
        throws SsnNotValidException, AccountNotFoundException;

    /**
     *
     * @param id
     * @throws AccountNotFoundException
     */
    void deleteAccountById(Long id) throws AccountNotFoundException;

    /**
     *
     * @param id
     * @return
     * @throws AccountNotFoundException
     */
    Account getAccountById(Long id) throws AccountNotFoundException;
    /**
     *
     * @param iban
     * @throws AccountNotFoundException
     */
    void deleteAccountByIban(String iban) throws AccountNotFoundException;
    /**
     *
     * @param iban
     * @return
     * @throws AccountNotFoundException
     */
    Account getAccountByIban(String iban) throws AccountNotFoundException;

    /**
     *
     * @return
     */
    List<Account> getAllAccounts();

    double getBalanceByIban(String iban) throws IbanNotValidException, AccountNotFoundException;



}
