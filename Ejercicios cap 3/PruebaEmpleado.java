/*Ejercicio 3.13 */

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear dos objetos Empleado
        Empleado emple1 = new Empleado("Daniel", "Lobo", 5000.0);
        Empleado emple2 = new Empleado("Allison", "Chavarría", 9000.0);
             
        System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE ");
       
        System.out.println("\n-------Empleado 1:  -----------");

        System.out.println("- Nombre: " + emple1.obtenerPrimerNombre() + " " + emple1.obtenerApellidoPaterno());
        System.out.println("- Salario anual: " + emple1.obtenerSalarioAnual());

        System.out.println("\n-------Empleado 2:  -----------");

        System.out.println("- Nombre: " + emple2.obtenerPrimerNombre() + " " + emple2.obtenerApellidoPaterno());
        System.out.println("- Salario anual: " + emple2.obtenerSalarioAnual());

        
        emple1.establecerSalarioMensual(emple1.obtenerSalarioMensual() * 1.1);// Aumentar el salario de cada empleado en un 10%
        emple2.establecerSalarioMensual(emple2.obtenerSalarioMensual() * 1.1);// Aumentar el salario de cada empleado en un 10%

        
        System.out.println("\n--------------Después del aumento del 10%:   -----------------");
        System.out.println("\n-------Empleado 1:  -----------");
        System.out.println("Nombre: " + emple1.obtenerPrimerNombre() + " " + emple1.obtenerApellidoPaterno());
        System.out.println("Salario anual: " + emple1.obtenerSalarioAnual());

        System.out.println("\n-------Empleado 2:  -----------");
        System.out.println("Nombre: " + emple2.obtenerPrimerNombre() + " " + emple2.obtenerApellidoPaterno());
        System.out.println("Salario anual: " + emple2.obtenerSalarioAnual());
    }
}

