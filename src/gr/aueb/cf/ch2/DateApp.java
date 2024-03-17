package gr.aueb.cf.ch2;
/**
 * input: 5 12 2022 and print out: 05/12/22
 */

import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        System.out.println("Please insert the date (int):");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt() % 100;

        System.out.printf("The date you inserted is: %02d/%02d/%02d.%n", day, month, year);
    }
}
