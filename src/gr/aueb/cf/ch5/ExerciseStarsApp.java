package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Create an app with the following menu:
 * 1. Appear  n stars horizontal.
 * 2. Appear n stars vertical.
 * 3. Appear n lines with n stars.
 * 4. Appear n lines with 1 to n stars ascending.
 * 5. Appear n lines with n to 1 star descending.
 * 6. Exit.
 * Then:
 * Make a choice and the give a number n
 */

public class ExerciseStarsApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int num = 0;
        int result = 0;

        /* Main method implements the basic repeating procedure:
        to print the menu and get the choice of user
         */
        do {
            printMenu();
            choice = getUserChoice();

            if(choice < 1 || choice > 6) {
                System.out.println("Wrong choice");
                continue;
            } else if (choice == 6){
                System.out.println("Exit Completed");
                break;
            }
            System.out.println("Please insert a number: ");
            num = getOneNumber();
            result = getResult(choice, num);
        } while (true);
        System.out.println("Thanks for using our app!");
    }

    /* First method is a void (no return): prints out  a menu of choices for the user. */
    public static void printMenu() {
        System.out.println("Please choose one of the followings: ");
        System.out.println("1. Appear n stars horizontally.");
        System.out.println("2. Appear n stars vertical.");
        System.out.println("3. Appear n lines with n stars.");
        System.out.println("4. Appear n stars ascending.");
        System.out.println("5. Appear n stars descending.");
        System.out.println("6. Exit.");
    }

    /**
     * Method type int is used in the main method
     * @return the number of user choice
     */
    public static int getUserChoice() {
        return scanner.nextInt();
    }

    /**
     * Method type int is used in the getResult method
     * inside the switch
     * @return the int num of stars that user chose
     */
    public static int getOneNumber() {
        return scanner.nextInt();
    }

    /**
     * Void method is used inside the main with
     * @param choice user's choice
     *               according to the choice a specific method for star
     *               creation is called inside a switch with cases
     */
    public static int getResult(int choice, int num) {
        int result = 0;

        switch (choice) {
            case 1:
                result = appearStarsHorizontal(num);
                break;
            case 2:
                result = appearStarsVertical(num);
                break;
            case 3:
                result = appearStarsLines(num);
                break;
            case 4:
                result = appearStarsAscending(num);
                break;
            case 5:
                result = appearStarsDescending(num);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
        return result;
    }

    /**
     * Methods int type which calculate the stars based on num:
     * @param num shows the number of stars - inserted from user
     * @return the stars in a specific way
     */
    public static int appearStarsHorizontal(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println();
        return num;
    }
    public static int appearStarsVertical(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("*\n");
        }
        return num;
    }
    public static int appearStarsLines(int num) {
        for (int i = 0; i < num; i++) {
            // appearStarsHorizontal(num);
            for (int j = 0; j < num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        return num;
    }
    public static int appearStarsAscending(int num) {
        for (int i = 0; i < num; i++) {
            // appearStarsHorizontal(num + 1);
            for( int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        return num;
    }
    public static int appearStarsDescending(int num) {
        for (int i = 0; i < num; i++) {
            // appearStarsHorizontal(num - i);
            for( int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        return num;
    }
}
