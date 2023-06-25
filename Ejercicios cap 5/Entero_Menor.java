
import java.util.Scanner;

public class Entero_Menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE ");

        System.out.print("\nPor favor ingrese la cantidad de digitos:  ");
        int NUMVALO = scanner.nextInt();
        
        System.out.print("\nIngrese los digitos:  ");
        int menor = Integer.MAX_VALUE;
        
        for (int i = 0; i < NUMVALO; i++) {
            int valor = scanner.nextInt();
            
            if (valor < menor) {
                menor = valor;
            }
        }
        
        System.out.println("El numero menor es: " + menor);
        scanner.close();
    }
}
