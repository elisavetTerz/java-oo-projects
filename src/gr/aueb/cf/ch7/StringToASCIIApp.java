package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * User gives a String and this app converts every string character to ASCII
 */
public class StringToASCIIApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a string: ");
        String userInput = scanner.next();
       int[] asciiValues = convertToASCII(userInput);

        System.out.println("ASCII values: ");
        for (int value : asciiValues) {
            System.out.print(value + " ");
        }
    }

    public static int[] convertToASCII(String str) {
        int[] asciiValues = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int asciiValue = (int) c;
            asciiValues[i] = asciiValue;
            System.out.printf("ASCII value of %s at position %d is: %d\n", str, i, asciiValue);
        }
        return asciiValues;
    }
}
