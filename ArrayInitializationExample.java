public class ArrayInitializationExample {
    public static void main(String[] args) {
        // Initialize array all at once
        int[] numbers = {1, 2, 3, 4, 5};

        // Initialize array one element at a time
        int[] moreNumbers = new int[3];
        moreNumbers[0] = 10;
        moreNumbers[1] = 20;
        moreNumbers[2] = 30;

        // Print arrays
        System.out.println("All at once initialization:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nOne at a time initialization:");
        for (int number : moreNumbers) {
            System.out.print(number + " ");
        }
    }
}
