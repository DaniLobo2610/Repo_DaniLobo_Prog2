/*Ejercicio 2.17 */
package Ejercicios1;
import java.util.Scanner;

public class aritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor ingrese tres Numeros:");
        
        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Número 3: ");
        int numero3 = scanner.nextInt();
        
        int sum = numero1 + numero2 + numero3;
        int prom = sum / 3;
        int produc = numero1 * numero2 * numero3;
        
        int menor = Math.min(Math.min(numero1, numero2), numero3);
        int mayor = Math.max(Math.max(numero1, numero2), numero3);
        
        System.out.println("Suma: " + sum);
        System.out.println("Promedio: " + prom);
        System.out.println("Producto: " + produc);
        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);
        
        scanner.close();
    }
}