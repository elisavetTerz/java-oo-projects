package gr.aueb.cf.ch6c;

import java.util.Arrays;
import java.util.Scanner;

/**
 * User inputs 6 integer number from 1 to 49 in an array
 * and check the following predicates:
 * 1. even numbers more than 3
 * 2. odd numbers more than 3
 * 3. consecutive numbers more than 3
 * 4. more than three numbers with the same ending
 * 5.
 */
public class PredicatesApp {

    public static void main(String[] args) {

        int[] userArray = getUserInputArray();
        System.out.println("There are NOT more than three even numbers in the array: " + maxThreeEvenNumbers(userArray));
        System.out.println("There are NOT more than three odd numbers in the array: " + maxThreeOddNumbers(userArray));
        System.out.println("There are more than three consecutive numbers in the array: " + moreThanThreeConsecutive(userArray));
        System.out.println("There are more than three numbers with the same ending: " + moreThanThreeSameEndings(userArray));
        System.out.println("There are more than three numbers in the same decade: " + moreThanThreeSameDecade(userArray));


//      int[] arr = new int[]{1, 49, 5, 6, 7, 8};
//      int[] counts = moreThanThreeSameEndings(arr);
//      System.out.println(Arrays.toString(counts));

    }

    public static int[] getUserInputArray() {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        do {
            arr = new int[6];
            System.out.println("Choose 6 integer numbers from 1 to 49: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
        } while (!isValidInput(arr));

        return arr;
    }

    private static boolean isValidInput(int[] arr) {
        return arr != null && arr.length == 6 && isInRange(arr);
    }

    private static boolean isInRange(int[] arr) {
        for (int num : arr) {
            if (num < 1 || num > 49) {
                return false;
            }
        }
        return true;
    }

    /**
     * The method traverses the array and counts the even numbers.
     *
     * @param arr the array which contains 6 integer numbers given from the user via Scanner.
     * @return true only if the maximum amount of even numbers in the array is 3.
     */
    public static boolean maxThreeEvenNumbers(int[] arr) {
        int evens = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens <= 3;
    }

    /**
     * The method traverses the array and counts the odd numbers.
     * @param arr the array which contains 6 integer numbers given from the user via Scanner.
     * @return true only if the maximum amount of odd numbers in the array is 3.
     */

    public static boolean maxThreeOddNumbers(int[] arr) {
        int odds = 0;
        for (int item : arr) {
            if (item % 2 != 0) {
                odds++;
            }
        }
        return odds <= 3;
    }

    /**
     * Checks if there are more than three consecutive numbers.
     *
     * @param arr the array which contains 6 integer numbers given from the user via Scanner.
     * @return false if the consecutive numbers are more than 3.
     */

    public static boolean moreThanThreeConsecutive(int[] arr) {
        int cons = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i + 1] - 1) && (arr[i] == arr[i + 2] - 2)) {
                cons++;
            }
        }
        return cons >= 4;
    }

    /**
     * Checking if there are more than three numbers in the array with the same ending.
     *
     * @param arr the array which contains 6 integer numbers given from the user via Scanner.
     * @return true if finds the same last digit more than three times.
     */

    public static boolean moreThanThreeSameEndings(int[] arr) {
        int[] counts = new int[10]; //we are assuming that the endings are in the range: 0 to 9.

        for (int num : arr) {
            int lastDigit = num % 10;
            counts[lastDigit]++; //increments the count of the specific lastDigit, where index = lastDigit;
        }

        for (int count : counts) {
            if (count > 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checking if there are more than three numbers from the same decade.
     * The method is counting the numbers that belong to same decade in a new array.
     * @param arr the array which contains 6 integer numbers given from the user via Scanner.
     * @return true only if count is more than 3.
     */

    public static boolean moreThanThreeSameDecade(int[] arr) {
        int[] decadeCounts = new int[5]; //Number of Range is from 1 to 49 so the decades are 5: 0-10,..., 41-51.

        for (int item : arr) {
            int decade = (item - 1) / 10;
            decadeCounts[decade]++; //increments the count for the specific decade
        }

        for (int count : decadeCounts) {
            if (count > 3) {
                return true;
            }
        }
        return false;
    }
}
