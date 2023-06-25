public class Tiempo3 {
    private int segundos;

    // Constructor por defecto
    public Tiempo3() {
        this(0, 0, 0);
    }

    // Constructor con valores iniciales
    public Tiempo3(int horas, int minutos, int segundos) {
        setTiempo(horas, minutos, segundos);
    }

    // Método para establecer el tiempo
    public void setTiempo(int horas, int minutos, int segundos) {
        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

        if (totalSegundos >= 0 && totalSegundos < 24 * 3600) {
            this.segundos = totalSegundos;
        } else {
            throw new IllegalArgumentException("Error: Tiempo inválido");
        }
    }

    // Método para obtener las horas
    public int getHoras() {
        return segundos / 3600;
    }

    // Método para obtener los minutos
    public int getMinutos() {
        return (segundos % 3600) / 60;
    }

    // Método para obtener los segundos
    public int getSegundos() {
        return segundos % 60;
    }

    // Método para incrementar el tiempo en un segundo
    public void tictac() {
        segundos++;

        if (segundos == 24 * 3600) {
            segundos = 0; // Reiniciar a medianoche
        }
    }

    // Método para incrementar el tiempo en un minuto
    public void incrementarMinuto() {
        segundos += 60;

        if (segundos >= 24 * 3600) {
            segundos = 0; // Reiniciar a medianoche
        }
    }

    // Método para incrementar el tiempo en una hora
    public void incrementarHora() {
        segundos += 3600;

        if (segundos >= 24 * 3600) {
            segundos = 0; // Reiniciar a medianoche
        }
    }

    // Método para convertir el tiempo a formato de 24 horas (HH:MM:SS)
    public String toString() {
        return String.format("%02d:%02d:%02d", getHoras(), getMinutos(), getSegundos());
    }
}

