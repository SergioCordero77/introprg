/* 
 * Programa que demana un text i mostra la suma dels dígits que conté. 
 */
public class SumaDigits {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        int nombres = sumaDigits(text);
        System.out.println(nombres);
    }

    // XXX
    public static int sumaDigits(String text) {
        // cas base
        if (text.isEmpty()){
            return;
        }

        // tracta pas actual
        char c = text.charAt(0);
        String actual = "";
        if (Character.isDigit(c)) {
            int num = c - '0';
            actual = "" + c;
        }


        // tracta pas recursiu
        String resta = extreuNombres(text.substring(1));

        // composa resultat
        return actual + resta;
    }
}
