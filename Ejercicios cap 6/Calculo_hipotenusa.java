import java.util.Scanner;

public class Calculo_hipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ------ HOLA MUY BUEN DÍA, TARDE O NOCHE :) ------ ");

        System.out.print(" - Longitud del lado #1: ");
        double lad1 = scanner.nextDouble();

        System.out.print(" - Longitud del lado #2: ");
        double lad2 = scanner.nextDouble();

        double hipotenusa = hipotenusa(lad1, lad2);

        System.out.println("\n --- El resultado de la hipotenusa es: " + hipotenusa );
        System.out.println("\n ");
        scanner.close();
    }

    public static double hipotenusa(double lad1, double lad2) {
        
        double hipotenusa = Math.sqrt(Math.pow(lad1, 2) + Math.pow(lad2, 2));
        return hipotenusa;
    }
    
}

