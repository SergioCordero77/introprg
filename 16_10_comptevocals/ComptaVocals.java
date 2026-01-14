/*
 * Programa que demana un text i mostra quantes vocals hi ha en aquest text.
 */
public class ComptaVocals{
    public static void main (String [] args){
    
    System.out.println("Text?");
    String text = Entrada.readLine();
      
    int numVocals = numVocalsMinuscules(text);
    
    System.out.println(numVocals);
    
    }
    
    public static int numVocalsMinuscules(String text){
        
        String textMinuscules = text.toLowerCase();
        
        int comptador = 0;
        
        for(int i=0; i<textMinuscules.length(); i++){
            char c = textMinuscules.charAt(i);
            
            if(UtilString.esVocal(c)){
                comptador ++;
            }
        }
        
        return comptador;
    }
}
