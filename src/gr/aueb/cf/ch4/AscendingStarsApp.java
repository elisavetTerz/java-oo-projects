package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * We gonna create a xmas tree from stars.
 * The user gives a number of rows: n, which represents the height of the tree.
 * The app prints stars in n lines with ascending order , with step = 2 and symmetric.
 * starting from 1 star and ends to n+1 stars.
 */
public class AscendingStarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfRows =  0;
        int numOfColumns = 0;
        int spaces = 0; //shows the spaces before the stars
        boolean numIsPositive = false;
        System.out.println("Please insert a number: ");

        while(!numIsPositive) {
            numOfRows = scanner.nextInt();
            if(numOfRows >0) {
                numIsPositive = true;
                numOfColumns = (numOfRows * 2) -1;
                spaces = numOfColumns / 2;

                for (int i = 0; i <= numOfRows; i++) { //if i=1 we do not print the first star.
                    for (int j = 0; j <= spaces; j++) { //important to make the tree symmetric.
                        System.out.print(" ");
                    }
                    for (int k=0; k <= i * 2; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    spaces--;
                }
                System.out.println("MERRY XMAS XOXOXO");
            } else {
                System.out.println("Please insert a positive number: ");
            }
        }
    }
}
