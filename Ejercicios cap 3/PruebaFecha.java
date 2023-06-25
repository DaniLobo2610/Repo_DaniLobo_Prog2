/*Ejercicio 3.14 */

public class PruebaFecha {
    public static void main(String[] args) {
        // Crear una instancia de Fecha

        System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE ");

        System.out.println("\n--------Fecha----------- ");
        Fecha fecha = new Fecha(5, 6, 2023);

        // Mostrar la fecha
        fecha.mostrarFecha();

        System.out.println("\n--------Fecha Modificada----------- ");
        fecha.setMes(12);
        fecha.setDia(25);
        fecha.setAnio(2023);

        // Mostrar la fecha actualizada
        fecha.mostrarFecha();
    }
}

