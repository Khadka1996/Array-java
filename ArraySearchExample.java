public class ArraySearchExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
