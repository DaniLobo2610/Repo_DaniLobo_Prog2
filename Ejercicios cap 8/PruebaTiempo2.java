public class PruebaTiempo2 {
    public static void main(String[] args) {
        Tiempo2 tiempo = new Tiempo2(23, 59, 59);
        
        System.out.println("\n" );
        System.out.println("\tHOLA MUY BUEN DIA, TARDE O NOCHE");
        System.out.println("-----------------------");
        System.out.println("Hora: " + tiempo);
        System.out.println("Horas: " + tiempo.getHoras());
        System.out.println("Minutos: " + tiempo.getMinutos());
        System.out.println("Segundos: " + tiempo.getSegundos());

        tiempo.setTiempo(12, 34, 56);
        

        System.out.println("\n" );
        System.out.println("----- Nueva Hora -----");
        System.out.println("Hora: " + tiempo);
        System.out.println("Horas: " + tiempo.getHoras());
        System.out.println("Minutos: " + tiempo.getMinutos());
        System.out.println("Segundos: " + tiempo.getSegundos());
        System.out.println("-----------------------");
        System.out.println("\n" );
    }
}

