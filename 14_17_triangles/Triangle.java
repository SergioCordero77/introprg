/*
 * El programa demanará un número i aquest número determinarà el número de triangles que dibuixarà. Es dibuixaràn triangles amb números i sortiràn un sota de l'altre.
 */
public class Triangle {
    public static void main (String[] args) {
    
    System.out.println("quants?");
    int valor = Integer.parseInt(Entrada.readLine());
    
        if (valor>0 && valor<10) {
            for(int linia =0; linia<=valor; linia++){
                for(int columna = 1;  columna<= (valor-linia); columna++){
                       
                            System.out.print(columna); 
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Valor inadequat");
        }
    }
}
