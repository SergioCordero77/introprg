/*
 * El programa demanará un número i aquest número determinarà el número de rombos que dibuixarà. Es dibuixaràn rombos amb números i sortiràn un al costat de l'altre.
 */
public class RombosH {
    public static void main (String[] args) {
    
    System.out.println("quants?");
    int valor = Integer.parseInt(Entrada.readLine());
        
        if (valor>0) {
           
            
            // Triangle superior
                for(int linia=9; linia>=0; linia--){
                    if (linia>=1){
                    System.out.print(".");
                    }
                    else {
                    System.out.print(0);
                    } 
                        for(int i=0; i<valor; i++){
                            // Triangle punts esquerre
                            for(int columna=1; columna<=linia; columna++){
                                if (columna<linia){ //Treure punts iniciales
                                    System.out.print(".");
                                }
                            }
                            // Triangle números esquerre
                            for(int columna=linia; columna<=9; columna++){
                                if (columna>0){ //Treure el 0
                                    System.out.print(columna);
                                }
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
                        System.out.println(); 
                }    
            
                
                // Triangle inferior
                for(int linia=0; linia<=8; linia++){
                    System.out.print(".");
                        for(int i=0; i<valor; i++){
                            // Triangle punts esquerre
                            for(int columna=0; columna<=linia; columna++){
                                if (columna > 0){
                                    System.out.print(".");
                                }
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
                        System.out.println();
                }
                   
        }
 /*       else {
            System.out.println("Valor inadequat");
        }
   */ }
}
