/*
 * Programa que va demanant text fins que arribi un text en blanc o buit.
 * Quan el programa rebi "dibuixa quadrat" o "dibuixa rectangle", en comptes de repetir el text, el programa dibuixarà el quadrat o el rectangle corresponent.
 */
public class LloroQuadrat {
    public static void main(String[] args) {
        System.out.println("El lloro espera paraula:");
        String text = Entrada.readLine();
        
        while (!text.isBlank()){
        
            if (text.equals("dibuixa quadrat")){
                dibuixaQuadrat();
            }
            else if (text.equals("dibuixa rectangle")){
                dibuixaRectangle();
            }
            else{
                System.out.println("El lloro repeteix: " + text);
            }
            
            System.out.println("El lloro espera paraula:");
            text = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
    
    public static void dibuixaQuadrat(){
        // dibuixa un quadrat
        for (int linia=1; linia <= 5; linia++) {
            dibuixaLinia();
            // dibuixa un salt de línia
            System.out.println();
        }
    }
    
    public static void dibuixaRectangle(){
        // dibuixa un rectangle
        for (int linia=1; linia <= 5; linia++) {
            dibuixaLinia();
            dibuixaLinia();
            // dibuixa un salt de línia
            System.out.println();
        }
    }
                    
    public static void dibuixaLinia (){
        // dibuixa una línia
        for (int columna=1; columna <= 5; columna++) {
            // dibuixa un element de la línia
            System.out.print(" X");
        }
        
    }
}
