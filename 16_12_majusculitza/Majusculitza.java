/*
 * Programa que demana un text i mostra el mateix text, però ara les inicials de cada paraula seran majúscules i la resta minúscules.
 */
public class Majusculitza{
    public static void main (String [] args){
    
        System.out.println("Text?");
        String text = Entrada.readLine;
        
        String textFinal = "";
        
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            char cAnt = text.charAt(i-1);
        
            if(text.length() == 1){
                if(Character.isLetter(c)){
                    cMaj = Character.toUpperCase(c);
                    
                    textFinal += cMaj;
                }
            }
            else{
                if(!Character.isLetter(cAnt) && Character.isLetter(c)){
                    cMaj = Character.toUpperCase(c);
                    
                    textFinal += cMaj;
                }
                else{
                    cMin = Character.toLowerCase(c);
                    
                    textFinal += cMin;
                }
            }
        }
        System.out.prin
    }
}
