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

    // Extreu els nombres i els suma
    public static int sumaDigits(String text) {
        // cas base
        if (text.isEmpty()){
            return 0;
        }

        // tracta pas actual
        char c = text.charAt(0);
        int suma = 0;
        if (Character.isDigit(c)) {
            int num = c - '0';
            suma = num;
        }

        // tracta pas recursiu
        suma += sumaDigits(text.substring(1));

        // composa resultat
        return suma;
    }
}
