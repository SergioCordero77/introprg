/*
 * Programa que a partir dels arguments que rebi per línia de comandes, mostri el resultat de sumar els enters que rebi.
 */
public class SumaEnters {
    public static void main (String [] args){
    
        if (args.length == 0) {
                System.out.println("Cap argument");
        }
        else{
            
            quantsEnters(args);
            
            System.out.println(sumaEnters(filtraEnters (args)));
        }
    }
    public static int quantsEnters(String[] valors){    // nombre d'enters a valors
        
        int cont = 0;
        
        for (int i=0; i<valors.length; i++){
            String argument = valors [i];
            
            if (UtilString.esEnter(argument)){
                cont ++;
            }
        }
        
        return cont;
    }
    
    public static int[] filtraEnters(String[] valors){   // enters que hi ha a valors
        
        int[] enters;
        enters = new int [SumaEnters.quantsEnters(valors)];
        
        int contArray = 0;
        
        for (int i=0; i<valors.length; i++){
            String argument = valors [i];
            
            if (UtilString.esEnter(argument)){
                
                enters [contArray] = Integer.parseInt (argument);
            
                contArray ++; 
            }
            
        }
        
        return enters;
    }
    
    public static int sumaEnters(int[] valors){           // suma dels valors
        
        int suma = 0; 
        
        for (int i=0; i<valors.length; i++){
            int enter = valors [i];
            
            suma += enter;
        }
        
        return suma;
    }
              
}

