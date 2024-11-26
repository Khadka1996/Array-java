public class AnonymousArrayExample {
    public static void main(String[] args) {
        // Pass an anonymous array directly to a method
        printArray(new int[]{5, 10, 15, 20});
    }

    public static void printArray(int[] array) {
        System.out.println("Anonymous Array Elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
