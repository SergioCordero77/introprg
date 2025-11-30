/*
 * El programa demanarà un text i el programa possarà cada lletra entre parentesis. Els altres no tindràn canvis.
 */
public class Parentitza {
    public static void main (String [] args){
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        for (int posicio=0; posicio<text.length(); posicio++){
            if (Character.isLetter(text.charAt(posicio))){
                System.out.print("("+text.charAt(posicio)+")");
            }
            else{
                System.out.print(text.charAt(posicio));
            }
        } 
        
    }
}
