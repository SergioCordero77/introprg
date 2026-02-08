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

    public static void main (String [] args){
    
        System.out.println(esEnter("0333333333"));
    
    } 
     
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
    public static String normalitzaText(String text){
       
        String textNormalitzat = "";
        
        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);
                
            textNormalitzat += normalitzaChar(c);
               
        }
    
      return textNormalitzat;
    
    }
    
    /* Normalitza els caràcters */
    public static char normalitzaChar(char c){
        
            // Per la 'a'
            if (c =='à' || c=='á'){
                c = 'a';
            }
            // Per la 'A'
            else if (c =='À' || c=='Á'){
                c = 'A';
            }
            // Per la 'e'
            else if (c =='è' || c=='é'){
                c = 'e';
            }
            // Per la 'E'
            else if (c =='È' || c=='É'){
                c = 'E';
            }
            // Per la 'i'
            else if (c =='ì' || c=='í' || c=='ï'){
                c = 'i';
            }
            // Per la 'I'
            else if (c =='Ì' || c=='Í' || c=='Ï'){
                c = 'I';
            }
            // Per la 'o'
            else if (c=='ò' || c=='ó'){
                c = 'o';
            }
            // Per la 'O'
            else if (c =='Ò' || c=='Ó'){
                c = 'O';
            }
            // Per la 'u'
            else if (c =='ù' || c=='ú' || c=='ü'){
                c = 'u';
            }
            // Per la 'U'
            else if (c =='Ù' || c=='Ú' || c=='Ü'){
                c = 'U';
            }
            // Per la ç
            else if (c =='ç'){
                c= 'c';
            }
            // Per la Ç
            else if (c =='Ç'){
                c= 'C';
            }
    
      return c;
  }
  /*Normalitza espais en blanc*/
  public static String normalitzaBlancs (String text){
        
        String textNormalitzat="";      
        
        boolean totBlanc = true;
        
        int comptador=0;
    
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            for(int j=0; j<text.length(); j++){
                char espai = text.charAt(j);
                
                if (!Character.isWhitespace(espai)){
                    totBlanc = false;
                    break;
                } 
            }
            
            if(!totBlanc){
                if (i==0){
                    if (!Character.isWhitespace(c)){
                        textNormalitzat += '"';
                        comptador++;
                    } 
                }
                
                if (i<text.length()-1){ 
                    char cPost = text.charAt(i+1); 
                    
                    if (Character.isWhitespace(c) && Character.isLetter(cPost)){ 
                        
                      /*  textNormalitzat += ' '; */
                        comptador++;
                        
                        if (comptador==1){
                            textNormalitzat += '"';
                        }
                        else if (comptador>1){
                            textNormalitzat += ' ';
                        }
                    } 
                    else if (!Character.isWhitespace(c)){ 
                        textNormalitzat += c; 
                    }
                }
                
                if (i==text.length()-1){
                    if (!Character.isWhitespace(c)){
                        textNormalitzat += c + "\"";
                    }
                    else{
                        textNormalitzat += '"';
                    }
                }
            }
            else{
                textNormalitzat += "\"\"";
                break;
            }
        } 
                               
        return textNormalitzat;
    }
    
   /* public static boolean esEnter (String text){
    
    boolean hihaSigne = false;
    boolean esDigit = false;
    boolean numeroIniciat = false;
    boolean numeroAcabat = false;
    
    int comptador = 0;
    
    String numeros = "123456789";
    
    for(int i=0; i<text.length(); i++){
        char c = text.charAt(i);
        
        //Si hi ha espais
        if (Character.isWhitespace(c)) {
           if (numeroIniciat){
                numeroAcabat = true;
           }
 
            continue;
        }
        if (Character.isWhitespace(c)) {
            if (!numeroIniciat) {
                return false;
            }
            numeroAcabat = true;
            continue;
        }
        
        //Si hi ha signes
        if (c=='+' || c=='-') {
            if (hihaSigne || numeroAcabat || esDigit){
                return false;
            }
            hihaSigne = true;
            numeroIniciat = true;
            
            continue;
        }
        
        //Si hi ha digit
        if (Character.isDigit(c)) {
            
            if (c=='0' && !esDigit){
                continue;
            }
            
            comptador ++;
            
            if (numeroAcabat || comptador>9){
                return false;
            }
            
            esDigit = true;          
            numeroIniciat = true;
            
            continue;
        }
        
        return false;
    }   
    
    return esDigit;
    } */
    
    public static boolean esEnter (String text){
    
    int inicial = 0;
    
    boolean esDigit = true;
    boolean hihaDiferentAZero = false;
    
    int comptador = 0;
    
    if (text.isEmpty()){
        return false;
    }
    else{
        if (text.charAt(0) == '+' || text.charAt(0) == '-'){
            inicial = 1; // Si el número comença amb '+' o '-', el numero inicial amb el que començarà el bucle for serà 1
        } 
            // Recorre el text filtrat (sense espais)
            for (int i=inicial; i<text.length(); i++){
                char c = text.charAt(i);
                
                if (!Character.isDigit(c)){
                    return false;
                }
                
                //Si hi ha digit
                if (Character.isDigit(c)) {
                    
                    if (c!='0'){
                        hihaDiferentAZero = true;
                    }
                    
                    if (hihaDiferentAZero){
                    
                        comptador ++;
                        
                        if (comptador>9){
                            return false;
                        }
                        
                        esDigit = true;          
                        
                        continue;
                    }
                }
            }
    }
    
    return esDigit; 
    }

}
