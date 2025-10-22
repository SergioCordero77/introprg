/*
 * Programa que mostra si el text introduït
 * acaba amb vocal o no.
 */
public class AcabaLletraNoVocal {
    public static void main (String [] args){
    
    System.out.println ("Text?");
    String text = Entrada.readLine();
    
        if ((text.isEmpty()) || (Character.isWhitespace(text.charAt(0)))){
                System.out.println ("El text no té lletres");
            }
        else {
      
            if ((text.endsWith("a")) || (text.endsWith("A")) || (text.endsWith("e")) || (text.endsWith("E")) || (text.endsWith("i")) || (text.endsWith("I")) || (text.endsWith("o")) || (text.endsWith("O")) || (text.endsWith("u")) || (text.endsWith("U")) || (!Character.isLetter(text.length()-1))) {
                System.out.println ("\"" + text + "\" no finalitza amb lletra no vocal");
            }
            else {
                System.out.println ("\"" + text + "\" finalitza amb la lletra no vocal \'" + text.charAt(text.length()-1) +"\'");
            }
        }
    }   
}
