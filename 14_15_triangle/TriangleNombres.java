/*
 * El programa demanará un número per linia de comandes, aquest número determinarà el número de files. Per cada fila sortirá tants nombres (ordenats del 1 al nombre introduït) com files hi hagin formant un triangle.
 */
public class TriangleNombres {
    public static void main (String[] args) {
    
    System.out.println("Nombre?");
    int valor = Integer.parseInt(Entrada.readLine());
    
        if (valor>0 && valor<10) {
            for(int linia =1; linia<=10; linia++){
                
                  for(int columna=1; columna<10 ; columna++){
                        
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
