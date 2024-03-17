package gr.aueb.cf.ch6;

public class MaxPositionApp {

    public static void main(String[] args) {
        int[] arr = new int[] {4, 7, 12, 32, 43, 2, 54, 8};
        int maxIndex = 0;

        maxIndex = getMaxPosition(arr, 0, arr.length - 1);
        System.out.printf("Max value: %d, Max index: %d", arr[maxIndex], maxIndex);
    }

    public static int getMaxPosition (int[] arr, int low, int high) {
        int maxIndex = high;
        int maxValue;

        if ((low < 0) || (high > arr.length -1)) {
            System.out.println("Error");
            return -1;
        }

        maxValue = arr[high];
        for(int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxIndex = i;
                maxValue = arr[i];
            }
        }
        return maxIndex;
    }
}
