/*
 * El programa demanará un número per linia de comandes, aquest número determinarà el número de files. Per cada fila sortirá tants nombres (ordenats del 1 al nombre introduït) com files hi hagin formant un triangle.
 */
public class TriangleNombres {
    public static void main (String[] args) {
    
    System.out.println("Nombre?");
    int valor = Integer.parseInt(Entrada.readLine());
    
        if (valor>0 && valor<10) {
            for(int linia =0; linia<=valor; linia++){
                System.out.println();
                    for(int columna =1; columna <=linia; columna++){
                        System.out.print(columna);
                    }
            }
                System.out.println();
        }
        else {
            System.out.println("Valor inadequat");
        }
    }
}
