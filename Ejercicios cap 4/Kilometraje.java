/*Ejercicio 4.17 */

import java.util.Scanner;

public class Kilometraje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalKilome = 0;
        int totalLitros = 0;
        System.out.println("\n\nHOLA MUY BUEN DIA, TARDE O NOCHE");
        System.out.println("\nIngrese los kilómetros conducidos y los litros disponibles en cada viaje");
        
        int kilome = 0;
        while (kilome != -1) {
            System.out.print("Kilómetros: ");
            kilome = scanner.nextInt();
            
            if (kilome == -1) {
                break;
            }
            
            System.out.print("Litros: ");
            int litros = scanner.nextInt();
            
            double kilomePorLitro = calcularKilometrajePorLitro(kilome, litros);
            
            System.out.println("Kilometraje por litro en este viaje: " + kilomePorLitro);
            System.out.println();
            
            totalKilome += kilome;
            totalLitros += litros;
            
            /*double promedioKilomePorLitro = calcularKilometrajePorLitro(totalKilome, totalLitros);*/
            
           /*  System.out.println("Kilometraje por litro promedio hasta este punto: " + promedioKilomePorLitro);
            System.out.println();*/
        }
        
        scanner.close();
    }
    
    public static double calcularKilometrajePorLitro(int kilometros, int litros) {
        return (double) kilometros / litros;
    }
}