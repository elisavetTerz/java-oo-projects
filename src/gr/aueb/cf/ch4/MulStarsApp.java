package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * The user gives a number: n, and the app
 * prints n*n stars in a line.
 */
public class MulStarsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;
        boolean isPositive = false;

        System.out.println("Please insert a number: ");
        while (!isPositive) {
            num = scanner.nextInt();
            result = num * num;
            if (num > 0) {
                isPositive = true;

                for (int i = 1; i <= result; i++) {
                    System.out.printf("*", result);
                }
                System.out.println((result == 1)?"\nYou chose to print " + result +  " star." : "\nYou chose to print " + result +" stars.");
            } else {
                System.out.println("Please insert a number greater than zero: ");
            }

        }
    }
}
