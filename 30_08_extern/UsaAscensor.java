/*
 * Programa que accedeix a la classe Ascensor d'un altre programa i 
 * mostra on es troba l'ascensor.
 */
public class UsaAscensor{
    public static void main(String [] args){
        Ascensor ascensor = new Ascensor();
        
        System.out.println("L'ascensor creat des de fora està al pis " + ascensor.pis);
    }
}
