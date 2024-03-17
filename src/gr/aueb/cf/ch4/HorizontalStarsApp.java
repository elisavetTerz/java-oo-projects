package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * The user gives a number: n, and the app
 * prints n star in 1 line horizontally.
 */
public class HorizontalStarsApp {

    public static void main(String[] args) {
        boolean isPositiveNum = false;
        int num = 0;
        System.out.println("Please insert a number: ");
        Scanner scanner = new Scanner(System.in);

        while (!isPositiveNum) {
            num = scanner.nextInt();

            if (num > 0) {
                isPositiveNum = true;
                for (int i = 1; i <= num; i++) {
                    System.out.printf("*", num);
                }

                    System.out.println((num == 1)?"\nYou chose to print " + num +  " star." : "\nYou chose to print " + num +" stars.");

            } else {
                System.out.println("Please insert a number greater then zero: ");
            }
        }


    }
}
