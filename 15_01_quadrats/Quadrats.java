/*
 * Programa que demana un número per entrada estàndard i dibuixa tants quadrats com indiqui el número. Si el número és 0 o negatiu, no dibuixarà res.
 */
/* Plantilla general dels programes que hem fet fins ara */
public class Quadrats {
    public static void main(String[] args) {

    System.out.println ("Número?");
    int numero = Integer.parseInt(Entrada.readLine());
    
    // si el número és més gran que 0, el programa es dibuixaràn els quadrats
    if (numero>0){
        // número de quadrats
        for (int i=1; i <= numero; i++) {
            // dibuixa un quadrat
            for (int linia=1; linia <= 5; linia++) {
                // dibuixa una línia
                for (int columna=1; columna <= 5; columna++) {
                    // dibuixa un element de la línia
                    System.out.print(" X");
                }
                // dibuixa un salt de línia
                System.out.println();
            }
            // dibuixa un salt de línia
            System.out.println();
        }
    }
    }
}
