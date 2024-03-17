package gr.aueb.cf.ch6b;

/**
 * Search in a given array a specific number
 * and print out the first index (lowIndex) and the last index (highIndex)
 * where the number is found
 */
public class BinarySearchLowHigh {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int[] position = new int[2];

        position = getLowAndHighIndexOf(arr, 8);

        System.out.println(position[0] == -1 ? "Key not found" : position[0] + " " + position[1]);
    }

    public static int[] getLowAndHighIndexOfTHEO(int[] arr, int key) {
        int lowIndex = 0;
        boolean lowIndexFound = false;
        int highIndex = 0;
        int[] position = new int[2];

        if (arr == null) throw new RuntimeException("Empty Array");

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i] && !lowIndexFound) {
                lowIndex = i;
                highIndex = i;
                lowIndexFound = true;
            } else if (key == arr[i]) {
                highIndex = i;
            }
        }
        position[0] = lowIndex;
        position[1] = highIndex;
        return position;

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int lowIndex = -1;
        int highIndex = -1;
        int[] position = new int[] {lowIndex, highIndex};

        if (arr == null) throw new RuntimeException("Empty Array");

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                lowIndex = i;
                for (int j = arr.length - 1; j >= lowIndex; j--) {
                    if (key == arr[j]) {
                        highIndex = j;
                        position[0] = lowIndex;
                        position[1] = highIndex;
                        return position;
                    }
                }
            }
        }
        return position;

    }
}
