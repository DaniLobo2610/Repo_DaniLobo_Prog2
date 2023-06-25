/*Ejercicio 4.20  */

import java.util.Scanner;

public class Calculo_Sueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nHOLA MUY BUEN DIA, TARDE O NOCHE");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nEmpleado " + i);
            System.out.print("Ingrese el número de horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            
            System.out.print("Ingrese la tarifa por hora: ");
            double tarifaHora = scanner.nextDouble();
            
            double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaHora);
            
            System.out.println("El sueldo bruto del empleado " + i + " es: " + sueldoBruto);
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaHora) {
        double sueldoBruto;
        int horasNormales = Math.min(horasTrabajadas, 40);
        int horasExtras = Math.max(horasTrabajadas - 40, 0);
        
        double sueldoNormal = horasNormales * tarifaHora;
        double sueldoExtra = horasExtras * (tarifaHora * 1.5);
        
        sueldoBruto = sueldoNormal + sueldoExtra;
        
        return sueldoBruto;
    }
}
