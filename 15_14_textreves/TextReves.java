/*
 * Programa que demana un text i el motrarà, però invertint l'ordre dels caràcters que el composen. Els caràcters apareixeran separats per una coma.
 
 Simulació:
 
 Text?
 Es gibt keinen Weg zurück
 k, c, ü, r, u, z,  , g, e, W,  , n, e, n, i, e, k,  , t, b, i, g,  , s, E
 
 */
public class TextReves {
    public static void main (String [] args){
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        mostraReves(text);
        
    }
        
    public static void mostraReves(String text){
        for (int i=text.length()-1; i>=0; i--){
        
            char c = text.charAt(i);
        
            if (i==0){
                System.out.print(c);
            }
            else{
                System.out.print(c + ", ");
            }
        }
        System.out.println(); 
    }
}
