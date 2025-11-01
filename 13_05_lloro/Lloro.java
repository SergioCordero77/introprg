/*
 * Programa que repeteix les paraules o frases que es donen com si fos un lloro.
 * Quan el text passat eés un text en blanc o es possa un espai sense text, el programa finalitza.
 *
 */
public class Lloro {
    public static void main (String [] args) {
    
    System.out.println("El lloro espera:"); // Demanem que volem que repeteixi el lloro
    String lloro = Entrada.readLine();
    
    while (!lloro.isBlank()) {   // Mentre el text donat no estigui en blanc o sigui només un espai, el bucle funcionarà
    
    System.out.println("El lloro repeteix: " + lloro);  //Imprimim el mates que hem passat al principi 
    
    System.out.println("El lloro espera:"); //Tornem a preguntar per a que el bucle pogui continuar
    lloro = Entrada.readLine();
    }
    
    System.out.println("Adéu"); // si el text està buit el bucle acaba i el lloro s'acomiada
    
    }
}
