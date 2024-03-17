package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * The user gives a number: n, and the app
 * prints stars in n lines with descending order
 * starting from n stars and ends to one star.
 */
public class DescendingStarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Please insert a number: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
