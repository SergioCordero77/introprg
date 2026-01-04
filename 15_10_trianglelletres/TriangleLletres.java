/*
 * Programa que demana un text i dibuixa un triangle amb les lletres del text.
 Simulació:
 
 Text?
 Nemesio
 N
 N, e
 N, e, m
 N, e, m, e
 N, e, m, e, s
 N, e, m, e, s, i
 N, e, m, e, s, i, o
 
 La signatura dels mòduls serà:
 
 public static void dibuixaTriangle(String text)
 public static void dibuixaLinia(String text, int linia)
 */
public class TriangleLletres{
    public static void main (String [] args) {
    
    System.out.println("Text?");
    String text = Entrada.readLine();
        
        dibuixaTriangle(text);
    }
    
    public static void dibuixaTriangle(String text){
        
        int linia = 0;
        
        for (int i=0; i<text.length(); i++){
            
            linia ++;
                
            dibuixaLinia(text, linia);
        }
    }
    
    public static void dibuixaLinia(String text, int linia){
        for (int i=0; i<linia; i++){
            char c = text.charAt(i);
            
            if (i == linia - 1){    
                System.out.print(c);
            }
            else{
                System.out.print(c + ", ");
            }
        }
        System.out.println();
    }       
}
