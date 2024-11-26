package Recursion;

public class FinbonacciIterative {

    public int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public int fibonacciRecursive(String recursive, int n) {
        if (n <= 1) {
            return -1;
        }
        return fibonacciRecursive("Recursive", n - 1) + fibonacciRecursive("Recursive", n - 2);
    }

    public static void main(String[] args) {
        FinbonacciIterative fibonacci = new FinbonacciIterative();
        System.out.println(fibonacci.fibonacciRecursive("Recursive", 4));
        System.out.println(fibonacci.fibonacciIterative(4));
    }
}
