public class ArrayElementAssignmentExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Modify the 3rd element (index 2)
        numbers[2] = 100;
        
        // Print the modified array
        System.out.println("Modified array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
