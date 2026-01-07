/*
 * Programa que crearà un triangle de paraules. Le paraules seràn cadenes de caràcters separats per un espai en blanc.
 
 Simulació:
 
 Text?
 Du hast mich
 Du
 Du hast
 Du hast mich
 
 */
public class TriangleParaules{
    public static void main (String [] args){
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    mostraTriangle(text);
    
    }
    public static void mostraTriangle(String text){
        
        int contador = 0;
        boolean paraula = false;
        
        //comptem quantes paraules hi ha per saber quantes iteracions hem de fer
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if (!Character.isWhitespace(c) && !paraula){
                paraula = true;
                contador ++;
            }
            else if (Character.isWhitespace(c)){
                paraula = false;
            }
        }
        
        //formació el triangle
        for(int i=0; i<contador; i++){
            for(int j=0; j<text.length(); j++){
                char c = text.charAt(j);
                
                System.out.print(c);
            }
            System.out.println();
        }
    }
} 
