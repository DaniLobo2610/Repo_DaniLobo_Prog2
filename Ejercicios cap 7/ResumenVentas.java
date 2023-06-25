/*EJERCICIO 7.20 */
public class ResumenVentas {
    private static final int NumVendedores = 4;
    private static final int NumProduct = 5;

    public static void main(String[] args) {
        int[][] ventas = new int[NumProduct][NumVendedores];

        // Simulación de datos de ventas del último mes
        int[][] notasVentas = {
                {1, 1, 400},
                {1, 2, 50},
                {1, 3, 500},
                {2, 1, 400},
                {2, 2, 550},
                {2, 4, 250},
                {3, 1, 120},
                {3, 3, 80},
                {3, 4, 250},
                {3, 5, 180},
                {4, 1, 90},
                {4, 2, 70},
                {4, 3, 200},
                {4, 4, 150},
                {4, 5, 100}
        };

        // Procesar las notas de ventas
        for (int i = 0; i < notasVentas.length; i++) {
            int vendedor = notasVentas[i][0];
            int producto = notasVentas[i][1];
            int valor = notasVentas[i][2];

            ventas[producto - 1][vendedor - 1] += valor;
        }

        // Mostrar los resultados en formato tabular
        System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE");
        System.out.println("\n---------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t TABLA");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.print("Producto/Vendedor\t");
        for (int vendedor = 1; vendedor <= NumVendedores; vendedor++) {
            System.out.print("Vendedor " + vendedor + "\t");
        }
        System.out.println("Total");

        for (int producto = 1; producto <= NumProduct; producto++) {
            System.out.print("Producto " + producto + "\t\t");
            int totalProducto = 0;

            for (int vendedor = 1; vendedor <= NumVendedores; vendedor++) {
                System.out.print(ventas[producto - 1][vendedor - 1] + "\t\t");
                totalProducto += ventas[producto - 1][vendedor - 1];
            }

            System.out.println(totalProducto);
        }

        System.out.print("Total\t\t\t\t");
        for (int vendedor = 1; vendedor <= NumVendedores; vendedor++) {
            int totalVendedor = 0;

            for (int producto = 1; producto <= NumProduct; producto++) {
                totalVendedor += ventas[producto - 1][vendedor - 1];
            }

            System.out.print(totalVendedor + "\t\t");
        }
            System.out.println("\n---------------------------------------------------------------------------------------------");
            System.out.println("\n");
        System.out.println();
    }
}
