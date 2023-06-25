public class PruebaCuenta {
    public static void main(String[] args) {

        System.out.println("\nHOLA MUY BUEN DIA, TARDE O NOCHE ");
        Cuenta cuenta = new Cuenta(1000.0);
        System.out.println("\nSaldo inicial: " + cuenta.obtenerSaldo());

        cuenta.retirar(500.0); // Retiro válido
        cuenta.retirar(800.0); // Retiro inválido

        System.out.println("Saldo final: " + cuenta.obtenerSaldo());
        System.out.println("\n ");
    }
}
