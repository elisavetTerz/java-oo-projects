package gr.aueb.cf.ch1;
import java.util.Scanner;
/**
 * Choose one of the following choices:
 * 1. Add
 * 2. Delete
 * 3. Search
 * 4. Update
 * 5. Exit
 * Give the number of your choice:
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i= 1;
            System.out.printf("%d. Add%n", i++);
            System.out.printf("%d. Delete%n", i++);
            System.out.printf("%d. Search%n", i++);
            System.out.printf("%d. Update%n", i++);
            System.out.printf("%d. Exit%n", i++);

        System.out.println("Please choose a number: ");
        int num;
        num = in.nextInt();
    }
}
