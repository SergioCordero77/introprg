/*
 * Programa que demana un text i dos valors enters. El programa mostrarà els caracters que es troben entres els valors. En cas de que els valors quedin fora de rang el programa normalitzarà els números, per exemple, si es fica un número per sota del 0, aquest esdevindrà 0 i si el número es troba per sobre de rang de la longitud del text, esdevindrà al número que es igual al número de caràcters que hi haurà al text.
 */
public class MostraInterval{
    public static void main (String [] args) {
    
    System.out.println("text?");
    String text = Entrada.readLine();
    
        if (text.isBlank()){
            System.out.println("Error");
        }
        else{    
            System.out.println("inici?");
            String inici = Entrada.readLine();
            
                if (UtilString.esEnter(inici)){
                    System.out.println("final?");
                    String ultim = Entrada.readLine();
                    
                        if (UtilString.esEnter(inici)){
                            System.out.println(
                                UtilString.cadenaContinua(text, Integer.parseInt(inici), Integer.parseInt(ultim))
                            );
                        }
                }
        }   
    }
}

