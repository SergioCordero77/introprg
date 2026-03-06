public class Progressio{
    
    public static final int NO_VALIDA = -1;
    public static final int NORMALETA = 0;
    public static final int CREIXENT = 1;
    public static final int DECREIXENT = 2;
    public static final int CREIXIDECRI = 3;
    public static final int DECRICREIXI = 4;
    
    public static void main (String [] args){
    
    System.out.println("Introduïu text. Enter per finalitzar.");
    String text = Entrada.readLine();
    
    while(!text.isEmpty()){
        
        String normalitzat = UtilString.normalitzaText(text);
        
        String paraula = "";    
        
        for(int i=0; i<normalitzat.length(); i++){
            char c = normalitzat.charAt(i);
            
            if (Character.isLetter(c)){
                paraula += c;
            }
            if (Character.isWhitespace(c)){
                mostraClassificacio(paraula, classifica (paraula));
                
                paraula = "";
                
                continue;
            }
        }
        
        if (!paraula.isEmpty()){
            mostraClassificacio(paraula, classifica(paraula));
        }
        
        
        text = Entrada.readLine();
    }
    }
    
    public static int classifica (String paraula){
        
        if (paraula.length()<3){
            return NO_VALIDA;
        }
        else{
            if (esCreixent (paraula)){
                return CREIXENT;
            }
            else if (esDecreixent (paraula)){
                return DECREIXENT;
            }
            else if (esCreixiDecri(paraula)){
                return CREIXIDECRI;
            }
            else if (esDecriCreixi(paraula)){
                return DECRICREIXI;
            }
            else{
                return NORMALETA;
            }
        }    
    }
    
    public static void mostraClassificacio(String paraula, int classificacio){
        String resultat = "";
        
        if (classificacio == NORMALETA){
            resultat = "normaleta";
        }
        else if (classificacio == CREIXENT){
            resultat = "creixent";
        }
        else if (classificacio == DECREIXENT){
            resultat = "decreixent";
        }
        else if (classificacio == CREIXIDECRI){
            resultat = "crixidecri";
        }
        else if (classificacio == DECRICREIXI){
            resultat = "decricreixi";
        }
        else{
            resultat = "no vàlida";
        }
        
        System.out.println("\"" + paraula + "\" és " + resultat);
    }
    
   public static boolean esCreixent(String text){
        boolean esCreixent = false;
    
        for (int i = 0; i < text.length() - 1; i++) { 
            char actual = text.charAt(i); 
            char posterior = text.charAt(i + 1); 
            
            if (posterior > actual) { 
                esCreixent = true; 
            }
        }
        return esCreixent;
    }

   public static boolean esDecreixent(String text){
        boolean esDecreixent = false;
        
        for (int i = 0; i < text.length() - 1; i++) { 
            char actual = text.charAt(i); 
            char posterior = text.charAt(i + 1); 
            
            if (posterior < actual) { 
                esDecreixent = true; 
            }
        }
        return esDecreixent;
    }

    public static boolean esCreixiDecri(String text){
        boolean esCreixiDecri = false;
    
        for (int i = 0; i < text.length() - 1; i++) { 
            char actual = text.charAt(i); 
            char posterior = text.charAt(i + 1); 
            
            if (esCreixent(text)){
                if(actual>posterior){
                    esCreixiDecri = true;
                }
            }
        }
        return esCreixiDecri;
    }

    public static boolean esDecriCreixi(String text){
        boolean esDecriCreixi = false;
    
        for (int i = 0; i < text.length() - 1; i++) { 
            char actual = text.charAt(i); 
            char posterior = text.charAt(i + 1); 
            
            if (esDecreixent(text)){
                if(actual<posterior){
                    esDecriCreixi = true;
                }
            }
        }
        return esDecriCreixi;
    }
}

/*
public static int classifica (String paraula){
        int posicio = 0;
        
        boolean canvi = false;
        
        if (paraula.length()<3){
            return NO_VALIDA;
        }
        else{
            for (int i=0; i<paraula.length()-1; i++){
                char actual = paraula.charAt(i);
                char posterior = paraula.charAt(i+1);
                
                if (actual<posterior){ //creixent

                    if (posicio == NORMALETA){
                        posicio = CREIXENT;
                    }
                    else if (posicio == DECREIXENT){
                        canvi = true;
                    }
                        
                }
                else if (actual>posterior){ //decreixent
                    if (posicio == NORMALETA){
                        posicio = DECREIXENT;
                    }
                    else if (posicio == CREIXENT){
                        canvi = true;
                    }
                }
            }
            
            if (posicio == CREIXENT && !canvi){
                return CREIXENT;
            }
            else if (posicio == CREIXENT && canvi){
                return CREIXIDECRI;
            }
            else if (posicio == DECREIXENT && !canvi){
                return DECREIXENT;
            }
            else if (posicio == DECREIXENT && canvi){
                return DECRICREIXI;
            }
            else{
                return NORMALETA;
            }
        }
    }
*/
