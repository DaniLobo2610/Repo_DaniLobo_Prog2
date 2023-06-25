/*EJERCICIO 7.17 */
import java.util.Random;

public class SimulacionTiroDados {
    public static void main(String[] args) {
        int totalLanzar = 36000000;
        int[] frecuenSumas = new int[11]; // indices 0 a 10 representan las sumas de 2 a 12

        Random random = new Random();

        for (int i = 0; i < totalLanzar; i++) {
            int dado1 = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
            int dado2 = random.nextInt(6) + 1;

            int suma = dado1 + dado2;
            frecuenSumas[suma - 2]++; // Restamos 2 para que el índice coincida con la suma (2-12)
        }
         System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE");
          System.out.println("\n------ TABLA ------");
        System.out.println("Suma\tFrecuencia");
        System.out.println("-----------------");

        for (int i = 0; i < frecuenSumas.length; i++) {
            int suma = i + 2; // Suma real correspondiente al índice (2-12)
            int frecuencia = frecuenSumas[i];
            System.out.println(suma + "\t" + frecuencia);
            
        }
        System.out.println("-----------------");
            System.out.println("\n");
    }
}

