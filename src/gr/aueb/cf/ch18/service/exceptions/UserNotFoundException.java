package gr.aueb.cf.ch18.service.exceptions;

import gr.aueb.cf.ch18.model.Account;
import gr.aueb.cf.ch18.model.User;

public class UserNotFoundException extends Exception {
    private static final long serialVersionUID = 67235093L;

    public UserNotFoundException(Long id) {
        super("The user with id: " + id + " not found");
    }
    public UserNotFoundException(User user) {
        super("The user with id: " + user.getId()
                + " not found");
    }
}
