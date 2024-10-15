package Array;

public class DoubleDimension {
    int [][] arr = null;

    // constructor
    public DoubleDimension(int rows, int cols){
        arr = new int[rows][cols];
        for (int i= 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }
    // insert method
    public void insert(int valueToInsert, int row, int col) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = valueToInsert;
                System.out.println("Value inserted successfully");
            }else {
                System.out.println("Index is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }
    // method to traverse the array
    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println(arr[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e){
            System.out.println("Array no longer exists");
        }
    }
    // method to search an element in a 2D array
    public void SearchInArray(int valueToSearch){
        for (int i= 0; i < arr.length;i++){
            for (int j = 0 ; j< arr[i].length; j++){
                if (arr[i][j] == valueToSearch){
                    System.out.println(valueToSearch + " " + "is found at index (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println(valueToSearch + " is not found in the array\n");
    }
    // method to delete an element from the array
    public void deleteValueAtIndex(int row, int col){
        try {
            arr [row][col] = Integer.MIN_VALUE;
            System.out.println("Value at index (" + row + "," + col + ") deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }
    // Driver to test the methods
    public static void main(String[] args) {
        DoubleDimension doubleDimension = new DoubleDimension(3,3);

        // insert values
        doubleDimension.insert(1,0,0);
        doubleDimension.insert(2,0,1);
        doubleDimension.insert(3,0,2);
        doubleDimension.insert(4,1,0);
        doubleDimension.insert(5,1,1);
        doubleDimension.insert(6,1,2);
        doubleDimension.insert(7,2,0);
        doubleDimension.insert(8,2,1);
        doubleDimension.insert(9,2,2);


        // traverse the array
        System.out.println("\nTraverse Array after insertion");
        doubleDimension.traverseArray();

        // search for an element
        doubleDimension.SearchInArray(2);
        doubleDimension.SearchInArray(40); // should not be found

        // delete an element
        doubleDimension.deleteValueAtIndex(1,1);

        // Traverse the array after deletion
        System.out.println("Array after deletion");
        doubleDimension.traverseArray();
    }
}