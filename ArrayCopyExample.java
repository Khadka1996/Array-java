public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        
        // Copy the reference of the original array to another variable
        int[] copy = original;
        
        // Modify an element in the copied array
        copy[4] = 10;
        
        // Print both arrays
        System.out.println("Original array:");
        for (int num : original) {
            System.out.print(num + " ");
        }

        System.out.println("\nCopied array:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
