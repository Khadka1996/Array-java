import java.util.ArrayList;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements to the list

        list.add(0);
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);

        System.out.println(list);

        //get element count
        int element = list.get(3);
        System.out.println("Element at index 3: " + element);

        // add element
        list.add(1,66);
        System.out.println("List after adding element at index 1: " + list);

        //set element in between

        list.set (1,55);
        System.out.println("list after setting element at index 0: " + list);

        // remove element
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        //remove all elements
        // list.clear();
        // System.out.println("List after clearing all elements: " + list);

        //size
        int size = list.size();
        System.out.println("Size of list: " + size);

        //sort list
        list.sort(null);
        System.out.println("Sorted list: " + list);

    
        //check if list contains an element
        boolean contains = list.contains(44);
        System.out.println("List contains 44? " + contains);


        //check if list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is list empty? " + isEmpty);

        
    }
}