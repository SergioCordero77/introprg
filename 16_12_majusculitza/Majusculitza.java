/*
 * Programa que demana un text i mostra el mateix text, però ara les inicials de cada paraula seran majúscules i la resta minúscules.
 */
public class Majusculitza{
    public static void main (String [] args){
    
        System.out.println("Text?");
        String text = Entrada.readLine();
    
        System.out.println(majusculitza(text));    
    }
        
    public static String majusculitza(String text){
    
        String textFinal = "";
        
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
               
           /* if(text.length() == 1){
                if(Character.isLetter(c)){
                    char cMaj = Character.toUpperCase(c);
                    
                    textFinal += cMaj;
                }
            }
            else{*/
                if(i==0){
                    if(Character.isLetter(c)){
                        char cMaj = Character.toUpperCase(c);
                    
                        textFinal += cMaj;
                    }
                    else{
                        textFinal += c;
                    }
                }
                if(i>0){
                    char cAnt = text.charAt(i-1);
                    char cMaj = Character.toUpperCase(c);
                    
                    if(!Character.isLetter(cAnt) && Character.isLetter(c)){
                                            
                        textFinal += cMaj;
                    }
                    else{
                        char cMin = Character.toLowerCase(c);
                        
                        textFinal += cMin;
                    }
                }
            /*}*/
        }
        return textFinal;
    }
}
