/*
 * Programa que demana un text i mostra totes les lletres en minúscules excepte les vocals que hauràn de ser majúscules.
 */
public class VocalsMajuscules{
    public static void main (String [] args){
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    mostraText(text);
    
    }
    
    public static void mostraText(String text){
        
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if (UtilString.esVocal(c)){
                majusculitzaVocal(c);
            }
            else{
                System.out.print(c);
            }
        }
        System.out.println();
    }
    
    public static void majusculitzaVocal(char vocal){
        char vocalMaj=Character.toUpperCase(vocal);
        System.out.print(vocalMaj);
    }
}
