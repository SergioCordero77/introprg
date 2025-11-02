/*
 * Programa que funciona igual que el programa del text on es repeteix la cadena de text que li passes,
 * pero aquest cop només repetira les cadenes de text que tinguin permutats els dos primers caràcters i els dos últims.
 * El programa finalitza si passem una cadena de text buida.
 */
public class ExtremsPermutats{
    public static void main (String [] args){
    
    System.out.println("Ves introduïnt texts (finalitza amb INTRO sol)"); // Demanem que volem que repeteixi el text
    String text = Entrada.readLine();
    
    while (!text.isBlank()) {   // Mentre el text donat no estigui en blanc o sigui només un espai o sigui una cadena de text major que 2, el bucle funcionarà
    
    String textMajuscules = text.toUpperCase(); //Transformem el String en majúscules per a que tot sigui igual i qua faci la comparació entre majúscules i minúscules no ho detecti com a caràcters diferents
    
        if (text.length()==2 &&
            textMajuscules.charAt(0) == textMajuscules.charAt(text.length()-1)){
            
            System.out.println("Repeteix: " + text);  //Fem un "if" dient la condició que volem que es compleixi amb 2 caràcters per a que el text repeteix la cadena de text  
        }
        else if (text.length()==3 &&
                 textMajuscules.charAt(0) == textMajuscules.charAt(text.length()-1)){ //Fem un "if" dient la condició que volem que es compleixi amb 3 caràcters per a que el text repeteix la cadena de text
            
            System.out.println("Repeteix: " + text);  //Imprimim el mates que hem passat al principi 
        }
        else if (text.length()>=4 &&
           (textMajuscules.charAt(0) == textMajuscules.charAt(text.length()-2) || textMajuscules.charAt(0) == text.charAt(text.length()-1)) &&
           (textMajuscules.charAt(1) == textMajuscules.charAt(text.length()-2) || textMajuscules.charAt(1) == text.charAt(text.length()-1)) &&
           (textMajuscules.charAt(text.length()-2) == textMajuscules.charAt(0) || textMajuscules.charAt(text.length()-2) == textMajuscules.charAt(1)) &&
           (textMajuscules.charAt(text.length()-1) == textMajuscules.charAt(0) || textMajuscules.charAt(text.length()-1) == textMajuscules.charAt(1))) { //Fem un "if" dient la condició que volem que es compleixi amb 4 o més caràcters per a que el text repeteix la cadena de text
            
            System.out.println("Repeteix: " + text);  //Imprimim el mates que hem passat al principi 
        }
        else {
        }
    
    text = Entrada.readLine(); // Si la condició no es dona, tornem a donar l'entrada per a que el bucle pogui continuar
    }
    
    System.out.println("Adéu"); // si el text està buit el bucle acaba i el text s'acomiada
    
    }
}
