/*
 * El programa demanará un número per linia de comandes, aquest número determinarà el número de files. Per cada fila sortirá tants nombres (ordenats del 1 al nombre introduït) com files hi hagin. Començarà imprimint tants númers com el valor que se li hagi introduït i anirà imprimint un valor menys per cada fila. Això acabarà formant un triangle invertit.
 */
public class TriangleInvertit {
    public static void main (String[] args) {
    
    System.out.println("Nombre?");
    int valor = Integer.parseInt(Entrada.readLine());
    
        if (valor>0 && valor<10) {
            for(int linia =0; linia<=valor; linia++){
                for(int columna = 1;  columna<= (valor-linia); columna++){
                        
                        if (columna < (valor-linia)){
                            System.out.print(columna + ", ");
                        }
                        else {
                            System.out.print(columna);
                        } 
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Valor inadequat");
        }
    }
}
