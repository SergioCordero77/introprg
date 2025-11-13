/*
 * Programa que demana un valor per línia de comandes i aquest valor determinarà el nombre de valors que s'imprimiran de forma ascendent i només imprimirà valors parells seran valors parells.
 */
public class NaturalsParells {
    public static void main (String [] args){
    
    int numeroFi = Integer.parseInt(args[0]);
    int numero = 2;
    
    if (numeroFi < 2){
        System.out.println("Cap valor parell entre 1 i " + numeroFi);
    }
    else{
        while (numero <= numeroFi){
            System.out.println(numero);
            numero = numero + 2;
        }
    }
    }
}
