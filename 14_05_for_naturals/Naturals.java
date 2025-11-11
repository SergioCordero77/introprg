/* 
 *Programa que imprimeix des del 1 tants número com el valor que s'introdueix per línia de comandes. És a dir, si passem el valor 10, el programa imprimira el 1, el 2, el 3... fins arrivar al 10. El programa es fa mitjançant for.
 */
public class Naturals{
    public static void main (String [] args){
    
    int numeroFi = Integer.parseInt(args[0]);
    
    for (int numero = 1;
         numero <= numeroFi;
         numero ++) {
            System.out.println(numero);
        }
    }
}
