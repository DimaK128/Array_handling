import java.util.Scanner;

public class Input_Array_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] userArray = inputArray(scanner, length);

        System.out.println("Entered array:");
        printArray(userArray);

        scanner.close();
    }

    // Method for array input by the user
    private static int[] inputArray(Scanner scanner, int length) {
        int[] array = new int[length];

        System.out.println("Please enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
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
}
