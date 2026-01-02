/*
 * Programa que determina la posicio numérica d'un caràcter estigui dins o fora de rang.
 */
public class AnalitzaCaracter {
    public static void main (String [] args){
    System.out.println("Text?");
    String text = Entrada.readLine();
    
        if (text.isBlank()){
                System.out.println ("Text buit");
        }
        else {
            System.out.println("Posició?");
            int posicio = Integer.parseInt(Entrada.readLine());
            int residu = ((posicio % text.length()) + text.length()) % text.length();    
            char caracter = text.charAt(residu);
            
            AnalitzaCaracter (caracter);
        }
    }
    
    public static void AnalitzaCaracter (char caracter){
        // Analisi del caracter
        if (Character.isUpperCase(caracter)){
            System.out.println ("\'"+caracter+"\' és una lletra majúscula");
        }
        else if (Character.isLowerCase(caracter)){
            System.out.println ("\'"+caracter+"\' és una lletra minúscula");
        }
        else if (Character.isDigit(caracter)){
            System.out.println ("\'"+caracter+"\' és un dígit");
        }
        else {
            System.out.println ("\'"+caracter+"\' és una altra cosa");
        }
    }
}
