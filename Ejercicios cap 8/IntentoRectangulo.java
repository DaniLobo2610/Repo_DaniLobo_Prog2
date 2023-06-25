import java.util.Scanner;

public class IntentoRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Rectangulo rectangulo1 = new Rectangulo();  // Objetos iniciados en 1 por defecto
        System.out.println("\n");
        System.out.println("\tHOLA MUY BUEN DIA, TARDE O NOCHE");
        System.out.println("\n");
        System.out.println("------ Rectangulo iniciado con datos en 1 por defecto ------");
        System.out.println("Longitud: " + rectangulo1.getLongitud());
        System.out.println("Anchura: " + rectangulo1.getAnchura());
        System.out.println("Perimetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Area: " + rectangulo1.calcularArea());
        System.out.println("------------------------------------------------------------");
        System.out.println("\n");

        System.out.print("Ingrese la longitud del rectangulo: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingrese la anchura del rectangulo: ");
        double anchura = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setLongitud(longitud);
        rectangulo.setAnchura(anchura);
        

        System.out.println("\n" );
        System.out.println(" ------ Rectangulo con Datos Ingresados ------ " );
        System.out.println("Longitud: " + rectangulo.getLongitud());
        System.out.println("Anchura: " + rectangulo.getAnchura());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("--------------------------------------- " );
        System.out.println("\n" );
        

        scanner.close();
    }
}
