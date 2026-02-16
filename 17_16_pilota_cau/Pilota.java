 /*
  * El programa Pilota mostra el contingut d'una taula de caràcters on la major part dels valors són el caracter '·' (un punt). Hi ha un, però, el 'O' que representa una pilota.

La pilota comença en la posició (0, 0) i, cada cop que el programa rep un salt de línia, incrementa en un la fila i la columna. Quan supera la darrera fila, torna a la primera. El mateix fa amb la columna.

La velocitat del canvi, doncs, depen de com de ràpid premem la tecla Enter.

El programa finalitzarà quan li introduïm quelcom diferent a una cadena buida.
  */
 public class Pilota {
     //// Constants que defineixen la mida del camp (files i columnes)
     public static final int N_FILES = 9;
     public static final int N_COLS = 13;

     public static void netejaPantalla() {
         // NOTA: La neteja de pantalla podria no funcionar fora del terminal.
         System.out.print("\033[H\033[2J");
         System.out.flush();
     }
     // Mostra el contingut actual del camp per pantalla
     public static void mostraCamp(char[][] camp) {
         for (int i=0; i<N_FILES; i++) {
             for (int j=0; j<N_COLS; j++) {
                 System.out.print(camp[i][j]);
             }
             System.out.println();
         }
     }
     // Omple tot el camp amb el caràcter '·' per inicialitzar-lo o reiniciar-lo
     public static void netejaCamp(char[][] camp) {
         for (int i = 0; i<N_FILES; i++){
            for (int j = 0; j<N_COLS; j++){
                camp [i][j] = '·';
            }
         }
     }
     // Esborra una posició concreta del camp (posa '·' a la fila i columna indicades)
     public static void netejaPosicio(char[][] camp, int fila, int col) {
         camp [fila][col] = '·';  
     }
     // Col·loca la pilota ('O') en la posició indicada del camp
     public static void posicionaPilota(char[][] camp, int fila, int col) {
         camp [fila][col] = 'O';
     }
     // Calcula la següent fila de manera circular (torna a 0 quan arriba al límit)
     public static int seguentFila(int actual) {
         return (actual + 1)%N_FILES;
     }
     // Calcula la següent columna de manera circular (torna a 0 quan arriba al límit)
     public static int seguentCol(int actual) {
         return (actual + 1)%N_COLS;
     }
     // Mètode principal: controla el moviment de la pilota pel camp
     public static void main(String[] args)  {
         char[][] camp = new char[N_FILES][N_COLS];
         netejaCamp(camp);
         int fila = 0;
         int col = 0;
         do {
             posicionaPilota(camp, fila, col);
             netejaPantalla();
             mostraCamp(camp);
             netejaPosicio(camp, fila, col);
             fila = seguentFila(fila);
             col = seguentCol(col);
             System.out.printf("%nEnter per continuar");
         } while (Entrada.readLine().isEmpty());
     }
 }
