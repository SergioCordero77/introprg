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
        System.out.println(esEnter("	+67"));
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

    int comptador=0;

    for(int i=0; i<text.length(); i++){
        char c = text.charAt(i);

        if (i<text.length()-1){ 
            char cPost = text.charAt(i+1); 

            if (Character.isWhitespace(c) && !Character.isWhitespace(cPost) && comptador>=1){ 

                    textNormalitzat += ' ';
            }
        }
        
        if(Character.isWhitespace(c)){
            continue;
        }
        else{
            comptador++;
            textNormalitzat += c;
        }
    } 

    return textNormalitzat;
    
    }
    
    public static boolean esEnter (String text){
    
    //Treiem els espais
    //String textNet = normalitzaBlancs(text);
    
    int inicial = 0;
    
    boolean esDigit = true;
    
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
            }
    }
    
    return esDigit; 
    }
    
     /* Separa elements d'una array amb un separador*/
    public static String entreComes(int[] valors, char separador){
        String resultatFinal = "";
        
        if (valors.length == 0){
            System.out.println("Res a fer");
        }
        else{
        
            resultatFinal = "" + valors[0];
        
                for (int i = 1; i < valors.length; i++) {
                    resultatFinal += separador + " " + valors[i];
                }
        }    
        return resultatFinal;
    }
    
    public static String junta (String[] text, String separador, String separadorFinal){
        
        String textJunt = "";
        
            for (int i = 1; i < text.length; i++) {
                if (i==0){
                    textJunt += text[0];
                }
                if (i==text.length-1){
                    textJunt += separadorFinal + text[i];
                }
                else{
                    textJunt += separador + text[i];
                }
            }
            
        return textJunt;
           
    }
    
    public static String junta (String[] text, String separador){
        
        String textJunt = "";
        
            for (int i = 1; i < text.length; i++) {
                if (i==0){
                    textJunt += text[0];
                }
                else{
                    textJunt += separador + text[i];
                }
            }
            
        return textJunt;   
    }
}
