/*Ejercicio 2.31 */

public class Cuadrados_Cubos {
    public static void main(String[] args) {
        System.out.println("Digitos\tCuadrados\tCubos");
        
        for (int i = 0; i <= 10; i++) {
            int cuadra = i * i;
            int cubo = i * i * i;
            
            System.out.println(i + "\t" + cuadra + "\t\t" + cubo);
        }
    }
}
