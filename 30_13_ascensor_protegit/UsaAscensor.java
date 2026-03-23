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
        
        if(args.length != 2){
            return;
        }
        else{
            int pis = ascensor.getPis();
        
            if (args[0].equals("-1") || 
                args[0].equals("0") ||
                args[0].equals("1") ||
                args[0].equals("2") ||
                args[0].equals("3") ||
                args[0].equals("4") ||
                args[0].equals("5") ||
                args[0].equals("6") ||
                args[0].equals("7") ||
                args[0].equals("8") ||
                args[0].equals("9") ||
                args[0].equals("10")){
                pis = Integer.parseInt(args[0]);
            }
            
            String moviment = args[1];
            
            System.out.println("Pis inicial: " + ascensor.getPis());
            System.out.println("Moviment inicial: " + ascensor.getMoviment());
            ascensor.setPis(pis);
            ascensor.setMoviment(moviment);
            System.out.println("Pis final: " + ascensor.getPis());
            System.out.println("Moviment final: " + ascensor.getMoviment());
        }
    }
}
