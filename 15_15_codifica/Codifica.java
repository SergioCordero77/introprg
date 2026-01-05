/*
 * Programa que demana un text i el codificarà.
 - Només codificarem les lletres entre la a i la z minúscules de l'alfabet llatí. La resta d'elements que apareguin al text, es mantindran iguals.
 - Cada lletra serà reemplaçada per la següent en l'ordre alfabètic, excepte la z, que serà substituïda per la a.
 
 Simulació:
 
 Text?
 Cada lletra que trobem a un string té un codi, un nombre positiu.
 Cbeb mmfusb rvf uspcfn b vo tusjoh ué vo dpej, vo opncsf qptjujv.
 
 */
public class Codifica {
    public static void main (String [] args){
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        mostraCodificat(text);
        
    }
        
    public static void mostraCodificat(String text){
        for (int i=0; i<text.length(); i++){
        
            char c = text.charAt(i);
        
            if (c >= 'a' && c <= 'z'){
                if (c>'z'){
                    c='a';
                }
                
                c++; 
            }
            System.out.print(c);
        }
        System.out.println(); 
    }
}
