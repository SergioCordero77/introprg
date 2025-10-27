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
            char ultim = text.charAt(text.length()-1);
            if (ultim=='a' || ultim=='A' || ultim=='e' || ultim=='E' || ultim=='i' || ultim=='I' || ultim=='o' || ultim=='O' || ultim=='u' || ultim=='U' || !Character.isLetter(ultim)) {
                System.out.println ("\"" + text + "\" no finalitza amb lletra no vocal");
            }
            else {
                System.out.println ("\"" + text + "\" finalitza amb la lletra no vocal \'" + ultim +"\'");
            }
        }
    }   
}
