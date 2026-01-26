/*
 * Programa que representa una situació del joc "Tres en ratlla".
 La representació del joc es realitzarà tenint present que:

el tauler estarà implementat amb tres arrays de caràcters que representaran cadascuna de les files

cada posició es codificarà amb un de tres possibles caràcters (X, O o ·) El punt indicarà que la posició encara no està marcada.
 */
public class TresEnRatlla {
    public static void main(String[] args){
        // declaració de les files
        char[] fila0 = new char[3];
        char[] fila1 = new char[3];
        char[] fila2 = new char[3];

        // inicialització de la fila 0
        fila0[0] = 'O';
        fila0[1] = '·';
        fila0[2] = 'X';

        // inicialització de la fila 1
        fila1[0] = 'X';
        fila1[1] = 'X';
        fila1[2] = 'O';

        // inicialització de la fila 2
        fila2[0] = 'O';
        fila2[1] = '·';
        fila2[2] = '·';

        // mostra el tauler
        mostraFila(fila0);
        mostraFila(fila1);
        mostraFila(fila2);
    }

    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        for (int col=0; col<3; col++) {
            System.out.print(fila[col]);
        }
        System.out.println();
    }
}
