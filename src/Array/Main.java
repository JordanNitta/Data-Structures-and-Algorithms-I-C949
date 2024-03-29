package Array;

public class Main {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10); // Create an instance of SingleDimensionArray with size 10
        sda.insert(0,0); // Insert value 0 at index 0
        sda.insert(1, 10); // Insert value 10 at index 1
        sda.insert(2,20); // Insert value 20 at index 2
        sda.insert(1,30); // Try to insert value 30 at index 1 (should print "This cell is already occupied")
        sda.insert(12, 120); // Try to insert value 120 at index 12 (should print "This cell is already occupied")

        /*
         int firstElement = sda.arr[1]; // creating a var to get the second element in array
        System.out.println(firstElement);

        System.out.println("Array Traversal");
        sda.traverseArray(); // 0, 10, 20, Default value that comes from the interger -2147483648 -2147483648 -2147483648 -2147483648 -2147483648 -2147483648

         */

        sda.searchInArray(20);
        sda.searchInArray(10);

        sda.deleteValue(2);
    }
}

