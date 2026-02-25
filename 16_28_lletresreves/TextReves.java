/*
 * Programa que demana un text i el torna a mostrar però invertint l'ordre de les lletres i dígits. La resta de caràcters es mantindran en l'ordre original.

Considera la següent simulació

Text?
git branch -m <old-name> <new-name>
ema nwenem -a <ndl-omhc> <nar-btig>
 */
public class TextReves{
    public static void main (String [] args){
        System.out.println("Text?");
        String text = Entrada.readLine();

        System.out.println(UtilString.inverteixLletres(text));
    }
}
