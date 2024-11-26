import java.util.*;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array
        System.out.print("Enter numbers separated by commas: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        
        // Converting String array to int array
        int[] arr = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i].trim());
        }

        // Taking input for the element to search
        System.out.print("Enter the element to search for: ");
        int element = scanner.nextInt();

        // Calling the function with input array and element
        Map<String, Object> result = arrayOperations(arr, element);

        // Printing the result
        System.out.println(result);
        
        scanner.close();
    }

    public static Map<String, Object> arrayOperations(int[] arr, int element) {
        Map<String, Object> result = new HashMap<>();

        // Find the largest number
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            largest = Math.max(largest, num);
        }
        result.put("largest", largest);

        // Reverse the array
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        result.put("reversed", reversed);

        // Sum of all elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        result.put("sum", sum);

        // Check if element exists
        boolean containsElement = false;
        for (int num : arr) {
            if (num == element) {
                containsElement = true;
                break;
            }
        }
        result.put("containsElement", containsElement);

        // Remove duplicates (using HashSet)
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        result.put("uniqueArray", uniqueSet);

        // Find the second largest number
        int secondLargest = Integer.MIN_VALUE;
        int firstLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }
        result.put("secondLargest", secondLargest);

        // Find the index of the element
        int indexOfElement = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                indexOfElement = i;
                break;
            }
        }
        result.put("indexOfElement", indexOfElement);

        // Flatten a nested array (if applicable, assuming input is not nested)
        // Here, we assume the array is already flattened
        result.put("flattenArray", arr);

        // Calculate the average of elements
        double average = (double) sum / arr.length;
        result.put("average", average);

        // Sort the array in ascending order
        Arrays.sort(arr);
        result.put("sortedArray", arr);

        return result;
    }
}
