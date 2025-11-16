/*
 * El programa començarà demanant un "àncora" que serà el valor de referencia per saber quin serà el valor més próxim.
 Tant l'àncora com els valors introduits han de ser enters positius. Si l'àncora té un número negatiu el programa finalitzarà. 
 El programa anirà demanant números fins que es doni un número negatiu. Això farà que s'aturi el programa i donarà el resultat, el valor més proper a l'àncora. En cas que hi hagi dos o més valors que estiguin a la mateixa distància, el programa es quedarà amb el valor més petit, per exemple:
 - Àncora = 32
 - Valors donats = 31 i 33
 Els dos valors estàn a la mateixa distancia (diferencia de 1). En aquest cas el programa es quedaría amb el 31.
 */
public class TrobaMesProxim{
    public static void main (String [] args){
    
    //Introduïm àncora
    System.out.println("Introdueix l'àncora");
    int ancora = Integer.parseInt(Entrada.readLine());
    
    
    if (ancora < 0) { // si té un valor negatiu, acaba el programa
        System.out.println("Àncora no vàlida");
    }
    else { // si té un valor possitiu, el programa pot començar
        //Introduïm el primer valor
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
          
            if (valor<0){ // si té un valor negatiu, acaba el programa
                System.out.println("No s'ha introduït cap valor positiu");
            }
            else{ // Si el valor es possitiu, pot començar el bucle
               
                int valorProx = valor; //Tranformem el valor en valorProx
            
                while (valor>=0){ // Mentre el valor sigui positiu, el bucle funcionarà
                   
                    if(Math.abs (valor - ancora) < Math.abs (valorProx - ancora)) { // Comparem les distancies
                        valorProx = valor;
                    }
                    else if((Math.abs (valor - ancora) == Math.abs (valorProx - ancora))) { // Mirem si les dos distancies són iguals
                        if (valor<valorProx){ 
                            valorProx = valor;
                        }
                    }
                        
                    System.out.println("Introdueix un valor"); // Tornem a demanar el valor per continuar amb el bucle
                    valor = Integer.parseInt(Entrada.readLine());
                }       
                
                    // RESULTATS FINALS
                        System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorProx);
            }
    }       
    }
}
