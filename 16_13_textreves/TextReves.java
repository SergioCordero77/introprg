/*
 * Programa que mostra un text al revés. La sortida saltarà els espais de l'entrada.
 
 Simulació:
 
 Text?
Es gibt keinen Weg zurück
k, c, ü, r, u, z, g, e, W, n, e, n, i, e, k, t, b, i, g, s, E
 */
public class TextReves {

    public static void main(String[] args) {

        System.out.println("Text?");
        String text = Entrada.readLine();

        System.out.println(
            UtilString.cometeja(
                UtilString.inverteix(text)
            )
        );
    }
}
