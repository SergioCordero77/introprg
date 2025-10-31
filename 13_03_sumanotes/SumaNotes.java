/*
 * Programa que demana les notes que han obtingut els alumnes de la classe.
 * El programa anirà demanant notes mentre les que rebi siguin valors entre el 0 i el 100 (ambdós inclosos). Un cop rebi un valor fora del rang, deixarà de demanar més i mostrarà el valor resultant.
 */
public class SumaNotes {
    public static void main (String [] args){
    
    // Declarem la variable de les notes
    int notes = 0;
    
    // Declarem la variable suma amb valor 0 per començar la suma després
    int suma = 0;
    
    while (notes >= 0 && notes <= 100){
        System.out.println ("Introdueix una nota:");
        notes = Integer.parseInt (Entrada.readLine());
        suma = suma + notes;
        
    } // Tanquem bucle while
        System.out.println("La suma de les notes vàlides és " + suma);
    }
}
