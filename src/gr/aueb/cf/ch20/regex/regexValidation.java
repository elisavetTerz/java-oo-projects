package gr.aueb.cf.ch20.regex;

import java.util.Scanner;

public class regexValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for email input
        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        // Email validation
        if (isEmail(email)) {
            System.out.println("Valid email.");

            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Valid password.");
            } else {
                System.out.println("Invalid password.");
            }
        }
    }

    public static boolean isValidPassword(String password) {
        // Regex pattern for password validation
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#?!@$%^&*])[A-Za-z\\d#?!@$%^&*]{8,}$";
        return password.matches(regex);
    }

    public static boolean isEmail(String email) {
        return email.matches("^[a-zA-Z.%+-_]+@\\w+\\.[a-zA-Z]{2,}$");
    }

}
