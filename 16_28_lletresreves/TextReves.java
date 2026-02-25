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

        System.out.println(inverteixLletres (text));
    }
    
    // Funció que va paraula per paraula i la inverteix
    public static String inverteixLletres (String text){
        
        String textInvertit = "";
        
        int inicial = text.length()-1;
        
        for (int i=0; i<text.length(); i++){
            char inici = text.charAt(i);
            
            
            if (Character.isLetter(inici) || Character.isDigit(inici)){
                
                for (int j=inicial; j>=0; j--){
                    char ultim = text.charAt(j);
                    
                    inicial --;
                    
                    if (Character.isLetter(ultim) || Character.isDigit(ultim)){
                        textInvertit += ultim;
                        break;
                    }
                }
            }
            else{
                textInvertit += inici;
            }
        }
        return textInvertit;
    }
}
