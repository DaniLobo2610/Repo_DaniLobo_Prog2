
    public class Cuenta {
        private double saldo;
    
        public Cuenta(double saldoInicial) {
            establecerSaldo(saldoInicial);
        }
    
        public void establecerSaldo(double saldo) {
            if (saldo >= 0) {
                this.saldo = saldo;
            } else {
                this.saldo = 0.0;
            }
        }
    
        public double obtenerSaldo() {
            return saldo;
        }
    
        public void retirar(double monto) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
            } else {
                System.out.println("El monto a retirar excede el saldo de la cuenta.");
            }
        }
    }

