/*
 * Implementació d'un ascensor que marca la posició on es troba(es troba a la planta -1).
 */
public class Ascensor{
    int pis = -1;
    
    public static void main (String [] args){
        Ascensor ascensor;  //declaració de la referència a l'Ascensor
        ascensor = new Ascensor();    //creem la instància de l'Ascensor (ara 'ascensor' apunta a 'class Ascensor')
        
        System.out.println("L'ascensor està a la planta " + ascensor.pis);
    }
}
