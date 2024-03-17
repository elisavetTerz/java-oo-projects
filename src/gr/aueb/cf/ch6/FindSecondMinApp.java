package gr.aueb.cf.ch6;

public class FindSecondMinApp {

    public static void main(String[] args) {
        int[] myArray = new int[]{10, 7, 90, 8, 56, 3, 2, 9};
        int secondMinIndex = 0;

        secondMinIndex = getSecondMinIndex(myArray, 0, myArray.length - 1);
        System.out.printf("The Second Minimum value is %d, in position: %d", myArray[secondMinIndex], secondMinIndex);

    }

    public static int getSecondMinIndex(int[] arr, int low, int high) {
        int minIndex = low;
        int secondMinIndex = low;
        int minValue;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Error");
            return -1;
        }

        minValue = arr[low];
        for (int i = low ; i <= high; i++) {
            if (arr[i] < minValue) {
                secondMinIndex = minIndex;
                minIndex = i;
                minValue = arr[i];
            }
        }
        return secondMinIndex;
    }
}

