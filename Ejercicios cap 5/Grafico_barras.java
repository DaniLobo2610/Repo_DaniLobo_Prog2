import java.util.Scanner;

public class Grafico_barras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHOLA MUY BUEN DÍA, TARDE O NOCHE");

        int[] lista_num = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("\nDigite un numero entre 1 y 30 (tambien puede salir apretando x): ");
            String entrada = scanner.next();

            if (entrada.equalsIgnoreCase("x")) {
                System.out.println("Programa finalizado.");
                break;
            }

            lista_num[i] = Integer.parseInt(entrada);

            if (lista_num[i] < 1 || lista_num[i] > 30) {
                System.out.println("Número inválido. Inténtelo de nuevo.");
                i--;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(lista_num[i] + ": ");
            for (int a = 0; a < lista_num[i]; a++) {
                System.out.print("*");
            }
            System.out.println();
            scanner.close();
        }
    }
}

