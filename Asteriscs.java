/*
 * El programa demanará un número per linia de comandes, aquest número determinarà el número de files. Per cada fila sortirá tants asteriscs com files hi hagin formant un triangle.
 */
public class Asteriscs {
    public static void main (String[] args) {
    
    System.out.println("Valor final?");
    int valor = Integer.parseInt(args[0]);
    
        if (valor>0 && valor<10) {
            for(int linia =0; linia<=valor; linia++){
                System.out.println();
                    for(int columna =1; columna <=linia; columna++){
                        System.out.print("*");
                    }
            }
                System.out.println();
        }
        else {
            System.out.println("Valor inadequat");
        }
    }
}
