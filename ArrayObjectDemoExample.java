public class ArrayObjectDemoExample {

    public static void main(String[] args) {
        
        // Step 1: Initial 2D array creation (4 rows, 3 columns)
        int[][] a = new int[4][3];  // This creates the array 'a' with 4 rows, 3 columns.
        System.out.println("Step 1: Created 2D array a[4][3]");
        
        // Step 2: Replacing the first row with a new 1D array of size 4
        a[0] = new int[4];  // New 1D array of size 4 assigned to a[0]
        System.out.println("Step 2: Replaced a[0] with a new array of size 4");
        
        // Step 3: Replacing the second row with a new 1D array of size 2
        a[1] = new int[2];  // New 1D array of size 2 assigned to a[1]
        System.out.println("Step 3: Replaced a[1] with a new array of size 2");
        
        // Step 4: Reassigning 'a' to a new 2D array (3 rows, 2 columns)
        a = new int[3][2];  // New 2D array with 3 rows and 2 columns assigned to 'a'
        System.out.println("Step 4: Reassigned a to a new 2D array a[3][2]");
        
        // Displaying the current state of the array
        System.out.println("Current state of array a:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");  // This will print 0 by default, since it's an integer array
            }
            System.out.println();
        }
        
        // As per Java's garbage collection, objects created previously will be eligible for GC after they are no longer referenced.
        System.out.println("\nNote: Objects created in steps 1, 2, and 3 are eligible for GC, as they are no longer referenced.");
    }
}
