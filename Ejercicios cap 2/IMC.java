/*Ejercicio 2.33 */

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en libras: ");
        double pesoLibra = scanner.nextDouble();

        System.out.print("Ingrese su altura en pulgadas: ");
        double alturaPulg = scanner.nextDouble();

        double imc = calcularIMC(pesoLibra, alturaPulg);

        System.out.println("Su índice de masa corporal (IMC) es: " + imc);

        scanner.close();
    }

    public static double calcularIMC(double pesoLibras, double alturaPulgadas) {
        double pesoKg = pesoLibras * 0.45359237; // Convertir libras a kilogramos
        double alturaMetros = alturaPulgadas * 0.0254; // Convertir pulgadas a metros

        double imc = pesoKg / (alturaMetros * alturaMetros);

        return imc;
    }
}

