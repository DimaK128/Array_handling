import java.util.Scanner;
import java.util.Random;

public class Largest_value_in_an_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] userArray = createRandomArray(length);

        System.out.println("Randomly generated array:");
        printArray(userArray);

        int largestValue = findLargestValue(userArray);

        System.out.println("Largest value in the array: " + largestValue);

        scanner.close();
    }

    // Method to create an array with random values
    private static int[] createRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // Generate random values between 0 and 99
        }

        return array;
    }

    // Method to print an array
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element + " ");
        }
        System.out.println(); // Print a newline to complete the output
    }

    // Method to find the largest value in an array
    private static int findLargestValue(int[] array) {
        int largest = array[0];
        for (int element : array) {
            if (element > largest) {
                largest = element;
            }
        }
        return largest;
    }
}
