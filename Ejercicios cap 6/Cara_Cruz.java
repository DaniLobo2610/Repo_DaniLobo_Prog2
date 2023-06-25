import java.util.Scanner;

public class Cara_Cruz {
    private enum Moneda {
        CARA,
        CRUZ
    }

    private static int contador1 = 0;//Contador de cara
    private static int contador2 = 0;//Contador de cruz

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n ------ HOLA MUY BUEN DÍA, TARDE O NOCHE :) ------ ");

        while (true) {
            System.out.println("\nSeleccione una opción ((1) Lanzar,(2) para mostrar resultados y salir del programa):");
            
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Moneda resultado = tirar();
                    contarLado(resultado);
                    break;
                case 2:
                    mostrarResultados();
                    return;
                default:
                    System.out.println("Esta opcion no existe. Inténtelo nuevamente.");
                    break;
            }
            
        }
        
    }
     
    private static Moneda tirar() {
        int numeroAlea = (int) (Math.random() * 2);

        if (numeroAlea == 0) {
            return Moneda.CARA;
        } else {
            return Moneda.CRUZ;
        }
    }

    private static void contarLado(Moneda lado) {
        if (lado == Moneda.CARA) {
            contador1++;
        } else {
            contador2++;
        }
    }

    private static void mostrarResultados() {
        System.out.println("\n----- Resultados : -----");
        System.out.println("Cara: " + contador1);
        System.out.println("Cruz: " + contador2);
    }
}

