public class Eratostenes {
    public static void main(String[] args) {
        boolean[] numPrimo = new boolean[1000];

        
        for (int i = 2; i < numPrimo.length; i++) {
            numPrimo[i] = true;
        }

        
        for (int i = 2; i < Math.sqrt(numPrimo.length); i++) {
            if (numPrimo[i]) {
                for (int j = i * i; j < numPrimo.length; j += i) {
                    numPrimo[j] = false;
                }
            }
        }
         System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE");
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Numeros primos entre 2 y 999:");
        for (int i = 2; i < numPrimo.length; i++) {
            if (numPrimo[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("\n");
        System.out.println();
    }
}
