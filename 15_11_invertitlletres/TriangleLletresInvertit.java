/*
 * Programa que demana un text i dibuixa un triangle invertit amb les lletres del text.
 Simulació:
 
 Text?
 Nemesio
 Text?
 Romualda
 a, d, l, a, u, m, o, R
 d, l, a, u, m, o, R
 l, a, u, m, o, R
 a, u, m, o, R
 u, m, o, R
 m, o, R
 o, R
 R
 
 La signatura dels mòduls serà:
 
 public static void dibuixaTriangle(String text)
 public static void dibuixaLinia(String text, int linia)
 */
public class TriangleLletresInvertit{
    public static void main (String [] args) {
    
    System.out.println("Text?");
    String text = Entrada.readLine();
        
        dibuixaTriangleInvertit(text);
    }
    
    public static void dibuixaTriangleInvertit(String text){
        
        int linia = text.length();
        
        for (int i=0; i<text.length(); i++){
            
            linia --;
            
            dibuixaLiniaInvertida(text, linia);    
        }
    }
    
    public static void dibuixaLiniaInvertida (String text, int linia){
        for (int i=linia; i>=0; i--){
            char c = text.charAt(i);
            
            if (i == 0){    
                System.out.print(c);
            }
            else{
                System.out.print(c + ", ");
            }
        }
        System.out.println();
    }       
}
