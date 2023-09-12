import java.util.Scanner;

public class Sum_of_array_elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] userArray = inputArray(scanner, length);

        int sum = calculateSum(userArray);

        System.out.println("Sum of array elements: " + sum);

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

    // Method to calculate the sum of array elements
    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
