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
    
    
    int inicial = 0;
    
    
    
    
        while (!text.isEmpty()){
        
            if (text.charAt(0) == '+' || text.charAt(0) == '-'){
                inicial = 1;
            }
            
            boolean esDigit = true;
            boolean hihaSeparador = true;
                for (int i=inicial; i<text.length(); i++){
                    char c = text.charAt(i);
                    
                    if (i > 0 && i < text.length() - 1) {
                        char anterior = text.charAt(i - 1);
                        char posterior = text.charAt(i + 1);

                        if ((c == '.' || c == '_') &&
                            (!Character.isDigit(anterior) || !Character.isDigit(posterior))) {
                            hihaSeparador = false;
                        }
                    }
                    
                        if (text.charAt(0) == '.' || text.charAt(0) == '_' ||
                            text.charAt(text.length()-1) == '.' || text.charAt(text.length()-1) == '_'){
                                hihaSeparador = false;
                            } 
                    
                    if (!Character.isDigit(c) && !Character.isWhitespace(c)){
                        esDigit = false;
                    }
                }            
                if (esDigit){
                    System.out.println("\"" + text + "\" és enter");
                }
                else {
                    System.out.println("\"" + text + "\" no és enter");
                }
                
                text = Entrada.readLine();
                
                inicial = 0;
        }
            System.out.println("Adéu");
                
    }
}

