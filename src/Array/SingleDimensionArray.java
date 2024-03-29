package Array;

// SingleDimensionArray class representing a single-dimensional array
public class SingleDimensionArray {
    int arr[] = null; // Array declaration

    // Constructor initializing the array with specified size and filling it with minimum integer value
    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray]; // Create an array of integers with the specified size
        for (int i = 0; i < arr.length; i++) { // Loop through each element of the array
            arr[i] = Integer.MIN_VALUE; // Fill each element with the minimum integer value
        }
    }

    // Method to insert a value into a specific location within the array
    public void insert(int location, int valueToBeInserted) {
        try { // Try block to catch potential ArrayIndexOutOfBoundsException
            if (arr[location] == Integer.MIN_VALUE) { // Check if the specified location is empty
                arr[location] = valueToBeInserted; // Insert the value into the specified location
                System.out.println("Successfully inserted"); // Print success message
            } else {
                System.out.println("This cell is already occupied"); // Print message if cell is occupied
            }
        } catch (ArrayIndexOutOfBoundsException e) { // Catch ArrayIndexOutOfBoundsException
            System.out.println("This cell is already occupied"); // Print message if index is out of bounds
        }
    }

    // Array Traversal
    public void traverseArray(){
        try{
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        } catch(Exception e){
            System.out.println("Not working");
        }

    }

    // Search for an element in the given Array
    public void searchInArray(int valueToSearch){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == valueToSearch){
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    // Delete value from array
    public void deleteValue(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range of array");
        }
    }

}




