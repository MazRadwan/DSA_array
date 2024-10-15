package Stacks;
import java.util.ArrayList;
import java.util.Stack;

public class ReverseString {
    public static boolean isPalindrome(String input){
        Stack<Character> stack = new Stack<>();

        String filteredString = input.replaceAll("[\\W]", "").toLowerCase();
        // push half the characters of the string into the stack
        int length = filteredString.length();
        for(int i =0; i < filteredString.length()/2; i++){
            stack.push(filteredString.charAt(i));
        }

        // compare the second half of the string with the stack
        for(int i = (filteredString.length()+1) /2; i < filteredString.length(); i++){
            if(stack.isEmpty() || stack.pop() != filteredString.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "Do geese see God";
        System.out.println("Is palindrome: " + isPalindrome(string));
    }
}
