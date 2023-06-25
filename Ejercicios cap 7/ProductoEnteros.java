/*EJERCICIO 7.14 */

public class ProductoEnteros {
    public static void main(String[] args) {
        
        System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE.");
        System.out.println("\n-----------------------------------------------");
        System.out.println("Producto de 2, 4, 6, 8: " + producto(2, 4, 6, 8));
        System.out.println("Producto de 3, 5, 7: " + producto(3, 5, 7));
        System.out.println("Producto de 1, 2, 3, 4, 5, 6, 7, 8, 9, 10: " + producto(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("-----------------------------------------------");
        System.out.println("\n");
    }

    public static int producto(int... numeros) {
        int resultado = 1;
        for (int numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }
    
}
