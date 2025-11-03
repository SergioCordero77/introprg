/*
 * Programa que demana les notes que han obtingut els alumnes de la classe.
 * El programa anirà demanant notes. Un cop rebi un valor negatiu, deixarà de demanar més notes i mostrarà el valor màxim intoduït fins el moment, el valor mínim i la mitjana.
 */
public class Estadistiques {
    public static void main (String [] args){
    
    // Declarem la variable de les notes
    
    int suma = 0;   // Declarem la variable suma amb valor 0 per començar la suma després
    
    int numEntrades = 0;    // Declarem la variable per saber el número de entrades que hi haurà per després sumar poder fer la mitjana. la inicialitzem amb valor 0.
    
    int maxim = 0; // Declarem la variable maxim i l'inicialitzem amb valor 0. Servirà per trobar el valor màxim
     
    System.out.println("Introdueix un valor"); 
    int notes = Integer.parseInt(Entrada.readLine()); //Introduïm ja el primer valor per saber si entra dins del rang o no. Si no entra ja no inicialitzem el bucle)
    
    int minim = notes; // Declarem la variable mínim per al primer valor introduït, l'agafarem de rederencia pero trobar el mínim
    
    if (notes>=0){
        while (notes >= 0){ // Mentres el valor introduït sigui més gran que 0, el bucle funcionarà
            
            suma = suma + notes; //Iniciem la suma amb el valor donat
            
            numEntrades = numEntrades + 1; // Cada vegada que la suma rebi un valor positiu el contador de número d'entrades suma +1
            
            if (notes > maxim){
                maxim = notes;
            }
            
            if (notes < minim) {
                minim = notes;
            }
            
            System.out.println ("Introdueix un valor"); // Tornem a preguntar per la nota per seguir amb el bucle
            notes = Integer.parseInt (Entrada.readLine());
            
        } // Tanquem while
            System.out.println("La mínim és: " + minim); // resultat número mínim
            System.out.println("La mitjana és: " + suma / numEntrades); // resultat mitjana
            System.out.println("El màxim és: " + maxim); // resultat número màxim
    } // Tanquem if      
    else{
        System.out.println("Cap valor vàlid introduït");
    }
    }
}
