/*
 * Programa que demana les notes que han obtingut els alumnes de la classe.
 * El programa anirà demanant notes mentre les que rebi siguin valors entre el 0 i el 100 (ambdós inclosos). Un cop rebi un valor fora del rang, deixarà de demanar més i mostrarà el valor resultant.
 */
public class SumaNotes {
    public static void main (String [] args){
    
    // Declarem la variable de les notes
    
    int suma = 0;   // Declarem la variable suma amb valor 0 per començar la suma després
    
    
    System.out.println("Introdueix una nota"); 
    int notes = Integer.parseInt(Entrada.readLine()); //Introduïm ja el primer valor per saber si entra dins del rang o no. Si no entra ja no inicialitzem el bucle)
    
    while (notes >= 0 && notes <= 100){
        if (notes >= 0 && notes <= 100){
        
        suma = suma + notes; //Iniciem la suma amb el valor donat
        
        System.out.println ("Introdueix una nota"); // Tornem a preguntar per la nota per seguir amb el bucle
        notes = Integer.parseInt (Entrada.readLine());
        
        } // Tanquem if
      
    } // Tanquem bucle while
        System.out.println("La suma de les notes vàlides és " + suma); // resultat final
    }
}
