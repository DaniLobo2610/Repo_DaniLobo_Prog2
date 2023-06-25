public class Pruebatime3 {
    public static void main(String[] args) {
        Tiempo3 tiempo = new Tiempo3(22, 59, 59);

        System.out.println("\n" );
        System.out.println("HOLA MUY BUEN DIA, TARDE O NOCHE" );
        System.out.println("--------------------------" );
        System.out.println("Tiempo inicial: " + tiempo);
        System.out.println("--------------------------" );

        tiempo.tictac();
        System.out.println("Despues de tictac: " + tiempo);

        tiempo.incrementarMinuto();
        System.out.println("Despues de incrementarMinuto: " + tiempo);

        tiempo.incrementarHora();
        System.out.println("Despues de incrementarHora: " + tiempo);
        System.out.println("\n" );
    }
}

