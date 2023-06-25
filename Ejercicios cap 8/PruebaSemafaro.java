public class PruebaSemafaro {
    public static void main(String[] args) {
        System.out.println("\n");
        for (LuzSemafaro luz : LuzSemafaro.values()) {
            
            System.out.println(luz + ": Duracion = " + luz.getDuracion() + " segundos");
             
        }
        System.out.println("\n");
    }
}

