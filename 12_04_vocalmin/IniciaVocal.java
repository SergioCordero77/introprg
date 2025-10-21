/*
 * Programa que mostra si el text introduït
 * comença per vocal o no.
 */
public class IniciaVocal {
    public static void main (String [] args){
    
    System.out.println ("Text?");
    String text = Entrada.readLine();
    
        if ((text.charAt(0) == 'a') || (text.charAt(0) == 'A') || (text.charAt(0) == 'e') || (text.charAt(0) == 'E') || (text.charAt(0) == 'i') || (text.charAt(0) == 'I') || (text.charAt(0) == 'o') || (text.charAt(0) == 'O') || (text.charAt(0) == 'u') || (text.charAt(0) == 'U')) {
        System.out.println ("\"" + text + "\" comença amb la vocal \'" + text.charAt(0) +"\'");
        }
        else {
        System.out.println ("\"" + text + "\" no inicia amb vocal ");
        }
    }   
}
