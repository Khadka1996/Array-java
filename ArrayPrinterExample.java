public class ArrayPrinterExample {
    public static void main(String[] args) {
        System.out.println("Program started.");
        
        // Initialize an array of strings
        String[] argh = {"x", "y", "z"};
        
        // Assign argh to args
        args = argh;
        
        // Loop through the array and print each element
        for (String s : args) {
            System.out.print(s);  // Print each string in the array
        }
        System.out.println("\nProgram ended.");
    }
}
