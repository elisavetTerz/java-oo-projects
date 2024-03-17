package gr.aueb.cf.ch11;


import gr.aueb.cf.ch11.model.User;
import gr.aueb.cf.ch11.model.UserCredentials;

public class Main {

    public static void main(String[] args) {
        User alice = new User(1L, "Alice", "D.");
        UserCredentials alice88 = new UserCredentials(1000000L, "alice88", "12345");

        System.out.println(alice.userToString());
        System.out.println(alice88.userCredentialsToString());

    }
}
