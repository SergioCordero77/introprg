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
    
    System.out.println ("\"" + textPrincipal + "\".length(): " + textPrincipal.length());
    System.out.println ("\"" + textPrincipal + "\".startsWith(\"" + textSecundari + "\"): " + textPrincipal.startsWith(textSecundari));
    System.out.println ("\"" + textPrincipal + "\".endsWith(\"" + textSecundari + "\"): " + textPrincipal.endsWith(textSecundari));
    System.out.println ("\"" + textPrincipal + "\".equals(\"" + textSecundari + "\"): " + textPrincipal.equals(textSecundari));
    System.out.println("\"" + textPrincipal + "\".equalsIgnoreCase(\"" + textSecundari + "\"): " + textPrincipal.equalsIgnoreCase(textSecundari));
    System.out.println ("\"" + textPrincipal + "\".isBlank(): " + textPrincipal.isBlank());
    System.out.println ("\"" + textPrincipal + "\".isEmpty(): " + textPrincipal.isEmpty());
    System.out.println ("\"" + textPrincipal + "\".charAt(\"" + numero + "\"): " + textPrincipal.charAt(numero));
    System.out.println("\"" + textPrincipal + "\".concat(\"" + textSecundari + "\"): " + textPrincipal.concat(textSecundari));
    System.out.println ("\"" + textPrincipal + "\".repeat(\"" + numero + "\"): " + textPrincipal.repeat(numero)); 
    System.out.println ("\"" + textPrincipal + "\".toUpperCase(): " + textPrincipal.toUpperCase()); 
    System.out.println ("\"" + textPrincipal + "\".toLowerCase(): " + textPrincipal.toLowerCase());
    }
}
