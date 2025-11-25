/*
 * El programa demanará un número i aquest número determinarà el número de triangles que dibuixarà. Es dibuixaràn triangles amb números i sortiràn un sota de l'altre.
 */
public class Triangle {
    public static void main (String[] args) {
    
    System.out.println("quants?");
    int valor = Integer.parseInt(Entrada.readLine());
    
        if (valor>0 && valor<10) {
        
            for(int i=0; i<valor; i++){
                for(int linia=9; linia>=1; linia--){
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
                System.out.println();
        }
        else {
            System.out.println("Valor inadequat");
        }
    }
}
