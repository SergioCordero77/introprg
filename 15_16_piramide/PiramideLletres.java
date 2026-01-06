/*
 * Programa que demana un text per args[0] i dibuixa una piràmide amb les seves lletres. Les lletres estàn separades per punts:
 
 Simulació:
 
 Text?
 Renat
 
 .........R.........
 .......R.e.R.......
 .....R.e.n.e.R.....
 ...R.e.n.a.n.e.R...
 .R.e.n.a.t.a.n.e.R.
 */
public class PiramideLletres{
    public static void main (String [] args) {
    
    String text = args[0];
        
        piramitza(text);
    }
    
    public static void piramitza(String text){
    
        int valorEsquerra = 0;
        
        for (int i=text.length(); i>0; i--){
            valorEsquerra++;
            //triangle de punts
            for(int j=i*2-1; j>0; j--){
                System.out.print(".");
            }
            //triangle de text esquerre     
            for(int k=0; k<valorEsquerra; k++){
                char c = text.charAt(k);
                
                System.out.print(c + ".");
            }
            //triangle de text dreta     
            for(int l=valorEsquerra-2; l>=0; l--){
                char c = text.charAt(l);
                
                System.out.print(c + ".");
            }
            //triangle de punts
            for(int j=i*2-2; j>0; j--){
                System.out.print(".");
            }
            System.out.println();
        }
    } 
}
