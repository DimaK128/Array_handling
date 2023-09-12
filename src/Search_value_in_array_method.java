import java.util.Scanner;

public class Search_value_in_array_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] userArray = new int[length];

        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int searchValue = scanner.nextInt();

        int result = searchValueInArray(userArray, searchValue);

        if (result != -1) {
            System.out.println("Value " + searchValue + " found at index: " + result);
        } else {
            System.out.println("Value " + searchValue + " not found in the array.");
        }

        scanner.close();
    }

    // Method to search for a value in an array
    private static int searchValueInArray(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i; // Return the index if the value is found
            }
        }
        return -1; // Return -1 if the value is not found
    }
}
