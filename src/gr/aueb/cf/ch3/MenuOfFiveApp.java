package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * 1. Insert 2. Delete 3. Update 4. Search 5. Exit
 */
public class MenuOfFiveApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMenu = 0;
        System.out.println("Please select a number from 1 to 5:");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Search");
        System.out.println("5. Exit");
        do {
            numOfMenu = scanner.nextInt();

            if (numOfMenu == 1) {
                System.out.println("You chose number 1. Insert");
            } else if ( numOfMenu == 2) {
                System.out.println("You chose number 2. Delete");
            } else if ( numOfMenu == 3) {
                System.out.println("You chose number 3. Update");
            } else if ( numOfMenu == 4) {
                System.out.println("You chose number 4. Search");
            } else if (numOfMenu > 5 || numOfMenu < 1) {
                System.out.println("Invalid choice. Please select a number from 1 to 5.");
            } else {
                //little bit extra code (not for the exercise)
                System.out.println("Are you sure you want to exit?");
                //Create a new Scanner input: yes or no
                Scanner input = new Scanner(System.in);
                String answer = input.nextLine();
                if (answer.equals("no")){
                    numOfMenu = 7;
                    System.out.println("Please select a number from 1 to 5:");
                } else {
                    System.out.println("Goodbye!");
                }
            }
        } while (numOfMenu != 5);
    }
}
