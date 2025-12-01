/*
 * El programa demanará un número per linia de comandes, aquest número determinarà el número de files. Per cada fila sortirá tants nombres (ordenats del 1 al nombre introduït) com files hi hagin formant un triangle.
 */
public class TriangleNombres {
    public static void main(String[] args) {

        System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine());

        if (valor < 1 || valor > 9) {
            System.out.println("Valor inadequat");
        } else {
            for (int i = 1; i <= valor; i++) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}

