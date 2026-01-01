/*
 * Programa que rep un número per linia de comandes "args[0]" i mostra un quadrat de " X" amb el valor indicat.
 * El valor indicat ha de ser positiu.
 */
public class Quadrat {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(args [0]);
        
        dibuixaQuadrat(numero);
    }
    
    public static void dibuixaQuadrat(int mida){
       // si el número és més gran que 0, el programa es dibuixaràn els quadrats
        if (mida>0){ // dibuixa un quadrat
            for (int linia=1; linia <= mida; linia++) {
                dibuixaLinia(mida);
            }
        }
    }
                    
    public static void dibuixaLinia(int costat){
        // dibuixa una línia
        for (int columna=1; columna <= costat; columna++) {
            // dibuixa un element de la línia
            System.out.print(" X");
        }
        // dibuixa un salt de línia
        System.out.println();
    }
}
