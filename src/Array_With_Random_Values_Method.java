import java.util.Random;

public class Array_With_Random_Values_Method {
    public static void main(String[] args) {
        int length = 10; // Define the length of the random array
        int[] randomArray = createRandomArray(length);

        System.out.println("Randomly generated array:");
        printArray(randomArray);
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
            System.out.print(element + " ");
        }
        System.out.println(); // Print a newline to complete the output
    }
}