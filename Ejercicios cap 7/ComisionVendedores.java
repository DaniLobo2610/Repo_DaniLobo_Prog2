/*EJERCICIO 7.10 */
import java.util.Scanner;

public class ComisionVendedores {
    public static void main(String[] args) {
        int[] rangos = new int[10];

        Scanner scanner = new Scanner(System.in);
         System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE");
         System.out.println("\n-----------------------------------------------------------------");
        System.out.print("Digite el numero de vendedores: ");
        int numVendedores = scanner.nextInt();

        for (int i = 0; i < numVendedores; i++) {
            System.out.print("Ingrese las ventas totales del vendedor: ");
            double ventasTotales = scanner.nextDouble();
            double salario = 200 + 0.09 * ventasTotales;

            int rango;
            if (salario < 200) {
                rango = 0;
            } else if (salario < 1000) {
                rango = (int) ((salario - 200) / 100) + 1;
            } else {
                rango = 9;
            }

            rangos[rango]++;
        }
        System.out.println("\n-------------------------------------");
        System.out.println("Rango salarial\tCantidad de vendedores");
        System.out.println("-------------------------------------");
        for (int i = 0; i < rangos.length; i++) {
            String rangoSalario;
            if (i == 0) {
                rangoSalario = "$200-299";
            } else if (i == 9) {
                rangoSalario = "$1,000 en adelante";
            } else {
                rangoSalario = "$" + (200 + (i - 1) * 100) + "-" + (299 + (i - 1) * 100);
            }

            System.out.println(rangoSalario + "\t\t" + rangos[i]);
        }
        System.out.println("-----------------------------------------------------------------");
        scanner.close();
    }
}
