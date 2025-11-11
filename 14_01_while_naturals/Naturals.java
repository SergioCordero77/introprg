/* 
 *Programa que imprimeix des del 1 tants número com el valor que s'introdueix per línia de comandes. El programa es fa mitjançant while.
 */
public class Naturals{
    public static void main (String [] args){
    
    int numeroFi = Integer.parseInt(args[0]);
    
    int numero = 1;
    
    if (numeroFi < 1){
        System.out.println("Cap valor creixent entre 1 i " + numeroFi);
    }
    else{
        while (numero <= numeroFi){
            System.out.println(numero);
            numero ++;
        }
    }
    }
}
