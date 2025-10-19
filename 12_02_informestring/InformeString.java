/*
 * Programa que demana dos texts i un enter positiu i fa un 
 * informe amb el resultat de les funcions anteriors.
 *
 */
public class InformeString {
    public static void main (String [] args) {
    
    System.out.println("Text principal?");
    String textPrincipal = Entrada.readLine();
    
    System.out.println("Text secundari?");
    String textSecundari = Entrada.readLine();
    
    System.out.println("Número positiu?");
    int numero = Integer.parseInt (Entrada.readLine());
    
    System.out.println ("Longitud del text principal: " + textPrincipal.length());
    System.out.println ("Comença com el text secundari: " + textPrincipal.startsWith(textSecundari));
    System.out.println ("El text principal acaba amb com el text secundari: " + textPrincipal.endsWith(textSecundari));
    System.out.println ("El text principal és igual al text secundari: " + textPrincipal.equals(textSecundari));
    System.out.println ("El text principal és igual al text secundari (ignorant majúscules i minúscules: " + textPrincipal.equalsIgnoreCase(textSecundari));
    System.out.println ("Està el text principal en blanc: " + textPrincipal.isBlank());
    System.out.println ("Està el text principal buit: " + textPrincipal.isEmpty());
    System.out.println ("Caràcter en la posició " + numero + ": " + textPrincipal.charAt(numero));
    System.out.println ("Concatena el text principal amb el text secundari: " + textPrincipal.concat(textSecundari)); 
    System.out.println ("Repeteix " + numero + " el text principal: " + textPrincipal.repeat(numero)); 
    System.out.println ("Escriu el text principal en majúscules: " + textPrincipal.toUpperCase()); 
    System.out.println ("Escriu el text principal en minúsucles: " + textPrincipal.toLowerCase()); 
    }
}
