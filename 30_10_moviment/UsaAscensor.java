/*
 * Programa que accedeix a la classe Ascensor i indica:
    - El pis inicial d'Ascensor.
    - El moviment inicial d'Ascensor.
    - El moviment final d'Ascensor.
 */
public class UsaAscensor{
    public static void main (String [] args){
        Ascensor ascensor = new Ascensor();
        
        System.out.println("Pis inicial: " + ascensor.pis);
        System.out.println("Moviment inicial: " + ascensor.moviment);
         
        ascensor.moviment = "pujant"; 
         
        System.out.println("Moviment final: " + ascensor.moviment);
    }
}
