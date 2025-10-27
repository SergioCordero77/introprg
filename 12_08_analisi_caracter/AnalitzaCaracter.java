/*
 * Programa que determina la posicio numérica d'un caràcter
 * estigui dins o fora de rang.
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
        char c = text.charAt(residu);
        
            if (Character.isUpperCase(c)){
                System.out.println ("\'"+c+"\' és una lletra majúscula");
            }
            else if (Character.isLowerCase(c)){
                System.out.println ("\'"+c+"\' és una lletra minúscula");
            }
            else if (Character.isDigit(c)){
                System.out.println ("\'"+c+"\' és un dígit");
            }
            else {
                System.out.println ("\'"+c+"\' és una altra cosa");
            }
    }
    }
}
