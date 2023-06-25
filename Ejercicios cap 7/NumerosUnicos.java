/*EJERCICIO 7.12 */

import java.util.Scanner;

public class NumerosUnicos {
    public static void main(String[] args) {
        int[] numerosUni = new int[5];
        int indice = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE");
        System.out.println("-------------------------------------------------------");
        System.out.println("Ingrese cinco numeros entre 10 y 100 (inclusive):");

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();

            if (num >= 10 && num <= 100) {
                boolean esDuplicado = false;

                for (int j = 0; j < indice; j++) {
                    if (numerosUni[j] == num) {
                        esDuplicado = true;
                        break;
                    }
                }

                if (!esDuplicado) {
                    numerosUni[indice] = num;
                    indice++;
                }
            } else {
                System.out.println("El número debe estar entre 10 y 100. Inténtelo de nuevo.");
                i--; // Restar uno al índice para repetir la iteración
            }

            System.out.println("Valores unicos introducidos:");
            for (int j = 0; j < indice; j++) {
                System.out.print(numerosUni[j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\n");
        scanner.close();
    }
}
