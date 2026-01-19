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

        String senseEspais = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (!Character.isWhitespace(c)) {
                senseEspais += c;
            }
        }

        System.out.println(
            UtilString.cometeja(
                UtilString.inverteix(senseEspais)
            )
        );
    }
}
