package gr.aueb.cf.ch8;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        final int EXIT = 5;
        int choice = 0;

        while (true) {
            System.out.println("Please choose one of the following:");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            choice = getChoice();

            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }

            if (choice == EXIT) {
                System.out.println("EXIT SUCCESSFULL");
                break;
            }

        }
    }

    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        // check if choice is an integer
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            System.out.println("Please insert a valid choice: ");
            scanner.nextLine();
        }
        return choice;
    }

    public static void printChoice(int choice) throws IllegalArgumentException {

        if ( choice > 0 && choice < 6) {
            System.out.println("Your choice is number: " + choice);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
