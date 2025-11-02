/*
 * Programa que funciona igual que el programa del text on es repeteix la cadena de text que li passes,
 * pero aquest cop només repetira les cadenes de text que tinguin permutats els dos primers caràcters i els dos últims.
 * El programa finalitza si passem una cadena de text buida.
 */
public class ExtremsPermutats{
    public static void main (String [] args){
    
    System.out.println("Ves introduïnt texts (finalitza amb INTRO sol)"); // Demanem que volem que repeteixi el text
    String text = Entrada.readLine();
    
    while (!text.isBlank() || text.length()>2) {   // Mentre el text donat no estigui en blanc o sigui només un espai, el bucle funcionarà
    
    char c0 = text.charAt(0);
    char c1 = text.charAt(1);
    char c2 = text.charAt(text.length()-2);
    char c3 = text.charAt(text.length()-1);
    
        if ((c0 == c2 || c0 == c3) &&
            (c1 == c2 || c1 == c3) &&
            (c2 == c0 || c2 == c1) &&
            (c3 == c0 || c3 == c1)) { //Fem un "if" dient la condició que voleme que es compleixi per a que el text repeteix la cadena de text
            System.out.println("Repeteix: " + text);  //Imprimim el mates que hem passat al principi 
        }
        else {
        }
    
    text = Entrada.readLine(); // Si la condició no es dona, tornem a donar l'entrada per a que el bucle pogui continuar
    }
    
    System.out.println("Adéu"); // si el text està buit el bucle acaba i el text s'acomiada
    
    }
}
