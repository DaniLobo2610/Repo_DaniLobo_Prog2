import java.util.Scanner;

public class Calcular_Distancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("\n ------ HOLA MUY BUEN DÍA, TARDE O NOCHE :) ------ ");

        System.out.println("\nCoordenadas del punto 1 (x1 y y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("\nCoordenadas del punto 2 (x2 y y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.println("\n ----- La distancia entre los dos puntos es: " + distancia);
        System.out.println("\n " );
        scanner.close();
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}

