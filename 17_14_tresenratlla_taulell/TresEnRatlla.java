/*
 * Programa que representa una situació del joc "Tres en ratlla".
 La representació del joc es realitzarà tenint present que:

El tauler estarà representat de la següent manera: "char[][] tauler = new char[3][3];".

Cada posició es codificarà amb un de tres possibles caràcters (X, O o ·) El punt indicarà que la posició encara no està marcada.

A banda, el programa demanarà quin és el següent moviment de les 'X' i el coŀlocarà al tauler.
 */
public class TresEnRatlla {
    public static void main(String[] args){
        // declaració del tauler
        char[][] tauler = new char[3][3];

        // inicialització de la fila 0
        tauler[0][0] = ' ';
        tauler[0][1] = 'O';
        tauler[0][2] = 'O';

        // inicialització de la fila 1
        tauler[1][0] = ' ';
        tauler[1][1] = 'X';
        tauler[1][2] = ' ';

        // inicialització de la fila 2
        tauler[2][0] = ' ';
        tauler[2][1] = ' ';
        tauler[2][2] = 'X';

        // mostra la posició inicial del tauler
        System.out.println("La posició inicial del taulell:");
        mostraFila(tauler[0]);     // mostra la línia 0
        mostraFila(tauler[1]);     // mostra la línia 1
        mostraFila(tauler[2]);     // mostra la línia 2

        // demana coordenades del moviment del jugador X
        System.out.println("Fila del següent moviment?");
        int fila = Integer.parseInt(Entrada.readLine());
        System.out.println("Columna del següent moviment?");
        int columna = Integer.parseInt(Entrada.readLine());

        // marquem el nou moviment
        // Comprovem que les coordenades siguin vàlides i que la casella estigui buida
        if ((fila>=0 && fila<=2) && (columna>=0 && columna<=2) && tauler [fila][columna] == ' '){
            tauler[fila][columna] = 'X';
        
        // tornem a mostrar el tauler (Amb la 'X' que hem afegit
        System.out.println("La posició final del taulell:");
        mostraFila(tauler[0]);     // mostra la línia 0
        mostraFila(tauler[1]);     // mostra la línia 1
        mostraFila(tauler[2]);     // mostra la línia 2
        }
        else{
            System.out.println("Error");
        }
    }

    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        for (int col=0; col<3; col ++) {
            System.out.print(fila[col]);
        }
        System.out.println();
    }
}
