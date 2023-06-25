import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
         
        System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE ");

        while (true) {
            System.out.print("\nIntroduce un número de cinco dígitos: ");
            numero = scanner.nextInt();

            if (numero >= 10000 && numero <= 99999) {
                break;
            } else {
                System.out.println("Error: el número debe tener cinco dígitos.");
            }
        }

        int digito1 = numero / 10000;
        int digito2 = (numero % 10000) / 1000;
        int digito4 = (numero % 100) / 10;
        int digito5 = numero % 10;

        if (digito1 == digito5 && digito2 == digito4) {
            System.out.println(numero + " es un palíndromo.");
        } else {
            System.out.println(numero + " no es un palíndromo.");
            scanner.close();
        }
    }
}

