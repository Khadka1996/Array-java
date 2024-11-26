import java.util.*;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 30, 40, 40, 50};
        
        // Use HashSet to remove duplicates
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        // Print the unique elements
        System.out.println("Unique elements:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}
