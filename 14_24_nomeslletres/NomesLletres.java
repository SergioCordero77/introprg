/*
 * El programa demanarà un text i mostrarà les lletres del text original separades per comes (la última no tindrà coma). La resta de caracters no es mostrarà.
 */
public class NomesLletres {
    public static void main (String [] args){
        
        String lletres = "";
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        // Filtrem text. Només agafem les lletres
        for (int posicio=0; posicio<text.length(); posicio++){
            char c = text.charAt(posicio);
            
            if (Character.isLetter(c)){
                
                lletres = lletres + c;
            }
        }
        
        // Imprimim segons el text filtrat
        for (int posicio1=0; posicio1<lletres.length(); posicio1++){
        
            char l = lletres.charAt(posicio1);
                                
                if (posicio1 == 0){
                    System.out.print( l );
                }
                else {
                    System.out.print(", " + l);
                }
        }
            
        
        System.out.println();
    }
}
