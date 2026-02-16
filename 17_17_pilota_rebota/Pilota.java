 /*
  * El programa Pilota mostra el contingut d'una taula de caràcters on la major part dels valors són el caracter '·' (un punt). Hi ha un, però, el 'O' que representa una pilota.

La pilota comença en la posició (0, 0) i, cada cop que el programa rep un salt de línia, incrementa en un la fila i la columna. Quan supera la darrera fila, torna a la primera. El mateix fa amb la columna.

En el moment que arriva al limit la pilota passa a la fila anterior i canvia el sentit del moviment.

La velocitat del canvi, doncs, depen de com de ràpid premem la tecla Enter.

El programa finalitzarà quan li introduïm quelcom diferent a una cadena buida.
  */
public class Pilota {
    //// Constants que defineixen la mida del camp (files i columnes)
    public static final int N_FILES = 9;
    public static final int N_COLS = 14;

    public static void netejaPantalla() {
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
    public static void netejaPosicio(char[][] camp, int[] posicio) {
        int fila = posicio [0];
        int col = posicio [1];
        
        camp [fila][col] = '·';
    }
    // Col·loca la pilota ('O') en la posició indicada del camp
    public static void posicionaPilota(char[][] camp, int[] posicio) {
        int fila = posicio [0];
        int col = posicio [1];
        
        camp [fila][col] = 'O';
    }
    // Retorna la fila actual de la pilota a partir de l'array posicio.
    public static int obteFila(int[] posicio) {
        return posicio[0];
    }
    // Retorna la columna actual de la pilota a partir de l'array posicio.
    public static int obteCol(int[] posicio) {
        return posicio[1];
    }
    // Retorna l'increment vertical (moviment en files) de la pilota.
    public static int obteIncrFila(int[] increment) {
        return increment [0];
    }
    // Retorna l'increment horitzontal (moviment en columnes) de la pilota.
    public static int obteIncrCol(int[] increment) {
        return increment [1];
    }
    // Actualitza la posició de la pilota guardant la nova fila i la nova columna dins de l'array posicio.
    public static void canviaPosicio(int[] posicio, int novaFila, int novaCol) {
        posicio [0] = novaFila;
        posicio [1] = novaCol;
    }
    // Actualitza els increments de moviment de la pilota, establint el nou increment vertical i horitzontal.
    public static void canviaIncrement(int[] increment, int nouIncFila, int nouIncCol) {
        increment [0] = nouIncFila;
        increment [1] = nouIncCol;
    }
    // Calcula la següent posició de la pilota segons els increments actuals. Si la pilota surt dels límits del camp, aplica un rebot invertint l'increment corresponent i ajustant la posició.
    public static void seguentPosicio(int[] posicio, int[] increment) {
        int fila = obteFila(posicio);
        int col = obteCol(posicio);
        int incFila = obteIncrFila(increment);
        int incCol = obteIncrCol(increment);

        // actualitza la fila
        fila = fila + incFila;
        if (fila < 0) {                     // es passa per sobre
            fila = 1;                       // torna a la primera fila
            incFila = 1;                    // toca baixar
        } else if (fila > N_FILES - 1) {     // es passa per sota
            fila = N_FILES - 2;                 // torna a la última posició
            incFila = -1;                    // toca pujar
        }

        // actualitza la columna
        col = col + incCol;
        if (col < 0) {                      // es passa per l'esquerra
            col = 1;                        // torna a la primera fila
            incCol = 1;                     // toca anar cap a la dreta
        } else if (col > N_COLS -1) {       // es passa per la dreta
            col = N_COLS - 2;               // torna anar cap a l'esquerra
            incCol = -1;                    // toca pujar
        }                                   

        // actualitza la posició i l'increment
        canviaPosicio(posicio, fila, col);
        canviaIncrement(increment, incFila, incCol);
    }
    public static void main(String[] args)  {
        char[][] camp = new char[N_FILES][N_COLS];
        netejaCamp(camp);

        int[] posicio = new int[2];         // fila, col
        canviaPosicio(posicio, 0, 0);       // posició inicial (0, 0)

        int[] increment = new int[2];       // incFila, incCol
        canviaIncrement(increment, 1, 1);   // desplaçament inicial: 1 fila 1 columna

        do {
            posicionaPilota(camp, posicio);
            netejaPantalla();
            mostraCamp(camp);
            netejaPosicio(camp, posicio);
            seguentPosicio(posicio, increment);
            System.out.printf("%nEnter per continuar");
        } while (Entrada.readLine().isEmpty());

    }
}
