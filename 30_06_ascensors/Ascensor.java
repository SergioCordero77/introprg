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
        
        System.out.println("Quants ascensors?");
        int quants = Integer.parseInt(Entrada.readLine());
        
        Ascensor[] ascensors = creaAscensorsEnEscala(quants);
        for (int i=0; i<ascensors.length; i++){
            System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
        }
    }
}
