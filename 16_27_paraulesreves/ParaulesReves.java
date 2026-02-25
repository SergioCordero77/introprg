/*
 * Programa que demana un text i el torna a mostrar però invertint l'ordre de les lletres dins de cada paraula. L'ordre de les paraules dins del text romandrà igual que a l'original.

Considerarem que una paraula està formada per una seqüència de lletres i finalitza quan apareix un caràcter no lletra o bé la fi del text.

A més a més, mantindrà la coherència entre majúscules i minúscules del text original.

Considera la següent simulació:

Text?
Tot el que diuen de Windows és fals!
Tot le euq neuid ed Swodniw sé slaf!
 */
public class ParaulesReves{
    public static void main (String [] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        String invertit = inverteixParaules(text);

        System.out.println(copiaCas(invertit, text));
    }
    
    // Funció que va paraula per paraula i la inverteix
    public static String inverteixParaules (String text){
        
        String paraula = "";
        String textInvertit = "";
        
        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);         
            
            if (Character.isLetter(c)){
                paraula += c;
            }
            else {
                String paraulaInvertida = "";
                
                for (int j=paraula.length()-1; j>=0; j--){
                    char c2 = paraula.charAt(j);
                
                    paraulaInvertida += c2;
                }
                
                // Cridem a la funcio copiaCas
                textInvertit += paraulaInvertida + c;
                
                paraula = "";
            }
        }
        
        // En el cas de que quedi una paraula pendent i no està vuida, la processem
        if (!paraula.equals("")) {

            String paraulaInvertida = "";

            for (int j = paraula.length() - 1; j >= 0; j--) {
                paraulaInvertida += paraula.charAt(j);
            }

            textInvertit += paraulaInvertida;
        }
        return textInvertit;
    }
    
    //Funció que ajusta les majúscules i les minúscules, segons el model original    
    public static String copiaCas(String text, String model) {

        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char cText = text.charAt(i);

            if (i < model.length()) {

                char cModel = model.charAt(i);

                if (Character.isUpperCase(cModel)) {
                    resultat += Character.toUpperCase(cText);
                }
                else if (Character.isLowerCase(cModel)) {
                    resultat += Character.toLowerCase(cText);
                }
                else {
                    resultat += cText;
                }

            } else {
                resultat += cText;
            }
        }

        return resultat;
    }
}

