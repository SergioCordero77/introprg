/*
 * Programa que demana un text i mostra quantes vocals hi ha en aquest text.
 */
public class VocalsMajuscules{
    public static void main (String [] args){
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    numVocalsMinuscules(text);
    
    System.out.println(comptador);
    
    }
    
    public static int numVocalsMinuscules(String text){
        
        String textMinuscules = text.toLowerCase(text);
        int comptador = 0;
        
        if(UtilString.esVocal(textMinuscules)){
            comptador ++;
        }
        
        return comptador;
    }
}
