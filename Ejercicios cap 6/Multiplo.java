import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ------ HOLA MUY BUEN DÍA, TARDE O NOCHE :) ------ ");

        System.out.println("\nDigite los dos enteros ( por favor separados por espacio) tambien escriba 'salir' para finalizar:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("\n");
                break;
            }

            String[] numeros = input.split(" ");
            if (numeros.length != 2) {
                System.out.println("\nDebe ingresar dos números separados por espacio. Inténtelo nuevamente.");
                continue;
            }

            int num1, num2;
            try {
                num1 = Integer.parseInt(numeros[0]);
                num2 = Integer.parseInt(numeros[1]);
            } catch (NumberFormatException e) {
                System.out.println("Por favor numeros enteros. Inténtelo nuevamente.");
                continue;
            }

            boolean esMultiplo = esMultiplo(num1, num2);
            System.out.println("¿Es el segundo número múltiplo del primero? " + esMultiplo);
            System.out.println("----------------------------------------------------------------------------");
        }
        scanner.close();
    }

    public static boolean esMultiplo(int num1, int num2) {
        if (num2 % num1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

