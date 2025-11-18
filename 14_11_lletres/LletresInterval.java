/*
 * El programa demanará una lletra i després demanará quantes lletres més vol que s'imprimeixi. Les lletres seguiran l'ordre alfabètic i quan s'arribi a la z tornarà un altre cop a la a. 
 * S'haurà de distingir si son majúscules o minúscules.
 */
public class LletresInterval{
    public static void main (String[] args) {
    
    System.out.println("lletra?");
    String lletra = Entrada.readLine();
    
        if (lletra.length()==1 || lletra.isBlank()){
    
            System.out.println("quantes?");
            int numero = Integer.parseInt (Entrada.readLine());
            
            char inicial = lletra.charAt(0);
            int ascii = (int) inicial;
                
                if ((ascii >= 65 && ascii <= 90) && lletra.length() == 1 && numero >=1) {
                    for (int i = 0; i<numero; i++){
                        if (ascii > 90){
                            ascii=65;
                        }
                        System.out.print("" + (char) ascii);
                        ascii ++;
                    }
                        System.out.println();
                }
                else if ((ascii >= 97 && ascii <= 122) && lletra.length() == 1 && numero >=1){
                    for (int i = 0; i<numero; i++){
                        if (ascii > 122){
                            ascii=97;
                        }
                        System.out.print("" + (char) ascii);
                        ascii ++;
                    }
                        System.out.println();
                }
                else{
                    System.out.println("ERROR");
                }
        }
        else{
            System.out.println("ERROR: cal especificar una única lletra.");
        }
    }
}


