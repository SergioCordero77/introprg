/*
 * Programa que demana un text i mostra les lletres que conté. Cada lletra estarà separada per una coma en l'ordre en que apareix al text original. La resta de caràcters no es mostrarà.
 */
public class NomesLletres {
    public static void main (String [] args){
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        filtraLletres(text);
        
    }
        
    public static void filtraLletres(String text){
    
        String lletres = "";
        
        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if (Character.isLetter(c)){
                lletres += c;
            }
        }
        
        for (int i=0; i<lletres.length(); i++){
            char l = lletres.charAt(i);
            
            if (i == 0){
                System.out.print(l);    
            }
            else{
                System.out.print(", " + l);
            }
        }
        System.out.println();
    }
}
