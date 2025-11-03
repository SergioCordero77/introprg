/*
 * Programa que demana les notes que han obtingut els alumnes de la classe.
 * El programa anirà demanant notes. Un cop rebi un valor negatiu, deixarà de demanar més notes i mostrarà el valor màxim intoduït fins el moment, el valor mínim i la mitjana.
 */
public class Estadistiques {
    public static void main (String [] args){
    
    // Declarem la variable de les notes
    
    int suma = 0;   // Declarem la variable suma amb valor 0 per començar la suma després
    
    int numEntrades = 0;
     
    System.out.println("Introdueix un valor"); 
    int notes = Integer.parseInt(Entrada.readLine()); //Introduïm ja el primer valor per saber si entra dins del rang o no. Si no entra ja no inicialitzem el bucle)
    
    if (notes>=0){
        while (notes >= 0){ // Mentres el valor introduït sigui més gran que 0, el bucle funcionarà
            
            suma = suma + notes; //Iniciem la suma amb el valor donat
            
                
                    numEntrades = numEntrades + 1; // Cada vegada que la suma rebi un valor positiu el contador de número d'entrades suma +1
                
            
            System.out.println ("Introdueix un valor"); // Tornem a preguntar per la nota per seguir amb el bucle
            notes = Integer.parseInt (Entrada.readLine());
            
        } // Tanquem while
            System.out.println("La suma de les notes vàlides és " + suma / numEntrades); // resultat final
    } // Tanquem if      
    else{
        System.out.println("Cap nota vàlida introduïda");
    }
    }
}
