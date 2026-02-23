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
    
    /*Es enter flexible*/
    public static boolean esEnter (String text){

    int inicial = 0;

    boolean esDigit = false;
    boolean hihaDiferentAZero = false;

    int comptador = 0;

    if (text.isEmpty()){
        return false;
    }
    else{
        // Comprovem si el primer caràcter és un '+' o '-'
        if (text.charAt(0) == '+' || text.charAt(0) == '-'){
            inicial = 1; // canviem el número inicial per a començar a analitzar
            if (text.length() == 1) { //Si el String només té un signe
                return false;
            }
        }

        for (int i = inicial; i < text.length(); i++){
            char c = text.charAt(i);
            
            // Si no és digit
            if (!Character.isDigit(c)){
                return false;
            }
            else{ //Si hi ha digit
                esDigit = true; //S'ha trobat digit i canviem el boolean a True

                if (c != '0'){ // Si el digit és diferent a 0
                    hihaDiferentAZero = true; // El digit és diferent a 0 i es canvia el boolean a true
                }

                if (hihaDiferentAZero){ //Tenim un número que es diferent a 0
                    comptador++; // sumem +1 al comptador

                    if (comptador > 9){ // Si el comptador és major a 9, retorna False
                        return false;
                    }
                }
            }
        }

        return esDigit;
    }
    }
    
    public static boolean esEnter(String text, boolean estricte){
    
    if (estricte){
        
        int inicial = 0;

        boolean esDigit = false;
        boolean hihaDiferentAZero = false;

        int comptador = 0;

        if (text.isEmpty()){
            return false;
        }
        else{
            // Comprovem si el primer caràcter és un '+' o '-'
            if (text.charAt(0) == '+' || text.charAt(0) == '-'){
                inicial = 1; // canviem el número inicial per a començar a analitzar
                if (text.length() == 1) { //Si el String només té un signe
                    return false;
                }
            }

            for (int i = inicial; i < text.length(); i++){
                char c = text.charAt(i);
                
                // Si no és digit
                if (!Character.isDigit(c)){
                    return false;
                }
                else{ //Si hi ha digit
                    esDigit = true; //S'ha trobat digit i canviem el boolean a True

                    if (c != '0'){ // Si el digit és diferent a 0
                        hihaDiferentAZero = true; // El digit és diferent a 0 i es canvia el boolean a true
                    }

                    if (hihaDiferentAZero){ //Tenim un número que es diferent a 0
                        comptador++; // sumem +1 al comptador

                        if (comptador > 9){ // Si el comptador és major a 9, retorna False
                            return false;
                        }
                    }
                }
            }
            
            return esDigit; 
        }
    }
    else{

        if (text.isBlank()){
            return false;
        }

        int inicial = 0;
        
        int cont = 0;
            
        boolean esDigit = true;
        boolean hihaDigit = false;
        boolean hihaSigne = false;
        boolean digitAbansDelSigne = false;
        boolean digitDespresDelSigne = false;
        boolean numeroComencat = false;
        boolean signePermes = true;
        
        // Si comença per '+' o '-' es canvia la posició inicial a 1
        if (text.charAt(0) == '+' || text.charAt(0) == '-'){
            hihaSigne = true;
            inicial = 1;
        }
        
        if ((text.charAt(0) == '_' || text.charAt(0) == '.') || 
            text.charAt (text.length() - 1) == '_' || text.charAt (text.length() - 1) == '.'){
            esDigit = false;
        }
            
            //Bucle per recorrer els caràcters
            for (int i=inicial; i<text.length(); i++){
                char c = text.charAt(i);
                
                //Si hi ha espais
                if (Character.isWhitespace(c)){
                    continue;
                }
                
                //Si hi ha un digit
                if (Character.isDigit(c)) {
                    hihaDigit = true;

                    if (hihaSigne) {
                        digitDespresDelSigne = true;
                    } else {
                        digitAbansDelSigne = true;
                    }
                    
                    // Ignorem els zeros inicials
                    if (!numeroComencat){
                        if (c=='0'){
                            continue;
                        }
                        else{
                            numeroComencat=true;
                        }
                    }
                    
                    cont ++;
                    
                    if(cont>9){
                        esDigit = false;
                    }
                }

                // Si hi ha '+' o '-'
                if (c == '+' || c == '-') {
                    if (hihaSigne || !signePermes) {
                        esDigit = false;   // signe no permès
                        break;
                    }
                    hihaSigne = true;   // marquem que hi ha signe
                    signePermes = false; // ja no es permet un altre signe
                    continue;
                }
                
                
                // Condició si el text està entre la segona posició la penúltima
                if (i > 0 && i < text.length() - 1) {
                    char anterior = text.charAt(i - 1);
                    char posterior = text.charAt(i + 1);
                    
                    // Si hi ha un '.' o una '_' entre dos digits
                    if (c == '.' || c == '_') {
                        if (!Character.isDigit(anterior) || !Character.isDigit(posterior)) {
                            esDigit = false;
                        }
                    }
                }
                
                // Si el caràcter no es digit, no es un espai en blanc, no té signes i no té separadors
                if (!Character.isDigit(c) && !Character.isWhitespace(c)
                    && c != '+' && c != '-' && 
                    c != '.' && c != '_') {
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

        return esDigit && hihaDigit;
    }
    }    

    public static int aEnter(String text){
    
        return Integer.parseInt(text);
    }
    
    public static int aEnter(String text, boolean estricte){
    
    if (estricte){
        return Integer.parseInt(text);
    }
    else{
        String numNet = "";
        
        for (int i = 0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if (text.charAt(0) == '_' || text.charAt(0) == '.' ||
                text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '-' ||
                text.charAt(text.length()-1) == '_' || text.charAt(text.length()-1) == '.') {

                numNet += c;
            }
            
            if (i==0){
                if (text.charAt(0) == '+'){
                    continue;
                }
                else if (text.charAt(0) == '-'){
                    numNet += c;
                    continue;
                }
            }
            
            if (i > 0 && i < text.length() - 1) {
                char anterior = text.charAt(i - 1);
                char posterior = text.charAt(i + 1);
                
                // Si hi ha un '.' o una '_' entre dos digits
                if (c == '.' || c == '_') {
                    if (posterior == '.' || posterior == '_' || posterior== ' ') {
                        numNet += c;
                    }
                }
            }
        
            if (Character.isWhitespace(c) || c=='.' || c=='_'){
                continue;
            }
            
            numNet += c;
        }
        
        return Integer.parseInt(numNet);
    }
    }
    /*
     * Retorna una cadena construïda repetint el text original tantes vegades com sigui necessari fins arribar al nombre de caràcters indicat. 
     Si el nombre és més gran que la longitud del text, el text es repeteix des del principi tantes vegades com calgui.
     */
    public static String cadenaContinua(String text, int nombre){
    String cadena = "";
    
    for (int i=0; i<nombre; i++){
        char c = text.charAt(i%text.length());
        
        cadena += c;
    }
    return cadena;
    }
    /*
     * Retorna una cadena contruïda amb els caràcter que es troben entre els dos números. 
     Si el primer número és més petit que l'últim, retorna la cadena amb els caracters en ordre ascendent.
     Si el segon número és més petit que el primer, retorna la cadena amb els caracters en ordre descendent.
     */
    public static String intervalString(String text, int inici, int ultim){
    String cadena = "";
    
    //normalització de números
    if (inici <0){
        inici = 0;
    }
    else if (inici >= text.length()){
        inici = text.length()-1;
    }
    else if (ultim >= text.length()){
        ultim = text.length()-1;
    }
    else if (ultim < 0){
        ultim = 0;
    }

    //Impressió de resultat segons el valors
    if(inici<ultim){
        
        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);    
            if (i>=inici && i<=ultim){
                
                cadena += c;
            }
        }
    }
    else if(inici>ultim){
        
        for (int i=text.length()-1; i>=0; i--){
            char c = text.charAt(i);
            if (i>=ultim && i<=inici){
                
                cadena += c;
            } 
        }
    }
    else{
        char c = text.charAt(inici);    
            
            cadena += c;    
    }
    return cadena;
    }
    
// Compta quants caràcters numèrics (0–9) hi ha dins del text.
public static int numDigits(String text){
    int contDigits = 0;
    
    for (int i = 0; i < text.length(); i++){
        char c = text.charAt(i);
        
        if (Character.isDigit(c)){
            contDigits++;
        }
    }
    return contDigits;
}


// Compta quantes vocals majúscules hi ha dins del text. Només compta els caràcters que siguin vocals i, a més, estiguin en majúscula.

public static int numVocalsMajuscules(String text){
    int contVocMaj = 0;
    
    for (int i = 0; i < text.length(); i++){
        char c = text.charAt(i);
        char cMin = Character.toLowerCase(c);
        
        if (esVocal(cMin)){
            if (Character.isUpperCase(c)){
                contVocMaj++;
            }
        }
    }
    return contVocMaj;
}


// Compta quantes vocals minúscules hi ha dins del text. Només compta els caràcters que siguin vocals i, a més, estiguin en minúscula.
public static int numVocalsMinuscules(String text){
    int contVocMin = 0;
    
    for (int i = 0; i < text.length(); i++){
        char c = text.charAt(i);
        
        if (esVocal(c)){
            if (Character.isLowerCase(c)){
                contVocMin++;
            }
        }
    }
    return contVocMin;
}


// Compta quantes lletres majúscules hi ha dins del text. Només compta els caràcters que siguin lletres i estiguin en majúscula.
public static int numLletresMajuscules(String text){
    int contMaj = 0;
    
    for (int i = 0; i < text.length(); i++){
        char c = text.charAt(i);
        
        if (Character.isLetter(c) && Character.isUpperCase(c)){
            contMaj++;
        }
    }
    return contMaj;
}


// Compta quantes lletres minúscules hi ha dins del text. Només compta els caràcters que siguin lletres i estiguin en minúscula.
public static int numLletresMinuscules(String text){
    int contMin = 0;
    
    for (int i = 0; i < text.length(); i++){
        char c = text.charAt(i);
        
        if (Character.isLetter(c) && Character.isLowerCase(c)){
            contMin++;
        }
    }
    return contMin;
}


//Compta el nombre total de lletres que hi ha dins del text. Té en compte qualsevol caràcter que sigui una lletra.
public static int numLletres(String text){
    int contLletres = 0;
    
    for (int i = 0; i < text.length(); i++){
        char c = text.charAt(i);
        
        if (Character.isLetter(c)){
            contLletres++;
        }
    }
    return contLletres;
}

// retorna cert quan text comença amb prefix, considerant si ha de ser o no estricte
public static boolean esPrefix(String prefix, String text, boolean estricte){
    if (estricte){
        if (prefix.isBlank()){
            return true;
        }
        else{
        boolean coincident = false;
        for (int i = 0; i<prefix.length(); i ++){
            char c1 = text.charAt(i); 
            char c2 = prefix.charAt(i);
            
            if(c1 == c2){
                coincident = true;
            }
            else{
                return false;
            }
        }
        return coincident; 
        }           
    }
    else{
        String prefixFiltrat = normalitzaText(
                                    normalitzaBlancs(
                                            prefix.toLowerCase()
                                    )
                               );
        String textFiltrat = normalitzaText(
                                    normalitzaBlancs(
                                            text.toLowerCase()
                                    )
                               );
                               
       boolean coincident = false;
        for (int i = 0; i<prefixFiltrat.length(); i ++){
            char c1 = textFiltrat.charAt(i); 
            char c2 = prefixFiltrat.charAt(i);
            
            if(c1 == c2){
                coincident = true;
            }
            else{
                return false;
            }
        }
        return coincident;
    }
}

// equival a esPrefix(prefix, text, true)
public static boolean esPrefix(String prefix, String text){
    return esPrefix(prefix, text, true);
}
}
