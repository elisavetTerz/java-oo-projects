package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Fahrenheit to Celsius
 *(5/9) * (F-32)
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        int tempFahrenheit = 0;
        int tempCelsius = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the temperature in Fahrenheit (int):");
        tempFahrenheit = scanner.nextInt();
        tempCelsius = (tempFahrenheit - 32) * 5/9;
        System.out.printf("The %d°F is %d°C",tempFahrenheit, tempCelsius);
    }
}
