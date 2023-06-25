/*EJERCICIO 7.19 */
import java.util.Scanner;

public class Aerolinea {
    private static final int CAPACIDAD_AVION = 10;
    private static final int PRIMERA_CLASE_ASIENTOS = 5;
    private static final int ECONOMICA_ASIENTOS = 10;

    private static boolean[] asientosDisponibles = new boolean[CAPACIDAD_AVION];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-----------  HOLA MUY BUEN DIA, TARDE, NOCHE.  ------------");
        System.out.println("Bienvenido a la recepcion de boletos");
        while (true) {

            
            int opcion = mostrarMenu(scanner);
            if (opcion == 1) {
                asignarAsiento(PRIMERA_CLASE_ASIENTOS);
            } else if (opcion == 2) {
                asignarAsiento(ECONOMICA_ASIENTOS);
            } else {
                System.out.println("Opcion invalida. Por favor, seleccione 1 o 2.");
            }
        }
    }

    private static int mostrarMenu(Scanner scanner) {
        System.out.println("\n 1 para Primera Clase");
        System.out.println(" 2 para Economico");
        return scanner.nextInt();
    }

    private static void asignarAsiento(int seccionAsientos) {
        if (seccionAsientos <= CAPACIDAD_AVION) {
            int asiento = buscarAsientoDisponible(seccionAsientos);
            if (asiento != -1) {
                asientosDisponibles[asiento] = true;
                imprimirPaseAbordar(asiento);
            } else {
                System.out.println(" Seccion llena. ¿Aceptar asiento en la otra seccion? (Si/No)");
                Scanner scanner = new Scanner(System.in);
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("Si")) {
                    if (seccionAsientos == PRIMERA_CLASE_ASIENTOS) {
                        asignarAsiento(ECONOMICA_ASIENTOS);
                    } else {
                        asignarAsiento(PRIMERA_CLASE_ASIENTOS);
                    }
                } else {
                    System.out.println("Tendremos que esperar el proximo vuelo en 3 horas.");
                }
            }
        }
    }

    private static int buscarAsientoDisponible(int seccionAsientos) {
        for (int i = 0; i < seccionAsientos; i++) {
            if (!asientosDisponibles[i]) {
                return i;
            }
        }
        return -1; // No se encontró asiento disponible en la sección
    }

    private static void imprimirPaseAbordar(int asiento) {
        System.out.println(" ---------- Entrada de Abordamiento  --------- ");
        System.out.println("Asiento: " + (asiento + 1));
        if (asiento < PRIMERA_CLASE_ASIENTOS) {
            System.out.println("Seccion: Primera Clase");
        } else {
            System.out.println("Seccion: Económica");
        }
         System.out.println(" ----------                --------- ");
        System.out.println("\n");
        System.out.println();
    }
}
