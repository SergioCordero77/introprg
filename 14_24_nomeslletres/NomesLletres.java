/*
 * El programa demanarà un text i mostrarà les lletres del text original separades per comes (la última no tindrà coma). La resta de caracters no es mostrarà.
 */
public class NomesLletres {
    public static void main (String [] args){
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        for (int posicio=0; posicio<text.length(); posicio++){
            if (Character.isLetter(text.charAt(posicio))){
                System.out.print(text.charAt(posicio)+", ");
            }
        }
        System.out.println();
    }
}
