/*
 * Programa que demana un valor per línia de comandes i aquest valor determinarà el nombre de valors que s'imprimiran de forma descendent fins arrivar a 1. Es a dir, si passem per línia de comandes el valor 10, s'imprimirà el 10, el 9, el 8... així fins arrivar a 1.
 */
public class NaturalsDecreixents{
    public static void main (String [] args){
    
    int numeroInici = Integer.parseInt(args[0]);
    
    int numero = 1;
    
    if (numeroInici < 0){
        System.out.println("Cap valor decreixent entre -1 i " + numeroInici);
    }
    else{
        while (numero <= numeroInici){
            System.out.println(numeroInici);
            numeroInici --;
        }
    }
    }
}
