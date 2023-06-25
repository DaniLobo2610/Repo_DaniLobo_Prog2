import java.util.Scanner;

public class Arreglo_Ventas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valor = {2.98, 4.50, 9.98, 4.49, 6.87};
        int[] cantidades = new int[5];
        double totalVentas = 0.0;

        System.out.println("\n HOLA MUY BUEN DÍA, TARDE O NOCHE :).");

    
        for (int x = 0; x < 5; x++) {
            System.out.print("\nDigite el numero correspondiente al producto (1-5): ");
            int numproduc = scanner.nextInt();

            System.out.print("Digite la cantidad vendida de ese producto : ");
            int cantidadVendida = scanner.nextInt();

            
            if (numproduc < 1 || numproduc > 5) {
                System.out.println("Número de producto inválido. Inténtelo de nuevo.");
                x--;
                continue;
            }

            // Actualizar la cantidad vendida para el producto correspondiente
            cantidades[numproduc - 1] += cantidadVendida;

            // Calcular el total de ventas para el producto vendido
            double ventaProducto = valor[numproduc - 1] * cantidadVendida;
            totalVentas += ventaProducto;
        }

        System.out.println("\nVentas totales: $" + totalVentas);
        scanner.close();
    }
}
