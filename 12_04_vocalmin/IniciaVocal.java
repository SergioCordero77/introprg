/*
 * Programa que mostra si el text introduït
 * comença per vocal o no.
 */
public class IniciaVocal {
    public static void main (String [] args){
    
    System.out.println ("Text?");
    String text = Entrada.readLine();
    
        if ((text.isEmpty()) || (Character.isWhitespace(text.charAt(0)))){
                System.out.println ("El text no té lletres");
            }
        else {
   
        char primer = text.charAt(0);
      
            if ((primer == 'a') || (primer == 'A') || (primer == 'e') || (primer == 'E') || (primer == 'i') || (primer == 'I') || (primer == 'o') || (primer == 'O') || (primer == 'u') || (primer == 'U')) {
                System.out.println ("\"" + text + "\" inicia amb la vocal \'" + text.charAt(0) +"\'");
            }
            else {
                System.out.println ("\"" + text + "\" no inicia amb vocal");
            }
        }
    }   
}
