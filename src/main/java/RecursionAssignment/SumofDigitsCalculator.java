package RecursionAssignment;

public class SumofDigitsCalculator {

    // recursive function to find the sum of digits of a number
    public static int sumOfDigits(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
            return (n % 10) + sumOfDigits(n / 10);

    }

    public static void main(String[] args) {
        int number = 82393;
        int sum = sumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is " + sum);
    }
}
