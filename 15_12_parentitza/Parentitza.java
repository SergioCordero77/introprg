/*
 * Programa que demana un text i motrarà cada lletra entre parentesis. Els altres no tindràn canvis.
 */
public class Parentitza {
    public static void main (String [] args){
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        parentitza(text);
        
    }
        
    public static void parentitza(String text){
        for (int i=0; i<text.length(); i++){
        
            char c = text.charAt(i);
        
            if (Character.isLetter(c)){
                System.out.print("("+c+")");
            }
            else{
                System.out.print(c);
            }
        }
        System.out.println(); 
    }
}
