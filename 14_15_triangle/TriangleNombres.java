/*
 * El programa demanará un número per linia de comandes, aquest número determinarà el número de files. Per cada fila sortirá tants nombres (ordenats del 1 al nombre introduït) com files hi hagin formant un triangle.
 */
public class TriangleNombres {
    public static void main (String[] args) {
    
    System.out.println("Nombre?");
    int valor = Integer.parseInt(Entrada.readLine());
    
        if (valor>0 && valor<10) {
            if (valor>1){
            // Triangle
            for(int i=0; i<valor; i++){
                for(int linia=9; linia>=0; linia--){
                    System.out.println();
                        // Triangle punts esquerre
                        for(int columna=1; columna<=linia; columna++){
                            System.out.print(".");
                        }
                        // Triangle números esquerre
                        for(int columna=linia; columna<=9; columna++){
                            System.out.print(columna);
                        }
                        // Triangle números dret
                        for(int columna=8; columna>=linia; columna--){
                            System.out.print(columna);
                        }
                        // Triangle punts dret
                        for(int columna=1; columna<=linia; columna++){
                            System.out.print(".");
                        }
                }  
            }
            }
                System.out.println();
        }
        else {
            System.out.println("Valor inadequat");
        }
    }
}

/*
for(int linia =1; linia<=10; linia++){
                System.out.println();
                  for(int columna =10; (columna-linia)>=1; columna--)
                  
resultat:
.........
........
.......
......
.....
....
...
..
.

for(int linia =1; linia<=10; linia++){
                System.out.println();
                  for(int columna=10; (10-linia)<columna; columna--)
                  
resultat:
9
98
987
9876
98765
987654
9876543
98765432
987654321
9876543210
*/
