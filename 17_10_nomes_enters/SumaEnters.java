/*
 * programa que a partir dels arguments que rebi per línia de comandes, mostri el resultat de sumar els enters que rebi.
 */
public class SumaEnters {
    public static void main (String [] args){
    
        if (args.length == 0) {
                System.out.println("Cap argument");
        }
        else{
            
            quantsEnters(args);
            
            System.out.println(sumaEnters(filtraEnters (args)));
        
           /* int suma = 0;
        
            for (int i=0; i<args.length; i++){
                String argument = args [i];
                
                if (UtilString.esEnter(argument)){
                    
                    int numero = Integer.parseInt(argument);
                    
                    suma += numero; 
                }
                else{
                    System.out.println("[" + i + "] \"" + argument + "\": no és enter"); 
                }
            }
            System.out.println("Els enters sumen: " + suma);
        }*/
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

