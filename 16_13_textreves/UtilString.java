/* Utilitats de String
 *
 * Aquest mòdul conté diferents utilitats per gestionar diferents Strings
 *
 */
public class UtilString {
    /*
     * Donada una resposta textual, aquesta funció tradueix la resposta a
     * un booleà.
     * Considera true quan la resposta és, independentment de majúscules i minúscules
     * una vocal catalana: a, à, e, è, é, i, í, ï, o, ò, ó, u, ú i ü.
     * Altrament considera false.
     */
    public static boolean esVocal(char lletra) {
        String vocals = "aàeèéiíïoòóuúü";
        
            for (int i=0; i<vocals.length(); i++){
                char v = vocals.charAt(i);
                
                if (lletra==v){
                    return true;
                }
            }
            
        return false;
        
    }
    
    /*Filtra un text i només retorna les lletres del text*/
    public static String nomesLletres(String text) {
        String nomesLletres ="";
    
        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if (Character.isLetter(c)){
                nomesLletres += c;
            }
        }
            
        return nomesLletres;
        
    }
    
    /*Separa cada caràcter que no sigui un espai en blanc amb una coma i un espai.*/
    public static String cometeja(String text) {
        String textSeparat = "";
        
        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if (i == text.length()-1){
                textSeparat += c;
            }
            else{
                textSeparat += c + " ,";
            }
        }
            
        return textSeparat;
        
    }
    
    /* Retorna el text al revés*/
    public static String inverteix(String text) {
        String textReves = "";
        
        for (int i=text.length()-1; i>=0; i--){
            char c = text.charAt(i);
            
                textReves += c;
        }
            
        return textReves;
        
    }    
      
}
