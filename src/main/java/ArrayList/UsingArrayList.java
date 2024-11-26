package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30,40,50,60));
        numbers.add(70);
        numbers.add(80);
        numbers.remove(5);
        System.out.println(numbers);
        numbers.trimToSize();

        //Iterating over elements
        for (int i = 0; i < numbers.size(); i++){
            int element = numbers.get(i);
//            System.out.println(element);
        }

        //using enhanced forloop
        for (int element : numbers){
//            System.out.println(element);
        }

        //foreach
        numbers.forEach(element -> {
//            System.out.println(element);
        });

        //Stream

        ArrayList<String> namesOfStudents = new ArrayList<>(Arrays.asList("Dawson", "Steve", "Lisa", "Radwan"));
        namesOfStudents.stream().forEach(name -> {
//            String namesInCaps = name.toUpperCase();
//            System.out.println(name.toUpperCase());
        });

        //Iterator traversal
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }

}
