import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 50, 20};
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
