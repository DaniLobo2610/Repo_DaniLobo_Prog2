public class Carta {
    private Cara cara;
    private Palo palo;

    public Carta(Cara cara, Palo palo) {
        this.cara = cara;
        this.palo = palo;
    }

    public Cara getCara() {
        return cara;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return cara + " de " + palo;
    }
}

