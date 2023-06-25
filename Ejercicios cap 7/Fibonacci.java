/*Ejercicio 7.29 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        long fibonacciNumber = fibonacci(n);
        System.out.println("El número de Fibonacci en la posición " + n + " es: " + fibonacciNumber);

        long largestFibonacci = findLargestFibonacci();
        System.out.println("El número de Fibonacci mas grande que se puede imprimir es: " + largestFibonacci);

        double largestFibonacciDouble = findLargestFibonacciDouble();
        System.out.println("El número de Fibonacci mas grande que se puede imprimir como double es: " + largestFibonacciDouble);
    }

    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long prev1 = 0;
        long prev2 = 1;
        long fibonacci = 0;

        for (int i = 2; i <= n; i++) {
            fibonacci = prev1 + prev2;
            prev1 = prev2;
            prev2 = fibonacci;
        }

        return fibonacci;
    }

    public static long findLargestFibonacci() {
        long largestFibonacci = 0;
        int n = 0;

        while (true) {
            long fibonacci = fibonacci(n);
            if (fibonacci < 0) {
                break;
            }
            largestFibonacci = fibonacci;
            n++;
        }

        return largestFibonacci;
    }

    public static double findLargestFibonacciDouble() {
        double largestFibonacci = 0;
        int n = 0;

        while (true) {
            double fibonacci = fibonacciDouble(n);
            if (fibonacci == Double.POSITIVE_INFINITY) {
                break;
            }
            largestFibonacci = fibonacci;
            n++;
        }

        return largestFibonacci;
    }

    public static double fibonacciDouble(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        double prev1 = 0;
        double prev2 = 1;
        double fibonacci = 0;

        for (int i = 2; i <= n; i++) {
            fibonacci = prev1 + prev2;
            prev1 = prev2;
            prev2 = fibonacci;
        }

        return fibonacci;
    }
}
