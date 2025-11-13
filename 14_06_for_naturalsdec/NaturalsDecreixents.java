/*
 * Programa que demana un valor per línia de comandes i aquest valor determinarà el nombre de valors que s'imprimiran de forma descendent fins arrivar a 1. Es a dir, si passem per línia de comandes el valor 10, s'imprimirà el 10, el 9, el 8... així fins arrivar a 1. El programa es desenvolupa mitjançant for.
 */
public class NaturalsDecreixents{
    public static void main (String [] args){
    
        for (int numeroInici = Integer.parseInt(args[0]);                // Variable de recorregut
            1 <= numeroInici;                                            // Condició
            numeroInici --){                                             // Passa al número següent descendent
            System.out.println(numeroInici);
        }
        
        if (numeroInici < 1){
        System.out.println("Cap valor decreixent entre " + numeroInici + " i 1");
    }
    }
}
