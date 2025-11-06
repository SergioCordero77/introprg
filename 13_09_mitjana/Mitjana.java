/*
 * Programa que demana les notes que han obtingut els alumnes de la classe.
 * El programa anirà demanant notes. Un cop rebi un valor negatiu, deixarà de demanar més notes i mostrarà el valor de la mitjana de totes les notes introduïdes fin el moment.
 */
public class Mitjana {
    public static void main (String [] args){
    
    // Declarem la variable de les notes
    
    int suma = 0;   // Declarem la variable suma amb valor 0 per començar la suma després
    
    int numEntrades = 0; //Declarem la variable de número d'entrades que ens servirá per anar sumant y al final fer la mitja
    
    System.out.println ("Introdueix un valor");
    int notes = Integer.parseInt(Entrada.readLine());
    
    if (notes>=0 && notes<=100) {
        while (notes >= 0 && notes<=100){ // Mentres el valor introduït sigui més gran que 0 i més que que 100, el bucle funcionarà
            
            suma = suma + notes; //Iniciem la suma amb el valor donat
            
            numEntrades ++; // Cada vegada que la suma rebi un valor positiu el contador de número d'entrades suma +1
            
            System.out.println ("Introdueix un valor"); // Tornem a preguntar per la nota per seguir amb el bucle
            notes = Integer.parseInt (Entrada.readLine());
            
        } // Tanquem while
        
            double sumaTotal = suma; // passem el valor de la suma a double per després utilitzar-la a l'equació de la mitjana
            double mitjana = sumaTotal / numEntrades; // equació de la mitjana amb double
            
            System.out.println("La mitjana de les notes vàlides és " + mitjana); // resultat final
    } // Tanquem if
    else {
        System.out.println("Cap nota vàlida introduïda");
    }
    }
}
