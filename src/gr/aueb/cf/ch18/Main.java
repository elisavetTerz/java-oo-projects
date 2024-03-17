package gr.aueb.cf.ch18;

import gr.aueb.cf.ch18.dao.AccountDAOImpl;
import gr.aueb.cf.ch18.dao.IAccountDAO;
import gr.aueb.cf.ch18.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.dto.UserInsertDTO;
import gr.aueb.cf.ch18.model.Account;
import gr.aueb.cf.ch18.model.User;
import gr.aueb.cf.ch18.service.AccountServiceImpl;
import gr.aueb.cf.ch18.service.IAccountService;
import gr.aueb.cf.ch18.service.exceptions.IbanNotValidException;

public class Main {
    public static void main(String[] args) throws IbanNotValidException {
        UserInsertDTO user1InsertDTO = new UserInsertDTO("theo", "haha", "12345");
        UserInsertDTO user2InsertDTO = new UserInsertDTO("savet", "hoho", "12347");

        AccountInsertDTO account1InsertDTO = new AccountInsertDTO("010101", user1InsertDTO, 0.0);
        AccountInsertDTO account2InsertDTO = new AccountInsertDTO("020202", user2InsertDTO, 100.0);

        User user  = new User("theo", "haha", "12345");
        Account account = new Account("010101", user, 0.0);

        IAccountDAO accountDAO = new AccountDAOImpl();
        accountDAO.insert(account);

        IAccountService accountServiceImpl = new AccountServiceImpl(accountDAO);
        accountServiceImpl.insertAccount(account2InsertDTO);
        accountServiceImpl.insertAccount(account1InsertDTO);
    }
}
