/*
 * Programa que implementa un ascensor que puja un pis.
 */
public class Ascensor{
    int pis = -1;
    
    public static void puja(Ascensor ascensor){
        ascensor.pis=0;
    }
    
    public static void main (String [] args){
        Ascensor ascensor;
        ascensor = new Ascensor();
        
        System.out.println("L'ascensor inicialment està a la planta " + ascensor.pis);
        puja(ascensor);
        System.out.println("L'ascensor finalment està a la planta " + ascensor.pis);
    }
}
