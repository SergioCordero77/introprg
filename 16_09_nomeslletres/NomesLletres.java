/*
 * Programa que demana un text i mostra les lletres que conté. Cada lletra estarà separada per una coma en l'ordre en que apareix al text original. La resta de caràcters no es mostrarà.
 */
public class NomesLletres{
    public static void main(String[] args) {
        System.out.println("Text?");
        System.out.println(
                UtilString.lletresSeparades(
                    UtilString.nomesLletres(
                        Entrada.readLine()
                        )
                    )
                );
    }
}
