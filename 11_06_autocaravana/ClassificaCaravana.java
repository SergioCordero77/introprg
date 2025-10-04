/*
 * Programa per calssificar en catogories les caravanes
 * segons el seu preu.
 *
 */
public class ClassificaCaravana {
    public static void main (String[] args) {
    int numero = Integer.parseInt(args[0]);
    
        if (numero<=50000) {
            System.out.println ("Econòmica"); 
        }
        else if (numero<=175000) {
            System.out.println ("General"); 
        }
        else {
            System.out.println ("Luxe"); 
        }
    }
}
