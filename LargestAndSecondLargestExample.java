public class LargestAndSecondLargestExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Find largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        System.out.println("Largest element: " + largest);
        System.out.println("Second largest element: " + secondLargest);
    }
}
