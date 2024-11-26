public class Advanced3DArraySum {
    
    // Recursive method to calculate sum of elements in a 3D array
    public static int calculateSum(int[][][] numbers, int row, int col, int depth) {
        // Base case: if row is out of bounds, return 0
        if (row == numbers.length) {
            return 0;
        }
        
        // Base case: if col is out of bounds, move to the next row
        if (col == numbers[row].length) {
            return calculateSum(numbers, row + 1, 0, 0); // Move to the next row
        }
        
        // Base case: if depth is out of bounds, move to the next column
        if (depth == numbers[row][col].length) {
            return calculateSum(numbers, row, col + 1, 0); // Move to the next column
        }
        
        // Recursive case: add the current element and continue with next depth
        return numbers[row][col][depth] + calculateSum(numbers, row, col, depth + 1);
    }
    
    public static void main(String[] args) {
        // Declare and initialize a 3D array of integers
        int[][][] numbers = {
            {
                {100, 2, 3}, 
                {4, 5, 6}
            },
            {
                {7, 8, 9}, 
                {10, 11, 12}
            },
            {
                {13, 14, 15}, 
                {16, 17, 18}
            }
        };
        
        // Call the recursive method to calculate the sum of the 3D array
        int sum = calculateSum(numbers, 0, 0, 0);
        
        // Print the result
        System.out.println("Sum of the 3D array elements: " + sum);
    }
}
