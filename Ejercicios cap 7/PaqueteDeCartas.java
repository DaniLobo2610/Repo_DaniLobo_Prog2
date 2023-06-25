public class PaqueteDeCartas {
    public static void main(String[] args) {
        Cara[] caras = Cara.values();
        Palo[] palos = Palo.values();
        
        System.out.println("\nHOLA MUY BUEN DIA, TARDE, NOCHE.");
        System.out.println("\n----- Caras de las cartas: -----");
        for (Cara cara : caras) {
            System.out.println(cara);
        }

        System.out.println("\n----- Palo de las cartas: -----");
        for (Palo palo : palos) {
            System.out.println(palo);
        }
    }
}

