/*
 * Programa que demana un text i mostra una versió transformada segons les següentes regles:
 -Les vocals (les catalanes) apareixeran en minúscules
 -Les lletres no vocals apareixeran en majúscules
 -Els nombres (atenció, no els dígits!) apareixeran entre parèntesis ()
 -La resta de caràcters, excepte els blancs, desapareixen a la versió transformada

Simulació:
Text?
Avui faig 19 anys!
aVui FaiG (19) aNYS
 */
public class TransformaText{
    public static void main (String [] args){
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    System.out.println(transformaText(text)); 
    
    } 
        
    public static String transformaText(String text){
    
        String textFinal ="";
    
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            char cMin = Character.toLowerCase(c);
            
            if (Character.isLetter(cMin)){
                if (UtilString.esVocal(cMin)){
                    
                    textFinal += cMin; 
                }
                else{
                    char consonantMaj = Character.toUpperCase(c);
                    
                    textFinal += consonantMaj;
                }
            }
            else if (Character.isDigit(c)){
                if (i==0 && Character.isDigit(c)){
                    textFinal += "(" + c;
                }
            
                if (i==text.length()-1){
                    char anterior = text.charAt(i - 1); 
                    
                    if (Character.isDigit(anterior) && Character.isDigit(c)){
                        textFinal += c + ")";
                    }
                    else if (!Character.isDigit(anterior) && Character.isDigit(c)){
                        textFinal += "(" + c + ")";
                    }
                }
            
                if (i > 0 && i < text.length() - 1) {
                    char anterior = text.charAt(i - 1);
                    char posterior = text.charAt(i + 1);
                
                    if (!Character.isDigit(anterior) && Character.isDigit(c) && Character.isDigit(posterior)){
                        textFinal += "(" + c;
                    }
                    else if (Character.isDigit(anterior) && Character.isDigit(c) && !Character.isDigit(posterior)){
                        textFinal += c + ")";
                    }
                }
            }
            else if (Character.isWhitespace(c)){
                textFinal += c;
            }
       
        }
        
        return textFinal;
       
    }
}

