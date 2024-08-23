public class ArrayOperations {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] scores = {90, 70, 80, 95, 85};

        // Print the array elements
        System.out.println("Original array:");
        printArray(scores);

        // Find the maximum score
        int maxScore = findMax(scores);
        System.out.println("Maximum score: " + maxScore);

        // Sort the array in ascending order
        sortArray(scores);
        System.out.println("Sorted array:");
        printArray(scores);
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method to find the maximum element in an array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    // Method to sort an array in ascending order
    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
