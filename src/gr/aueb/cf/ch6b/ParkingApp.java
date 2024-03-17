package gr.aueb.cf.ch6b;

import java.util.Arrays;
import java.util.Comparator;

/**
 * two-dimensional array contains the arrival and departure times of cars.
 * This application reads and prints the maximum number of cars parked during the same time interval.
 * Example: 1st car arrived at 10:12 and departed at 11:36, 3rd car arrived at 10:15 and departed at 10:20.
 * Therefore, the 1st and 3rd cars were present during the same time interval.
 */

public class ParkingApp {

    public static void main(String[] args) {

        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}, {1318, 1417}, {1016, 1025}};
        int[][] newArr = createNewArray(arr);
        int countNumOfCars = calculateMaxParkedCars(newArr);

        // Print the result
        System.out.println("Maximum number of cars parked simultaneously: " + countNumOfCars);
    }
    public static int[][] createNewArray(int[][] arr) {
        int[][] newArr = new int[arr.length * 2][2]; //create a new array with two fields in each row
        // Populate the new array based on the arr
        for (int i = 0; i < arr.length; i++) {
            newArr[2 * i][0] = arr[i][0]; //Arrival time in first column
            newArr[2 * i + 1][0] = arr[i][1]; //Departure time in first column
            //Put flags in column 2: 1 for arrivals and 0 for departures
            newArr[2 * i][1] = 1;
            newArr[2 * i + 1][1] = 0;
        }
        // Sort the newArr based on the first column (arrival/departure time)
        Arrays.sort(newArr, 0, arr.length * 2, Comparator.comparingInt(a -> a[0]));
        return newArr;
    }

    public static int calculateMaxParkedCars (int[][] newArr) {
        int countNumOfCars = 0;
        //print the new array for verification
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("{" + newArr[i][0] + ", " + newArr[i][1] + "}");
            if ( newArr[i][1] == 1) {
                countNumOfCars++;
            }
        }
        return countNumOfCars;
    }
}
