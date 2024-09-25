
// 1. insert
//2. Traverse
//3. delete
//4. search for an element



public class SingleDimension {
    int[] arr = null;

    //constructor
    public SingleDimension(int sizeOfArray){
      arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    //insert method
    public void insert(int valueToInsert, int index){
      try {
          if (arr[index] == Integer.MIN_VALUE){
                arr[index] = valueToInsert;
                System.out.println("Value inserted successfully");
      } else {
            System.out.println("Index is already occupied");
          }
    } catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Index out of bounds"); //printing out the exception best practice , need to handle the exception
      }
    }
// Traverse an array method
    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e){
            System.out.println("Array no longer exists");
        }
    }
    // search for an element
    public void searchInArray(int valueToSearch){
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == valueToSearch){
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
      //  System.out.println(valueToSearch + " is not found in the array");
    }
    //delete an element
    public void deleteValueAtIndex(int index){
        try {
            arr[index] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }
    public static void main(String[] args) {
        SingleDimension singleDimension = new SingleDimension(4);
        singleDimension.insert(3, 0);
        singleDimension.insert(4, 1);
        singleDimension.insert(5, 2);
        singleDimension.insert(6, 3);
        //print out the array

        singleDimension.traverseArray();
        singleDimension.deleteValueAtIndex(2);

        singleDimension.searchInArray(5);



        }
}
