/*
 * El programa anirà demanant texts fins que rebi una cadena buida. El programa anirà distribuint els diferents caràcters que vagi rebent: una de consonants, una altra per les vocals, una de números i una altra de símbols. Els guardarà en ordre en que els rep, però sense repetits.
 S'ha de tenir en compte:
 - Com a vocals, considerarem les vocals catalanes: à, a, è, e, é, i, ï, ò, o, ó, u, ú i ü.
 - Dels símbols no considerarem l'espai.
 - Les lletres es mostraran en majúscules.
 - En cas que ni s'hagi trobat cap caracter per alguna de les categories, no es mostrarà res sobre aquesta.
 */
public class Distribuidor {
    public static void main (String [] args){
    
        System.out.println("Introduïu texts INTRO per finalitzar");
        String text = Entrada.readLine();
        
        String nomesVocals = "";
        String nomesConsonant = "";
        String nomesDigit = "";
        String nomesSimbol = "";
        
       //Lletres
        for(int i=0; i<text.length(); i++){
          char c = text.charAt(i);
        
                    String vocals = "aàeèéiíïoòóuúü";
                    
                    boolean esVocal = false;
                    
                    for (int v = 0; v < vocals.length(); v++) {
                        if (c == vocals.charAt(v)) {
                            esVocal = true;
                            
                           nomesVocals = nomesVocals + c;
                        }
                    
                       /* for (int n = 0; n<nomesVocals.length(); n++){
                            if (c==nomesVocals.charAt(n)){
                                nomesVocals = nomesVocals + c;
                            }
                        }*/
                    }                
        }
                String vocalsMajuscula = nomesVocals.toUpperCase();
                System.out.println ("Vocals: " + vocalsMajuscula);
                
/*        //Consonants
        for(int i=0; i<text.length(); i++){
          char c = text.charAt(i);
          if (Character.isLetter(c)){
            nomesConsonant = nomesConsonant + c;
          }
        }
        System.out.println ("Consonants: " + nomesConsonant);
       
        //Nombres
        for(int i=0; i<text.length(); i++){
          char c = text.charAt(i);
          
          if (Character.isDigit(c)){
            nomesDigit = nomesDigit + c;
            
            for (int j=0; j<nomesDigit.length(); j++);
                if(c == text.charAt(j)){
                
                } 
          }       
        }
        System.out.println ("Nombres: " + nomesNombres);
        
        //Simbols
        for(int i=0; i<text.length(); i++){
          char c = text.charAt(i);
          
          if (!Character.isDigit(c) && !Character.isLetter(c)){
            nomesSimbol = nomesSimbol + c;
          }
        }
        System.out.println ("Símbols: " + nomesSimbol);*/
    }
}
