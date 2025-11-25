/*
 * El programa demanará un número i aquest número determinarà el número de rombos que dibuixarà. Es dibuixaràn triangles amb números i sortiràn un sota de l'altre.
 */
public class Rombos {
    public static void main (String[] args) {
    
    System.out.println("quants?");
    int valor = Integer.parseInt(Entrada.readLine());
    
        if (valor>0 && valor<10) {
        
            // Triangle superior
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
                // Triangle inferior
                for(int linia=0; linia<=8; linia++){
                    System.out.println();
                        // Triangle punts esquerre
                        for(int columna=0; columna<=linia; columna++){
                            System.out.print(".");
                        }
                        // Triangle números esquerre
                        for(int columna=linia+1; columna<=9; columna++){
                            System.out.print(columna);
                        }
                        // Triangle números dret
                        for(int columna=8; columna>linia; columna--){
                            System.out.print(columna);
                        }
                        for(int columna=0; columna<=linia; columna++){
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
