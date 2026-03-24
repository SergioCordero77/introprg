/*
 * Programa que modifica el pis i el moviment d'un ascensor.

el pis sempre sigui un valor entre -1 i 10.

el moviment sempre sigui un dels següents valors: aturat, pujant, baixant.

Inicialment, l'ascensor començarà a la planta -1 i aturat.
 */
public class UsaAscensor {
    /* XXX */
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        
        int pis;
        String moviment;
    
        if (UtilString.esEnter(args[0]) && 
            args.length<0 &&
            !args[0].isBlank()){
            pis = Integer.parseInt(args[0]);
        }
        else{
            pis = ascensor.getPis();
        }
        
        if (UtilString.esEnter(args[1]) && 
            args.length<1 &&
            !args[1].isBlank()){
            moviment = args[1];
        }
        else{
            moviment = ascensor.getMoviment();
        }
        
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        ascensor.setPis(pis);
        ascensor.setMoviment(moviment);
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }
}
