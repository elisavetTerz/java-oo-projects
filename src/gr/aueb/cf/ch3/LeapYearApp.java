package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * there are 366 days in the leap year!
 * divisible by 4 and not divisible by 100
 * or divisible by 400
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean theYearIsLeap = false;

        System.out.println("Do you want to know if a year is leap?" +
                "Please insert a year (4 digits):");
        year = scanner.nextInt();
        if ((year % 4 == 0) && (year % 100) != 0) {
            System.out.printf("The year %d is leap year!", year);
        } else if (year % 4 == 0) {
            System.out.printf("The year %d is leap year!", year);
        } else {
            System.out.printf("The year %d is NOT a leap year!", year);
        }

    }
}
