/*
 * Programa que rep com a paràmetres de la línia de comandes una o més especificacions de taules en format "n'x'm", on n representa el nombre de files i m el nombre de columnes.
 *
 * Per cada especificació:
 *  - Comprova si el format és correcte.
 *  - Si no és correcte, mostra el missatge:
 *        "Especificació no vàlida"
 *  - Si és correcte:
 *        - Crea una taula d'enters de dimensions n x m.
 *        - Inicialitza totes les posicions amb el valor 1.
 *        - Converteix la taula a String amb el format establert
 *          (valors amb amplada mínima de 8 caràcters).
 *        - Mostra el resultat per pantalla.
 */
public class TaulaEnterAString {
    public static void main(String[] args){
        int inici = 0;
        
        for (int i=0; i<args.length; i++) {
            System.out.println(args[i]);
            
            if (!especificacioCorrecta (args[i])){
                System.out.println("Especificació no vàlida");
            }
            else{
                int files = obteFiles(args[i]);
                int columnes = obteColumnes(args[i]);
                if (files < 1 || columnes < 1) {
                    System.out.println("Especificació no vàlida");
                } 
                else {
                    inici ++;
                    int[][] taula  = new int[files][columnes];
                    UtilTaula.inicialitzaSequencial(taula, inici);
                    String resultat = UtilTaula.taulaToString(taula);
                    System.out.println(resultat);
                    System.out.println();
                }
            }
        }
    }

    public static boolean especificacioCorrecta(String especificacio) {
        /* retorna true si l'especificació és de la forma n'x'm on n i m
         * són dos strings d'un o dos dígits.  Exemple: "12x5" seria
         * correcta, mentre que "x3454" no.  */
        String[] coordenades = especificacio.split("x");
        if (coordenades.length != 2) return false;
        for (int i=0; i<coordenades.length; i++) {
            if (! UtilString.esEnter(coordenades[i])) return false;
            int valor = Integer.parseInt(coordenades[i]);
            if (valor < 0 || valor > 99) return false;
        }
        return true;
    }

    public static int obteFiles(String especificacio) {
        /* Aquesta funció espera l'especificació de la forma d'una taula.
         * En cas que l'especificació sigui correcta, retornarà l'enter
         * corresponent als primers dígits. Per exemple, si especificacio
         * és "12x5", retornarà 12.
         * Altrament, retornarà el valor -1.  */
         String num = "";
         
            if (!especificacioCorrecta(especificacio)) {
                return -1;
            }
         
            for (int i = 0; i < especificacio.length(); i++){
                char c = especificacio.charAt(i);
                    
                if (Character.isDigit(c)){
                    num += c;
                }
                else{
                    break;
                }
            }

            if (num.isEmpty()) {
                return -1;
            }
                 
            return Integer.parseInt(num);
        }

    public static int obteColumnes(String especificacio) {
        /* Aquesta funció espera l'especificació de la forma d'una taula.
         * En cas que l'especificació sigui correcta, retornarà l'enter
         * corresponent als segons dígits. Per exemple, si especificacio
         * és "12x5", retornarà 5.
         * Altrament, retornarà el valor -1.  */
         
         boolean hihaX = false;
          
         String num = "";
         
         if (!especificacioCorrecta(especificacio)) {
            return -1;
         }
         
         for (int i = 0; i < especificacio.length(); i++){
            char c = especificacio.charAt(i);
            
            if (c == 'x'){
                hihaX = true;
            }
            
            if (hihaX && Character.isDigit(c)){
                num += c;
            }
         }
         
         if (num.isEmpty()) {
            return -1;
         }
         
         return Integer.parseInt(num);
    }
}
