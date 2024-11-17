package RecursionAssignment;

public class DecimalToBinaryConverter {
    // recursive function to convert dec to binary
    public static String decimalToBinary(int n) {
        // base case
        if (n == 0) {
            return ""; // return empty string
        }
        // recursive case : divide by 2 and get the remainder (0 or 1)
        return decimalToBinary(n / 2) + n % 2; // append the remainder to the result of the recursive call
    }

    public static void main(String[] args) {
        int number = 33;
        String binary = decimalToBinary(number);

        // handle edge case where the number is 0
        if(binary.equals("")) {
            binary = "0";
        }
        System.out.println("The binary representation of " + number + " is " + binary);
    }

}
