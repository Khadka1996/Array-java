public class ArrayAverageExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 13, 35, 50};
        
        // Calculate the sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Calculate the average
        double average = (double) sum / numbers.length;
        
        System.out.println("Average of the array elements: " + average);
    }
}
