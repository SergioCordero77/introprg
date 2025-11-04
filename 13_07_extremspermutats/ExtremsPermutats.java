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
    
        String textMajuscules = text.toLowerCase(); //Transformem el String en majúscules per a que tot sigui igual i qua faci la comparació entre majúscules i minúscules no ho detecti com a caràcters diferents
    
        if (textMajuscules.length()==2){
            char c0 = textMajuscules.charAt(0);
            char c3 = textMajuscules.charAt(text.length()-1);
            if ((c0 == c3 || c3 == c0) &&
                Character.isLetter(c0) &&
                Character.isLetter(c3)) {
                
                System.out.println("Repeteix: " + text); 
            }
            else{
            }
        }
        else if (textMajuscules.length()==3){
            char c0 = textMajuscules.charAt(0);
            char c3 = textMajuscules.charAt(text.length()-1);
            if ((c0 == c3 || c3 == c0) &&
                Character.isLetter(c0) &&
                Character.isLetter(c3)) {
                
                System.out.println("Repeteix: " + text);  //Imprimim el mates que hem passat al principi 
            }
        }
        else if (textMajuscules.length()>=4) {
            char c0 = textMajuscules.charAt(0);
            char c1 = textMajuscules.charAt(1);
            char c2 = textMajuscules.charAt(text.length()-2);
            char c3 = textMajuscules.charAt(text.length()-1);
            if ((c0 == c2 || c0 == c3) &&
                (c1 == c2 || c1 == c3) &&
                (c2 == c0 || c2 == c1) &&
                (c3 == c0 || c3 == c1) &&
                Character.isLetter(c0) &&
                Character.isLetter(c1) &&
                Character.isLetter(c2) &&
                Character.isLetter(c3)) {
            
                System.out.println("Repeteix: " + text);  //Imprimim el mates que hem passat al principi 
            }
        }
        else {
        }
    
    text = Entrada.readLine(); // Si la condició no es dona, tornem a donar l'entrada per a que el bucle pogui continuar
    }
    
    System.out.println("Adéu"); // si el text està buit el bucle acaba i el text s'acomiada
    
    }
}
