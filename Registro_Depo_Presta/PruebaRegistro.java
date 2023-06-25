import java.util.ArrayList;
import java.util.Scanner;

class Registro {
    private String numeroCuenta;
    private String empleado;
    private String apellido;
    private int monto;

    public Registro(String numeroCuenta, String empleado, String apellido, int monto) {
        this.numeroCuenta = numeroCuenta;
        this.empleado = empleado;
        this.apellido = apellido;
        this.monto = monto;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getEmpleado() {
        return empleado;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void depositar(int cantidad) {
        monto += cantidad;
    }

    public void sacarPrestamo(int cantidad) {
        if (cantidad <= monto) {
            monto -= cantidad;
        } else {
            System.out.println("No se puede realizar el préstamo. El monto solicitado es mayor al saldo disponible.");
        }
    }
}

public class PruebaRegistro {
    public static void main(String[] args) {
        ArrayList<Registro> cuentas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

         System.out.println("\n------ HOLA MUY BUEN DÍA, TARDE O NOCHE. ;)   ------ ");

        while (true) {
            System.out.println("\n-------- Creación de cuenta del empleado  -------- ");
            System.out.print("\nIngrese el número de cuenta de cuatro dígitos ( (-) para saltarse): ");
            String numeroCuenta = scanner.nextLine();

            if (numeroCuenta.equals("-")) {
               
                break;
            }

            System.out.print("\nIngrese el nombre del empleado: ");
            String empleado = scanner.nextLine();

            System.out.print("Ingrese el apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese el monto: ");
            int monto = Integer.parseInt(scanner.nextLine());

            Registro cuentaExistente = buscarRegistro(cuentas, numeroCuenta);

            if (cuentaExistente != null) {
                System.out.println("\nEl número de cuenta ya existe. No se puede agregar nuevamente.");
                continue;
            }

            Registro cuenta = new Registro(numeroCuenta, empleado, apellido, monto);
            cuentas.add(cuenta);
        }

        System.out.println("\n ----- Información de las cuentas:  ------");
        for (Registro cuenta : cuentas) {
            System.out.println("- Número de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("- Empleado: " + cuenta.getEmpleado());
            System.out.println("- Apellido: " + cuenta.getApellido());
            System.out.println("- Monto: " + cuenta.getMonto());
            System.out.println();
        }

        while (true) {
            System.out.print("\nIngrese el número de cuenta para hacer un depósito o sacar un préstamo (- para salir): ");
            String numeroCuenta = scanner.nextLine();

            if (numeroCuenta.equals("-")) {
                 System.out.println("\n ----- Hasta La proxima ;)  ------");
                System.out.println("\n");
                break;
            }

            Registro cuentaSeleccionada = buscarRegistro(cuentas, numeroCuenta);

            if (cuentaSeleccionada == null) {
                System.out.println("El número de cuenta no existe.");
                continue;
            }

            System.out.print("\nIngrese la cantidad a depositar o sacar como préstamo, (para hacer un prestamo escriba un (-) antes de la cantidad) ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            if (cantidad > 0) {
                cuentaSeleccionada.depositar(cantidad);
                System.out.println("Depósito realizado. Monto actualizado: " + cuentaSeleccionada.getMonto());

                 System.out.println("\n ----- Información de las cuentas:  ------");
                for (Registro cuenta : cuentas) {
             System.out.println("- Número de cuenta: " + cuenta.getNumeroCuenta());
             System.out.println("- Empleado: " + cuenta.getEmpleado());
             System.out.println("- Apellido: " + cuenta.getApellido());
             System.out.println("- Monto: " + cuenta.getMonto());
             System.out.println();
          }




            } else if (cantidad < 0) {
                cuentaSeleccionada.sacarPrestamo(-cantidad);
                System.out.println(" Monto actualizado: " + cuentaSeleccionada.getMonto());

              System.out.println("\n ----- Información de las cuentas:  ------");
                for (Registro cuenta : cuentas) {
             System.out.println("- Número de cuenta: " + cuenta.getNumeroCuenta());
             System.out.println("- Empleado: " + cuenta.getEmpleado());
             System.out.println("- Apellido: " + cuenta.getApellido());
             System.out.println("- Monto: " + cuenta.getMonto());
             System.out.println();
          }


            } else {
                System.out.println("La cantidad ingresada debe ser distinta de cero.");
            }
            
        }
    }

    private static Registro buscarRegistro(ArrayList<Registro> cuentas, String numeroCuenta) {
        for (Registro cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
        
    }
    
}
