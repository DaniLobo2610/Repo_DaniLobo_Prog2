import java.text.DecimalFormat;
import java.util.Scanner;

public class LMS {
    public static void main(String[] args) {
        final int Leer = 10;
        final int Escribir = 11;
        final int ENTER = 12;
        final int ENTERSTRING = 13;
        final int SHOWSTRING = 14;
        final int Cargar = 20;
        final int Almacenar = 21;
        final int Suma = 30;
        final int Resta = 31;
        final int Divide = 32;
        final int Multiplicar = 33;
        final int exponente = 34;
        final int REST = 35;
        final int Bifurca = 40;
        final int BRANCHNEG = 41;
        final int BRANCHZERO = 42;
        final int Alto = 43;
        final int CONTINUE = 44;

        int instruccion = 0;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");

        int acumulador = 0;
        int[] memoria = new int[100]; // Cambiado el tipo de datos a int[]
        String[] cadenaTexto = new String[100]; // Nuevo array para almacenar cadenas de texto
        int posicion = 0, indice = 0;
        int operacion;
        boolean halt = false;
        System.out.println("\n------------------------------------------------------");
        System.out.println("HOLA MUY BUEN DIA, TARDE O NOCHE");
        System.out.println("------------------------------------------------------");
        System.out.println("\n- Lenguaje Maquina Simpletron");
        System.out.println("- Ingrese su instruccion de lo que haremos, Presione (-90) para terminar o parar la instruccion " + "\n");

        // Ingresa los valores en la memoria
        int posicionMemoria = 0;

        while (instruccion != -90) {
            
            System.out.printf( df.format( posicionMemoria) + " ? ");
            instruccion = input.nextInt();

            operacion = instruccion / 100;
            int registroInstruccion = instruccion % 100;

            if (registroInstruccion >= 0 && registroInstruccion < 100 && (operacion == Leer || operacion == Escribir
                    || operacion == Cargar || operacion == Almacenar || operacion == Suma || operacion == Resta
                    || operacion == Divide || operacion == Multiplicar || operacion == Bifurca || operacion == BRANCHNEG
                    || operacion == BRANCHZERO || operacion == Alto || operacion == CONTINUE || operacion == exponente
                    || operacion == REST || operacion == ENTER || operacion == ENTERSTRING
                    || operacion == SHOWSTRING)) {

                memoria[posicion] = instruccion;
                posicion++;
                posicionMemoria++;

            } else {
                System.out.println("Indice su operacion invalida");
            }
        }

        System.out.println("\n//Carga del programa completa//");
        System.out.println("Iniciando la ejecucion del programa...");

        // Recorre la memoria ejecutando los comandos
        for (int i = 0; i < 100 && !halt; i++) {
            instruccion = memoria[i];
            operacion = instruccion / 100;
            indice = instruccion % 100;

            if (operacion == Leer) {
                System.out.print("\nIngrese un numero entero: ");
                memoria[indice] = input.nextInt();
            } else if (operacion == Escribir) {
                System.out.println("Salida: " + memoria[indice]);
            } else if (operacion == Cargar) {
                acumulador = memoria[indice];
            } else if (operacion == Almacenar) {
                memoria[indice] = acumulador;
            } else if (operacion == Suma) {
                acumulador += memoria[indice];
            } else if (operacion == Resta) {
                acumulador -= memoria[indice];
            } else if (operacion == Divide) {
                int valor = memoria[indice];
                if (valor != 0) {
                    acumulador /= valor;
                } else {
                    System.out.println("Error: division por cero");
                    halt = true;
                }
            } else if (operacion == Multiplicar) {
                acumulador *= memoria[indice];
            } else if (operacion == Bifurca) {
                i = indice;
            } else if (operacion == BRANCHNEG) {
                if (acumulador < 0) {
                    i = indice;
                }
            } else if (operacion == BRANCHZERO) {
                if (acumulador == 0) {
                    i = indice;
                }
            } else if (operacion == Alto) {
                System.out.println("Ejecucion finalizada.");
                halt = true;
            } else if (operacion == CONTINUE) {
                // No hace nada, continua con la siguiente instruccion
            } else if (operacion == exponente) {
                acumulador = (int) Math.pow(acumulador, memoria[indice]);
            } else if (operacion == REST) {
                int valor = memoria[indice];
                if (valor != 0) {
                    acumulador %= valor;
                } else {
                    System.out.println("Error: division por cero");
                    halt = true;
                }
            } else if (operacion == ENTER) {
                System.out.print("Ingrese un numero entero: ");
                memoria[indice] = input.nextInt();
            } else if (operacion == ENTERSTRING) {
                System.out.print("Ingrese una cadena de texto: ");
                input.nextLine(); // Consumir el salto de línea pendiente
                cadenaTexto[indice] = input.nextLine(); // Almacenar la cadena en el array de cadenas de texto
            } else if (operacion == SHOWSTRING) {
                System.out.println("Salida de cadena: " + cadenaTexto[indice]); // Mostrar la cadena almacenada
            }
        }
        input.close();
    }
}

