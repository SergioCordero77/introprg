/*
 * Programa que determina la posicio numérica d'un caràcter
 * estigui dins o fora de rang.
 */
public class AnalitzaCaracter {
    public static void main (String [] args){
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    
    if (text.isBlank()){
            System.out.println ("El text no té lletres");
    }
    else {
        System.out.println("Posició?");
        int posicio = Integer.parseInt(Entrada.readLine());    
        char c = text.charAt(posicio);
        
        if (posicio >= 0){
            int posicio1 = posicio % text.length()-1;
        }
        if (posicio < 0){
            int posicio2 = -(posisio) % text.length()-1;
        }
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
            System.out.println ("\'"+c+"\' és un caràcter especial");
            }
    }
    }
}
