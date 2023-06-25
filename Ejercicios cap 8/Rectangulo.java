public class Rectangulo {
    private double longitud;
    private double anchura;

    
    public Rectangulo() {            // Constructor que inicia por defecto
        this.longitud = 1.0;
        this.anchura = 1.0;
    }

    
    public Rectangulo(double longitud, double anchura) {   //Constructor con variables iniciales
        setLongitud(longitud);
        setAnchura(anchura);
    }

    
    public void setLongitud(double longitud) {    // Establecer rango de longitud
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        } else {
            System.out.println("Disculpa, La longitud debe ser mayor que 0.0 y menor que 20.0");
        }
    }

    public double getLongitud() {
        return longitud;
    }

    
    public void setAnchura(double anchura) {    // Establecer rango de anchura
        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        } else {
            System.out.println("Disculpa, La anchura debe ser mayor que 0.0 y menor que 20.0");
        }
    }

    public double getAnchura() {
        return anchura;
    }

    
    public double calcularPerimetro() {    //Calcular perimetro
        return 2 * (longitud + anchura);
    }

    
    public double calcularArea() {
        return longitud * anchura;
    }
}