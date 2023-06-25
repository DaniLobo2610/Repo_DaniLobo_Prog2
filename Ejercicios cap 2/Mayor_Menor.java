/*Ejercicio 2.16 */

import java.util.Scanner;

public class Mayor_Menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor Ingrese primer digito: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo digito: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " es más grande");
        } else if (num2 > num1) {
            System.out.println(num2 + " es más grande");
        } else {
            System.out.println("Estos números son iguales");
        }
        
        scanner.close();
    }
}
