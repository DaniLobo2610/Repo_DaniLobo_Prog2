
public class Rombo{
    public static void main(String[] args) {
        int tamaño = 5;

          System.out.println("\nHOLA MUY BUEN DÍA, TARDE O NOCHE. :) ");

        for (int ab = 1; ab <= tamaño; ab++) {
            for (int c = tamaño - ab; c > 0; c--) {
                System.out.print(" ");
            }
            for (int H = 1; H <= ab; H++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int ab = tamaño - 1; ab >= 1; ab--) {
            for (int D = tamaño - ab; D > 0; D--) {
                System.out.print(" ");
            }
            for (int H = 1; H <= ab; H++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

