public class impar_produc {
    public static void main(String[] args) {
        int producto = 1;

        System.out.println("\nHOLA MUY BUEN DÍA, TARDE O NOCHE. :) ");

        for (int ab = 1; ab <= 15; ab += 2) {
            producto *= ab ;
        }

        System.out.println("\nEl producto de los enteros impares del 1 al 15 es: " + producto);
    }
}