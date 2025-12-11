/*
 * El programa anirà demanant texts fins que rebi una cadena buida. El programa anirà distribuint els diferents caràcters que vagi rebent: una de consonants, una altra per les vocals, una de números i una altra de símbols. Els guardarà en ordre en que els rep, però sense repetits.
 S'ha de tenir en compte:
 - Com a vocals, considerarem les vocals catalanes: à, a, è, e, é, i, ï, ò, o, ó, u, ú i ü.
 - Dels símbols no considerarem l'espai.
 - Les lletres es mostraran en majúscules.
 - En cas que ni s'hagi trobat cap caracter per alguna de les categories, no es mostrarà res sobre aquesta.
 */
/*public class Distribuidor {
    public static void main (String [] args){
    
        System.out.println("Introduïu texts (INTRO per finalitzar)");
        String text = Entrada.readLine();
        
        String nomesVocals = "";
        String nomesConsonant = "";
        String nomesDigit = "";
        String nomesSimbol = "";
        
        String vocals = "aàeéèiíïoòóuúü";
        
        while (!text.isEmpty()) { 
        
            //Vocals
            for(int i=0; i<text.length(); i++){
                char c = Character.toLowerCase(text.charAt(i));
                    
                    boolean esVocal = false;
                    
                    for (int v = 0; v < vocals.length(); v++) {
                        if (c == vocals.charAt(v)) {
                            esVocal = true;   
                        }
                    }
                     
                        if (esVocal){
                            boolean vocalRepetida = false;
                            for (int n = 0; n<nomesVocals.length(); n++){
                                if (c==nomesVocals.charAt(n)){
                                   vocalRepetida = true;
                                }
                            }
                                if (!vocalRepetida){
                                    nomesVocals = nomesVocals + c;
                                }
                        }                
            }
                    
            //Consonants
            for(int i=0; i<text.length(); i++){
                char c = Character.toLowerCase(text.charAt(i));
                    
                    if (Character.isLetter(c)){
                    
                    boolean esVocal = false;
                    
                        for (int v = 0; v < vocals.length(); v++) {
                            if (c == vocals.charAt(v)) {
                                esVocal = true;   
                            }
                        }     
                            
                            if (!esVocal){
                                boolean consonantRepetida = false;
                                for (int n = 0; n<nomesConsonant.length(); n++){
                                    if (c==nomesConsonant.charAt(n)){
                                       consonantRepetida = true;
                                    }
                                }
                                    if (!consonantRepetida){
                                        nomesConsonant = nomesConsonant + c;
                                    }
                            }                
                    }
            }
           
           //Nombres
            for(int i=0; i<text.length(); i++){
                char c = text.charAt(i);
              
                if (Character.isDigit(c)){
                    boolean digitRepetit = false;
                    for (int j=0; j<nomesDigit.length(); j++){
                        if(c == nomesDigit.charAt(j)){
                           digitRepetit = true;
                        }
                    }
                        if (!digitRepetit){
                            nomesDigit = nomesDigit + c;
                        } 
                }       
            }
            
            //Simbols
            for(int i=0; i<text.length(); i++){
                char c = text.charAt(i);
              
                if (!Character.isDigit(c) && !Character.isLetter(c) && !Character.isWhitespace(c)){
                    boolean simbolRepetit = false;
                        for (int j=0; j<nomesSimbol.length(); j++){
                            if(c == nomesSimbol.charAt(j)){
                                simbolRepetit = true;
                            }
                        }
                        if (!simbolRepetit){
                            nomesSimbol = nomesSimbol + c;
                        } 
              }
            }
            
            text = Entrada.readLine();
    
        }
        
        //Impressió vocals
        if (nomesVocals.length()>0){
            String vocalsMajuscula = nomesVocals.toUpperCase();
            System.out.println ("Vocals: " + vocalsMajuscula);
        }
        
        //Impressió consonants
        if (nomesConsonant.length()>0){
        String consonantMajuscula = "";
            for (int i = 0; i < nomesConsonant.length(); i++) {
                char c = nomesConsonant.charAt(i);

                if (c == 'ß') {
                    consonantMajuscula = consonantMajuscula + 'ß';
                } else {
                    consonantMajuscula = consonantMajuscula + Character.toUpperCase(c);
                }
            }
        System.out.println("Consonants: " + consonantMajuscula);
        }
        
        //Impressió digits
        if (nomesDigit.length()>0){
            System.out.println ("Nombres: " + nomesDigit);
        }
        
        //Impressió símbols
        if (nomesSimbol.length()>0){
            System.out.println ("Símbols: " + nomesSimbol);
        }
    }
}*/

public class Distribuidor {
    public static void main (String [] args){
    
        System.out.println("Introduïu texts (INTRO per finalitzar)");
        String text = Entrada.readLine();
        
        String nomesVocals = "";
        String nomesConsonant = "";
        String nomesDigit = "";
        String nomesSimbol = "";
        
        String vocals = "AÀEÉÈIÍÏOÒÓUÚÜ";
        
        while (!text.isEmpty()) { 
        
            //Vocals
            for(int i=0; i<text.length(); i++){
                char c = Character.toUpperCase(text.charAt(i));
                    
                    boolean esVocal = false;
                    
                    for (int v = 0; v < vocals.length(); v++) {
                        if (c == vocals.charAt(v)) {
                            esVocal = true;   
                        }
                    }
                     
                        if (esVocal){
                            boolean vocalRepetida = false;
                            for (int n = 0; n<nomesVocals.length(); n++){
                                if (c==nomesVocals.charAt(n)){
                                   vocalRepetida = true;
                                }
                            }
                                if (!vocalRepetida){
                                    nomesVocals = nomesVocals + c;
                                }
                        }                
            }
                    
            //Consonants
            for(int i=0; i<text.length(); i++){
                char c = Character.toUpperCase(text.charAt(i));
                    
                    if (Character.isLetter(c)){
                    
                    boolean esVocal = false;
                    
                        for (int v = 0; v < vocals.length(); v++) {
                            if (c == vocals.charAt(v)) {
                                esVocal = true;   
                            }
                        }     
                            
                            if (!esVocal){
                                boolean consonantRepetida = false;
                                for (int n = 0; n<nomesConsonant.length(); n++){
                                    if (c==nomesConsonant.charAt(n)){
                                       consonantRepetida = true;
                                    }
                                }
                                    if (!consonantRepetida){
                                        nomesConsonant = nomesConsonant + c;
                                    }
                            }                
                    }
            }
           
           //Nombres
            for(int i=0; i<text.length(); i++){
                char c = text.charAt(i);
              
                if (Character.isDigit(c)){
                    boolean digitRepetit = false;
                    for (int j=0; j<nomesDigit.length(); j++){
                        if(c == nomesDigit.charAt(j)){
                           digitRepetit = true;
                        }
                    }
                        if (!digitRepetit){
                            nomesDigit = nomesDigit + c;
                        } 
                }       
            }
            
            //Simbols
            for(int i=0; i<text.length(); i++){
                char c = text.charAt(i);
              
                if (!Character.isDigit(c) && !Character.isLetter(c) && !Character.isWhitespace(c)){
                    boolean simbolRepetit = false;
                        for (int j=0; j<nomesSimbol.length(); j++){
                            if(c == nomesSimbol.charAt(j)){
                                simbolRepetit = true;
                            }
                        }
                        if (!simbolRepetit){
                            nomesSimbol = nomesSimbol + c;
                        } 
              }
            }
            
            text = Entrada.readLine();
    
        }
        
/*----------------------------------IMPRESSIÓ RESULTATS----------------------------------*/
        
        //Impressió vocals
        if (nomesVocals.length()>0){
            System.out.println ("Vocals: " + nomesVocals);
        }
        
        //Impressió consonants
        if (nomesConsonant.length()>0){
            System.out.println ("Consonants: " + nomesConsonant);
        }
        
        //Impressió digits
        if (nomesDigit.length()>0){
            System.out.println ("Nombres: " + nomesDigit);
        }
        
        //Impressió símbols
        if (nomesSimbol.length()>0){
            System.out.println ("Símbols: " + nomesSimbol);
        }
    }
}
