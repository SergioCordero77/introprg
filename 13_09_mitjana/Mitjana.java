/*
 * Programa que demana les notes que han obtingut els alumnes de la classe.
 * El programa anirà demanant notes. Un cop rebi un valor negatiu, deixarà de demanar més notes i mostrarà el valor de la mitjana de totes les notes introduïdes fin el moment.
 */
public class Mitjana {
    public static void main (String [] args){
    
    // Declarem la variable de les notes
    
    int suma = 0;   // Declarem la variable suma amb valor 0 per començar la suma després
    
    int numEntrades = 0;
     
    System.out.println("Introdueix una nota"); 
    int notes = Integer.parseInt(Entrada.readLine()); //Introduïm ja el primer valor per saber si entra dins del rang o no. Si no entra ja no inicialitzem el bucle)
    
    if (notes>=0){
        while (notes >= 0){
            
            suma = suma + notes; //Iniciem la suma amb el valor donat
            
                if (suma >= 0){
                    numEntrades = numEntrades + 1;
                }
            
            System.out.println ("Introdueix una nota"); // Tornem a preguntar per la nota per seguir amb el bucle
            notes = Integer.parseInt (Entrada.readLine());
            
        } // Tanquem while
            System.out.println("La suma de les notes vàlides és " + suma / numEntrades); // resultat final
    } // Tanquem if      
    else{
        System.out.println("Cap nota vàlida introduïda");
    }
    }
}
