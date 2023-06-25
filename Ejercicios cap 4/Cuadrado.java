/*Ejercicio 4.29 */

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE ");

        System.out.print("\nIntroduce el tamaño del lado del cuadrado (entre 1 y 20): ");
        int lado = scanner.nextInt();
        
        if (lado >= 1 && lado <= 20) {
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= lado; j++) {
                    if (i == 1 || i == lado || j == 1 || j == lado) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("El tamaño del lado debe estar entre 1 y 20.");
            scanner.close();
        }
    }
        
}

