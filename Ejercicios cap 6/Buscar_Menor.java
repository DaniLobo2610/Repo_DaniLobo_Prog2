import java.util.Scanner;

public class Buscar_Menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ------ HOLA MUY BUEN DÍA, TARDE O NOCHE :) ------ ");

        System.out.println("\nDigite tres numeros(separados por espacio):");
        String input = scanner.nextLine();
        String[] numeros = input.split(" ");

        if (numeros.length != 3) {
            System.out.println("Por favor son tres valores. Inténtelo nuevamente.");
            return;
        }

        double num1, num2, num3;
        try {
            num1 = Double.parseDouble(numeros[0]);
            num2 = Double.parseDouble(numeros[1]);
            num3 = Double.parseDouble(numeros[2]);
        } catch (NumberFormatException e) {
            System.out.println("Digite valores de punto flotante válidos. Inténtelo nuevamente.");
            return;
        }

        double resultado = minimo3(num1, num2, num3);
        System.out.println("\nEl valor mínimo es: " + resultado);
        System.out.println("\n");
        //scanner.close();
    }

    public static double minimo3(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}

