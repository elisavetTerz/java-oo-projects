package gr.aueb.cf.ch19.service;

import gr.aueb.cf.ch19.dao.IAccountDAO;
import gr.aueb.cf.ch19.dto.AccountInsertDTO;
import gr.aueb.cf.ch19.dto.AccountUpdateDTO;
import gr.aueb.cf.ch19.dto.UserInsertDTO;
import gr.aueb.cf.ch19.dto.UserUpdateDTO;
import gr.aueb.cf.ch19.model.Account;
import gr.aueb.cf.ch19.model.User;
import gr.aueb.cf.ch19.service.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch19.service.exceptions.IbanNotValidException;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    private final IAccountDAO dao;

    //This Constructor does the wiring of DAO to Service Layer
    public AccountServiceImpl(IAccountDAO dao) {
        this.dao = dao;
    }


    @Override
    public Account insertAccount(AccountInsertDTO accountInsertDTO) throws IbanNotValidException {
        Account account;

        try {
            account = mapFromInsertDTO(accountInsertDTO);
            if (dao.ibanExists(account.getIban())) {
                throw new IbanNotValidException("Iban already exists");
            }

            if (dao.userExists(account.getUser().getSsn())) {
                System.out.println("User already exists");
            }
            System.out.println("User " + account.getUser().getFirstname() + " " + account.getUser().getLastname() + " imported, SUCCESS!");

            return dao.insert(account);
        } catch (IbanNotValidException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account updateAccount(AccountUpdateDTO oldDTO, AccountUpdateDTO newDTO) throws AccountNotFoundException {

        Account oldAccount;
        Account newAccount;

        try {
            oldAccount = mapFromUpdateDTO(oldDTO);
            newAccount = mapFromUpdateDTO(newDTO);

            if (!dao.ibanExists(oldAccount.getIban())) {
                throw new AccountNotFoundException(oldDTO.getIban());
            }

            return dao.update(oldAccount, newAccount);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteAccountById(Long id) throws AccountNotFoundException {
        try {
            if (!dao.idExists(id)) {
                throw new AccountNotFoundException(id);
            }
            dao.delete(id);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account getAccountById(Long id) throws AccountNotFoundException {
        Account account;

        try {
            account = dao.get(id);
            if (account == null) {
                throw new AccountNotFoundException(id);
            }
            return account;
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteAccountByIban(String iban) throws AccountNotFoundException {
        try {
            if (!dao.ibanExists(iban)) {
                throw new AccountNotFoundException(iban);
            }
            dao.delete(iban);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account getAccountByIban(String iban) throws AccountNotFoundException {
        Account account;
        try {
            account = dao.get(iban);
            if (account == null) {
                throw new AccountNotFoundException(iban);
            }
            return account;
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Account> getAllAccounts() {
        return dao.getAll();
    }

    @Override
    public double getBalanceByIban(String iban) throws AccountNotFoundException {
        Account account;
        try {
            account = dao.get(iban);
            if (account == null) {
                throw new AccountNotFoundException(iban);
            }
            return account.getAccountBalance();

        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }


    private User mapFromInsertDTO(UserInsertDTO userInsertDTO) {
        return new User(userInsertDTO.getFirstname(), userInsertDTO.getLastname(), userInsertDTO.getSsn());
    }

    private Account mapFromInsertDTO(AccountInsertDTO accountInsertDTO) {
        User user = mapFromInsertDTO(accountInsertDTO.getUserInsertDTO());
        return new Account(accountInsertDTO.getIban(), user, accountInsertDTO.getBalance());
    }

    private User mapFromUpdateDTO(UserUpdateDTO userUpdateDTO) {
        return new User(userUpdateDTO.getFirstname(), userUpdateDTO.getLastname(), userUpdateDTO.getSsn());
    }

    private Account mapFromUpdateDTO(AccountUpdateDTO accountUpdateDTO) {
        User user = mapFromUpdateDTO(accountUpdateDTO.getUserUpdateDTO());
        return new Account(accountUpdateDTO.getIban(), user, accountUpdateDTO.getBalance());
    }

}
