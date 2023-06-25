/*Ejercicio 2.30 */

import java.util.Scanner;

public class Separador_digito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número de cinco dígitos: ");
        int num = scanner.nextInt();
        
        // Obtener el dígito en la posición de las decenas de millar
        int digito1 = num / 10000;
        // Obtener el dígito en la posición de las unidades de millar
        int digito2 = (num / 1000) % 10;
        // Obtener el dígito en la posición de las centenas
        int digito3 = (num / 100) % 10;
        // Obtener el dígito en la posición de las decenas
        int digito4 = (num / 10) % 10;
        // Obtener el dígito en la posición de las unidades
        int digito5 = num % 10;
        
        System.out.println(digito1 + "   " + digito2 + "   " + digito3 + "   " + digito4 + "   " + digito5);
        
        scanner.close();
    }
}
