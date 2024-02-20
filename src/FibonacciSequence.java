import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        System.out.println("Arguments: "+ Arrays.toString(args));
        if (args.length == 0){
            System.out.println("There are no arguments.");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long[] fibonacci = generateFibonacci(num);

        System.out.println("Fibonacci sequence: ");
        for (long term : fibonacci) {
            System.out.print(term + " ");
        }
    }

    public static long[] generateFibonacci(int num) {
        int n = num+1;
        long[] fibonacci = new long[n];

        if (num >= 1) {
            fibonacci[0] = 0;
        }
        if (num >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
