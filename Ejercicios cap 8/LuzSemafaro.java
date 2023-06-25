public enum LuzSemafaro {
    ROJO(30),
    VERDE(45),
    AMARILLO(5);

    private int duracion;

    // Constructor de la enum
    LuzSemafaro(int duracion) {
        this.duracion = duracion;
    }

    // Método para obtener la duración
    public int getDuracion() {
        return duracion;
    }
}

