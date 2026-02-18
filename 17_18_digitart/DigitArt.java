/*
 * Programa que permet representar els dígits '1', '2' i '3' com a art ASCII utilitzant una
 * matriu de caràcters. Cada dígit té una representació predefinida amb caràcters 'X' i '·'.
 * 
 * Funcionament:
 * - Es poden passar un o més arguments per línia de comandes.
 * - Cada argument s'analitza caràcter per caràcter.
 * - Per a cada dígit reconegut ('1', '2', '3'), es crea una taula amb la forma del dígit.
 * - Es substitueixen els caràcters 'X' pel dígit corresponent per generar el resultat final.
 * - Es mostra per pantalla la taula original i la taula transformada, línia per línia.
 *
 * Exemple d'execució:
 * java DigitArt 1
 * ····· -> ·····
 * ·XX·· -> ·11··
 * ··X·· -> ··1··
 * ··X·· -> ··1··
 * ··X·· -> ··1··
 * ·XXX· -> ·111·
 *····· -> ·····
 *
 * - Si no es passa cap argument, el programa mostra "Res a fer" i finalitza.
 * - El programa utilitza la classe UtilTaula per fer còpies de les matrius i substituir
 *   els caràcters sense modificar les taules originals.
 */
public class DigitArt {
     //Declaració de la primera taula
     public static char[][] construeix1() {
         return new char[][] {
             {'·', '·', '·', '·', '·'},
                 {'·', 'X', 'X', '·', '·'},
                 {'·', '·', 'X', '·', '·'},
                 {'·', '·', 'X', '·', '·'},
                 {'·', '·', 'X', '·', '·'},
                 {'·', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', '·'}
         };
     }
     //Declaració de la segona taula
     public static char[][] construeix2() {
         return new char[][] {
                 {'·', '·', '·', '·', '·', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', 'X', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', 'X', '·', '·', '·', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', '·', '·'},
         };
     }
     //Declaració de la tercera taula
     public static char[][] construeix3() {
         return new char[][] {
                 {'·', '·', '·', '·', '·', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', 'X', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', 'X', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', '·', '·'},
         };
     }
     // Imprimim el resultat final
     public static void mostraResultat(char[][] origen, char[][] resultat) {
     
         for (int fila = 0; fila<origen.length; fila ++){
            for (int col = 0; col<origen[fila].length; col ++){
                System.out.print (origen[fila][col]);
            }
                System.out.print (" -> ");
            for (int col = 0; col<resultat[fila].length; col ++){
                System.out.print (resultat[fila][col]);
            }
                System.out.println();
         }
     }
     //Segons el caràcter es modifica la taula 
     public static void processaCaracter(char ch) {
         char[][] origen;
         switch (ch) {
             case '1': origen = construeix1();
                       break;
             case '2': origen = construeix2();
                       break;
             case '3': origen = construeix3();
                       break;
             default: return;    // no conec aquest caràcter
         }
         char[][] desti = UtilTaula.substitueix(origen, 'X', ch);
         mostraResultat(origen, desti);
         System.out.println();
     }
     //Processem l'String per veure descomposarlo en caràcters
     public static void processaArgument(String arg) {
        
        for (int i = 0; i<arg.length(); i++){
            char c = arg.charAt(i);
            
            processaCaracter(c);
        }
     }
     //Mirem que el que s'ha passat per linia de comandes sigui correcte
     public static void main(String[] args){
         
         if (args.length == 0) {
            System.out.println("Res a fer");
            return;
         }
         
         for (int i = 0; i<args.length; i++){
                String argument = args [i];
                
                processaArgument(argument);
         }
     }
}
