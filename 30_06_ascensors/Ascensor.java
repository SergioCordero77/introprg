/*
 * Programa que determinara el número d'ascensors que hi s'hauràn de crear per línia de comandes.
 * Cada ascensor estarà en el pis indicat per la seva posició de l'array.
 */
public class Ascensor{
    int pis = 0;
    
    public static Ascensor[] creaAscensorsEnEscala(int quants){
        
        Ascensor[] arrayAscensor = new Ascensor [quants];
        
            for(int i=0; i<arrayAscensor.length; i++){
                Ascensor ascensor;
                arrayAscensor[i] = new Ascensor();
            }
            
        return arrayAscensor;
    }
    
    public static void main(String [] args){
        
        int quants = Integer.parseInt(args[0]);
        
        if (args.length == 0){
            System.out.println("Cal indicar un únic valor enter.");
        }
        else{
            Ascensor[] ascensors = creaAscensorsEnEscala(quants);
            for (int i=0; i<ascensors.length; i++){
                
                ascensors[i].pis = i;
                
                System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
            }
        }
    }
}
