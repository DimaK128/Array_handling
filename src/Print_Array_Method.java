public class Print_Array_Method {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 2, 9};

        System.out.println("Array elements:");
        printArray(array);
    }

    // Method to print an array in a user-friendly way
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", "); // Add a comma and space after each element (except the last one)
            }
        }
        System.out.println("]"); // Print closing square bracket to complete the output
    }
}
