/*
 * Programa que funciona igual que el programa del Lloro on es repeteix la cadena de text que li passes,
 * pero aquest cop només repetira les cadenes de text que comencin i acabin en vocal
 */
public class LloroVocalIniFi{
    public static void main (String [] args){
    
    System.out.println("Paraula?"); // Demanem que volem que repeteixi el lloro
    String lloro = Entrada.readLine();
    
    while (!lloro.isBlank()) {   // Mentre el text donat no estigui en blanc o sigui només un espai, el bucle funcionarà
    
    char inicial0 = lloro.charAt(0);
    char ultim0 = lloro.charAt(lloro.length()-1);
    
    char inicial = Character.toLowerCase (inicial0);
    char ultim = Character.toLowerCase (ultim0);

        if ((inicial == 'a' && ultim == 'a') || 
            (inicial == 'e' && ultim == 'e') || 
            (inicial == 'i' && ultim == 'i') || 
            (inicial == 'o' && ultim == 'o') || 
            (inicial == 'u' && ultim == 'u')) { //Fem un "if" dient la condició que volem que es compleixi per a que el lloro repeteix la cadena de text
            System.out.println("Repeteixo: " + lloro);  //Imprimim el mates que hem passat al principi 
        }
        else {
        }
    
    System.out.println("Paraula?"); // Si la condició no es dona, tornem a preguntar per a que el bucle pogui continuar
    lloro = Entrada.readLine();
    
    }
    
    System.out.println("Adéu"); // si el text està buit el bucle acaba i el lloro s'acomiada
    
    }
}
