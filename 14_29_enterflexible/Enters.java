/*
 * Programa que va demanant texts, aquest indicarà si correspón o no a un nombre enter escrit amb dígits. 
 - Si el primer caràceter és un + o -, el nombre seguirá sent un nombre enter.
 - El programa ignorarà els espais en qualsevol lloc.
 - El programa ignorarà separadors com punts (.) i guions baixos (_) sempre i quan es trobin entre dos dígits.
 * El programa finalitzarà quan rebi una cadena buida.
 */
public class Enters{
    public static void main (String [] args) {
    
    System.out.println("Introdueix els texts a analitzar:");
    String text = Entrada.readLine();
    
        while (!text.isEmpty()){
        
            int inicial = 0;
            
            boolean esDigit = true;
            boolean hihaDigit = false;
            boolean hihaSeparador = true;
            boolean hihaSigne = false;
            boolean digitAbansDelSigne = false;
            boolean digitDespresDelSigne = false;
            
            // Si comença per '+' o '-' es canvia la posició inicial a 1
            if (text.charAt(0) == '+' || text.charAt(0) == '-'){
                hihaSigne = true;
                inicial = 1;
            }
                
                //Bucle per recorrer els caràcters
                for (int i=inicial; i<text.length(); i++){
                    char c = text.charAt(i);
                    
                    //Si hi ha un digit
                    if (Character.isDigit(c)) {
                        hihaDigit = true;

                        if (hihaSigne) {
                            digitDespresDelSigne = true;
                        } else {
                            digitAbansDelSigne = true;
                        }
                    }

                    // Si hi ha '+' o '-'
                    if (c == '+' || c == '-') {
                        if (hihaSigne) {
                            esDigit = false;   // més d'un signe
                        }
                        hihaSigne = true;
                    }
                    
                    // Condició si el text està entre la segona posició la penúltima
                    if (i > 0 && i < text.length() - 1) {
                        char anterior = text.charAt(i - 1);
                        char posterior = text.charAt(i + 1);

                        // Si el caracter anterior es un espai, si hi ha un '+' o un '-' i el caracter posterior es un digit
                        if (!Character.isWhitespace(anterior) && !hihaSigne && !Character.isDigit(posterior) && !Character.isWhitespace(posterior)){
                            esDigit = false;
                        }
                        
                        // Si hi ha un '.' o una '_' entre dos digits
                        if ((c == '.' || c == '_') &&
                            (!Character.isDigit(anterior) || !Character.isDigit(posterior))) {
                            hihaSeparador = false;
                        }
                    }
                        // Si hi ha un '.' o una '_' a la primera posició o a l'última posició
                        if (text.charAt(0) == '.' || text.charAt(0) == '_' ||
                            text.charAt(text.length()-1) == '.' || text.charAt(text.length()-1) == '_'){
                                hihaSeparador = false;
                            } 
                    
                    // Si el caràcter no es digit, no es un espai en blanc i no té separadors
                    if (!Character.isDigit(c) && !Character.isWhitespace(c) && !hihaSeparador){
                        esDigit = false;
                    }
                }
                
                    // Validacions finals del signe
                    
                    // Si hi ha signe després d'un número
                    if (hihaSigne && digitAbansDelSigne) {
                        esDigit = false;   
                    }
                    
                    // Si NO hi ha número després
                    if (hihaSigne && !digitDespresDelSigne) {
                        esDigit = false;   
                    }
                
/*--------------------------------------------------RESULTAT FINAL --------------------------------------------------*/                
                
                // Si es compleixen les condicions esDigit i hihaDigit            
                if (esDigit && hihaDigit){
                    System.out.println("\"" + text + "\" és enter");
                }
                else {
                    System.out.println("\"" + text + "\" no és enter");
                }
               
/*-------------------------------------------------------------------------------------------------------------------*/
                
                // Tornem a demanar text per continuar amb el bucle
                text = Entrada.readLine();
        }
            // Missatge final quan acaba el bucle
            System.out.println("Adéu");
                
    }
}

