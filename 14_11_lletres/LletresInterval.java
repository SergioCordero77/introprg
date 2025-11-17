/*
 * El programa demanará una lletra i després demanará quantes lletres més vol que s'imprimeixi. Les lletres seguiran l'ordre alfabètic i quan s'arribi a la z tornarà un altre cop a la a. 
 * S'haurà de distingir si son majúscules o minúscules.
 */
public class LletresInterval{
    public static void main (String[] args) {
    
    System.out.println("lletra?");
    String lletra = Entrada.readLine();
    
    System.out.println("quantes?");
    int numero = Integer.parseInt (Entrada.readLine());
    
    char inicial = lletra.charAt(0);
    int ascii = (int) inicial;
    int suma = ascii + numero;
    
    if ((ascii >= 65 && ascii <= 90) && lletra.length() == 1 && numero >=1) {
        for (int i = ascii; i<=suma; i++){
            System.out.print("" + (char) i);
        }
            System.out.println();
    }
    else if ((ascii >= 97 && ascii <= 122) && lletra.length() == 1 && numero >=1){
        for (int i = ascii; i<=suma; i++){
            System.out.print("" + (char) i);
        }
            System.out.println();
    }
    else{
        System.out.println("ERROR");
    }
    }
}
