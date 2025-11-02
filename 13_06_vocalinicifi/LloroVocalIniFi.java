/*
 * Programa que funciona igual que el programa del Lloro on es repeteix la cadena de text que li passes,
 * pero aquest cop només repetira les cadenes de text que comencin i acabin en vocal
 */
public class LloroVocalIniFi{
    public static void main (String [] args){
    
    System.out.println("Paraula?"); // Demanem que volem que repeteixi el lloro
    String lloro = Entrada.readLine();
    
    while (!lloro.isBlank()) {   // Mentre el text donat no estigui en blanc o sigui només un espai, el bucle funcionarà
    
    char inicial = lloro.charAt(0);
    char ultim = lloro.charAt(lloro.length()-1);
    
        if ((inicial == 'a' || inicial == 'e' || inicial == 'i' || inicial == 'o' || inicial == 'u' ||
            inicial == 'A' || inicial == 'E' || inicial == 'I' || inicial == 'O' || inicial == 'U') &&
            (ultim == 'a' || ultim == 'e' || ultim == 'i' || ultim == 'o' || ultim == 'u' ||
            ultim == 'A' || ultim == 'E' || ultim == 'I' || ultim == 'O' || ultim == 'U')) { //Fem un "if" dient la condició que voleme que es compleixi per a que el lloro repeteix la cadena de text
        System.out.println("Repeteix: " + lloro);  //Imprimim el mates que hem passat al principi 
        }
        else {
        }
        
    System.out.println("Paraula?"); //Tornem a preguntar per a que el bucle pogui continuar
    lloro = Entrada.readLine();
    }
    
    System.out.println("Adéu"); // si el text està buit el bucle acaba i el lloro s'acomiada
    
    }
}
