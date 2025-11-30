/*
 * Programa que demana un valor per línia de comandes i aquest valor determinarà el nombre de valors que s'imprimiran de forma ascendent i només imprimirà valors parells seran valors parells. Aquest cop am "for".
 */
public class NaturalsParells {
    public static void main(String[] args) {

        int numeroFi = Integer.parseInt(args[0]);

        if (numeroFi < 1) {
            System.out.println("Cap valor parell creixent entre 1 i " + numeroFi);
        } else {
            // for normalitzat
            for (int i = 2; i <= numeroFi; i += 2) {
                System.out.println(i);
            }
        }
    }
}
