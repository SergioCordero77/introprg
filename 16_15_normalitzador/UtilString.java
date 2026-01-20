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
                textSeparat += c + ", ";
            }
        }
            
        return textSeparat;
        
    }
    
    /* Separa un text per comes*/
    public static String lletresSeparades(String text) {
        String textSeparat = "";
        
        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if (i == text.length()-1){
                textSeparat += c;
            }
            else{
                textSeparat += c + ", ";
            }
        }
            
        return textSeparat;
        
    }  
    
    /* Retorna el text al revés*/
    public static String inverteix(String text) {
        String textReves = "";
        
        for (int i=text.length(); i>=0; i--){
            char c = text.charAt(i);
            
                textReves += c;
        }
            
        return textReves;
        
    }
    
    /*Normalitza text:
    
    -Les vocals catalanes amb accent apareixeran en la seva variant sense accent.
    -La ç apareixerà com a c.
    */
    public static String normalitzaChar(String text){
        
        String textNormalitzat = "";
        
        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            // Per la 'a'
            if (c =='à' || c=='á'){
                c = 'a';
                
                textNormalitzat += c;
            }
            // Per la 'A'
            else if (c =='À' || c=='Á'){
                c = 'A';
                
                textNormalitzat += c;
            }
            // Per la 'e'
            else if (c =='è' || c=='é'){
                c = 'e';
                
                textNormalitzat += c;
            }
            // Per la 'E'
            else if (c =='È' || c=='É'){
                c = 'E';
                
                textNormalitzat += c;
            }
            // Per la 'i'
            else if (c =='ì' || c=='í' || c=='ï'){
                c = 'i';
                
                textNormalitzat += c;
            }
            // Per la 'I'
            else if (c =='Ì' || c=='Í' || c=='Ï'){
                c = 'E';
                
                textNormalitzat += c;
            }
            // Per la 'o'
            else if (c=='ò' || c=='ó'){
                c = 'o';
                
                textNormalitzat += c;
            }
            // Per la 'O'
            else if (c =='Ò' || c=='Ó'){
                c = 'O';
                
                textNormalitzat += c;
            }
            // Per la 'u'
            else if (c =='ù' || c=='ú' || c=='ü'){
                c = 'u';
                
                textNormalitzat += c;
            }
            // Per la 'U'
            else if (c =='Ù' || c=='Ú'){
                c = 'U';
                
                textNormalitzat += c;
            }
            // Per la ç
            else if (c =='ç'){
                c= 'c';
                
                textNormalitzat += c;
            }
            // Per la Ç
            else if (c =='Ç'){
                c= 'C';
                
                textNormalitzat += c;
            }
            else{
                textNormalitzat += c;
            }
        }
    
      return textNormalitzat;
    
    }
}
