public class ArrayCreationExample {
    public static void main(String[] args) {
        // Create an array of size 5
        int[] numbers = new int[5];

        // Assign values to the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }

        // Print array elements
        System.out.println("Array elements after creation:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
