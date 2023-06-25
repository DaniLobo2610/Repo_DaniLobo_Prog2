public class Tiempo2 {
    private int segun;

    public Tiempo2() {
        this(0, 0, 0);
    }

    
    public Tiempo2(int hora, int minu, int segundos) {   //Constructor con variables de entrada
        setTiempo(hora, minu, segundos);
    }

    
    public void setTiempo(int hora, int minu, int segundos) { //Establecer tiempo
        int totalSegundos = hora * 3600 + minu * 60 + segundos;

        if (totalSegundos >= 0 && totalSegundos < 24 * 3600) {
            this.segun = totalSegundos;
        } else {
            throw new IllegalArgumentException("Error: Tiempo inválido");
        }
    }

   
    public int getHoras() {  
        return segun / 3600;
    }

    
    public int getMinutos() {    //Obtencion de minutos
        return (segun % 3600) / 60;
    }

    
    public int getSegundos() {    //Obtencion de segundos
        return segun % 60;
    }

    // Método para convertir el tiempo a formato de 24 horas
    public String toString() {
        return String.format("%02d:%02d:%02d", getHoras(), getMinutos(), getSegundos());
    }
}

