/*
 * Programa que demana un text i mostra totes les lletre en minúscules excepte les vocals que es transformaran en majúscules.
 */
public class VocalsMajuscules{
    public static void main (String [] args){
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    String textFinal = majusculitzaVocals(text);
    
    System.out.println(textFinal);
    
    }
    
    public static String majusculitzaVocals(String text){
        
        String textFinal = "";
        
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if (UtilString.esVocal(c)){
                char vocalMaj=Character.toUpperCase(c);
                textFinal = textFinal + vocalMaj;
            }
            else{
                textFinal = textFinal + c;
            }    
        }
        return textFinal;   
    }
}
