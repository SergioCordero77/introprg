/*
 * Programa que rep un número per linia de comandes "args[0]" i un caràcter per "args[1]" i mostrarà un quadrat amb els valors indicats.
 * El número indicat ha de ser positiu.
 */
public class Quadrat {
    public static void main(String[] args) {
        
        int costat = Integer.parseInt(args [0]);
        String text = args [1];
        char caracter = text.charAt(0);
        
        dibuixaQuadrat(costat, caracter);
    }
    
    public static void dibuixaQuadrat(int costat, char caracter){
       // si el número és més gran que 0, el programa es dibuixaràn els quadrats
        if (costat>0){ // dibuixa un quadrat
            for (int linia=1; linia <= costat; linia++) {
                dibuixaLinia(costat, caracter);
            }
        }
    }
                    
    public static void dibuixaLinia(int costat, char caracter){
        // dibuixa una línia
        for (int columna=1; columna <= costat; columna++) {
            // dibuixa un element de la línia
            System.out.print(" " + caracter);
        }
        // dibuixa un salt de línia
        System.out.println();
    }
}
