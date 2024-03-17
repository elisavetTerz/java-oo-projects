package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * The user gives a number: n, and the app
 * prints one star in n lines vertically.
 */

public class VerticalStarsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Please insert a number: ");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
        System.out.printf("You chose to print a star: %d times", num);
    }
}
