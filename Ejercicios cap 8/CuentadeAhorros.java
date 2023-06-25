public class CuentadeAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    // Constructor
    public CuentadeAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    // Método para calcular el interés mensual y actualizar el saldo
    public void calcularInteresMensual() {
        double interesMensual = saldoAhorros * (tasaInteresAnual / 12);
        saldoAhorros += interesMensual;
    }

    // Método estático para modificar la tasa de interés anual
    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    // Método para obtener el saldo actual
    public double getSaldoAhorros() {
        return saldoAhorros;
    }
}
