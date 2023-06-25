public class PruebaCuentaAhorros {
    public static void main(String[] args) {
        CuentadeAhorros.modificarTasaInteres(0.08); 

        CuentadeAhorros ahorrador1 = new CuentadeAhorros(2000.00);
        CuentadeAhorros ahorrador2 = new CuentadeAhorros(3000.00);
         
        System.out.println("\n");
            System.out.println("\t\tHOLA MUY BUEN DIA, TARDE O NOCHE");

            System.out.println("-------------------------------------------------------------");


        for (int i = 1; i <= 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();
            
            System.out.printf("Mes %d - Ahorrador 1: %.2f, \t\t Ahorrador 2: %.2f%n", i, ahorrador1.getSaldoAhorros(), ahorrador2.getSaldoAhorros());
        }

        CuentadeAhorros.modificarTasaInteres(0.05); 

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        System.out.printf("Mes 13 - Ahorrador 1: %.2f, \t\t Ahorrador 2: %.2f%n", ahorrador1.getSaldoAhorros(), ahorrador2.getSaldoAhorros());
        System.out.println("-------------------------------------------------------------");
        System.out.println("\n");
    }
}

