/*
 * Programa que demana un text i mostra un petit informe resum de les estadístiques del text.
 L'informe indicarà quants caràcters, lletres i vocals catalanes (majúscules i minúscules), dígits i altres caràcters conté. A banda, indicarà, per cada categoria, el percentatge respecte el total dels caràcters.

 Considera la següent simulació:

 Text?
 Amiga, que són 4 pipes. Ni 1 més, ni 1 menys!
 Informe
 =======
 lletres en majúscules: 2 (4,44%)
 lletres en minúscules: 26 (57,78%)
 total lletres: 28 (62,22%)
 vocals en majúscules: 1 (2,22%)
 vocals en minúscules: 11 (24,44%)
 total vocals: 12 (26,67%)
 digits: 3 (6,67%)
 altres caràcters: 14 (31,11%)
 total caràcters: 45
 */
public class InformeText{
    public static void main (String [] args){
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    int total = 0;
    int numVocals = 0;
    int numAltres = 0;
    
    if (text.isEmpty()){
        System.out.printf("Cadena buida%n");
    }
    else{
        for (int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if (UtilString.esVocal(c)){
                numVocals ++;
            }
            else{
                if (!Character.isLetter(c) && !Character.isDigit(c)){
                    numAltres ++;
                }
            }
            
            total ++;
        }
        
        System.out.printf("Informe%n");
        System.out.printf("=======%n");
        System.out.printf("lletres en majúscules: %d (%.2f%%)%n",
                      UtilString.numLletresMajuscules (text),
                      100.0 * UtilString.numLletresMajuscules (text) / total);
        System.out.printf("lletres en minúscules: %d (%.2f%%)%n",
                      UtilString.numLletresMinuscules (text),
                      100.0 * UtilString.numLletresMinuscules (text) / total);
        System.out.printf("total lletres: %d (%.2f%%)%n",
                      UtilString.numLletres (text),
                      100.0 * UtilString.numLletres (text) / total);
        System.out.printf("vocals en majúscules: %d (%.2f%%)%n",
                      UtilString.numVocalsMajuscules (text),
                      100.0 * UtilString.numVocalsMajuscules (text) / total);
        System.out.printf("vocals en minúscules: %d (%.2f%%)%n",
                      UtilString.numVocalsMinuscules (text),
                      100.0 * UtilString.numVocalsMinuscules (text) / total);
        System.out.printf("total vocals: %d (%.2f%%)%n",
                      numVocals,
                      100.0 * numVocals / total);
        System.out.printf("digits: %d (%.2f%%)%n",
                      UtilString.numDigits(text),
                      100.0 * UtilString.numDigits(text) / total);
        System.out.printf("altres caràcters: %d (%.2f%%)%n",
                      numAltres,
                      100.0 * numAltres / total);
        System.out.printf("total caràcters: %d%n",
                      total);
        }
    }
}
