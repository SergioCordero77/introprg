/*
 * El programa demanará un número que determinará el nombre de files i el nombre de columnes. Estarà limitat del 1 al 9. Es dibuixarà un quadrat de nombre que anirá des del número 1 fins el número que s'hagi introduït.
 */
public class QuadratNombres {
    public static void main (String[] args) {
    
    System.out.println("Valor final?");
    int valor = Integer.parseInt(Entrada.readLine());
    
        if (valor>0 && valor<10) {
            for(int linia =0; linia<valor; linia++){
                System.out.println();
                    for(int columna =1; columna <=valor; columna++){
                        System.out.print(" "+columna);
                    }
            }
                System.out.println();
        }
        else {
            System.out.println("Valor inadequat");
        }
    }
}

