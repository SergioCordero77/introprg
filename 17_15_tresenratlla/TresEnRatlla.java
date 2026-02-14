/* El joc començarà amb el tauler en blanc i anirà demanant moviments alternativament a cada jugador.

Els jugadors són ㄨ i 〇. Sempre començarà el jugador ㄨ.

El joc finalitzarà quan passi una de les següents situacions:

- Un jugador abandona entrant el valor "a" (no importen majúscules) en comptes d'una coordenada vàlida: El programa indicarà que el jugador ha abandonat.

- Un jugador aconsegueix el tres en ratlla: El programa indicarà que el jugador ha guanyat.

- Totes les caselles estan ocupades: El programa indicarà que hi ha hagut un empat.

La manera d'indicar les coordenades del moviment serà amb la fila i la columna seguides. Per exemple, la casella (0,0) s'indicarà amb "00" i la (1, 2) amb "12".

Quan es processa una coordenada, es consideraran els següents casos:

- Format incorrecte: l'entrada no està formada per dos dígits entre 0 i 2: Es mostra un missatge d'error i es torna a demanar moviment al mateix jugador.

- Casella ocupada: l'entrada correspon a una casella que ja ha estat marcada: Es mostra un missatge indicant que la casella està ocupada i es torna a demanar moviment al mateix jugador.

- Casella lliure: l'entrada correspon a una casella buida.

Es marca la casella i es mostra el resultat. Si el moviment no finalitza el joc, passa el torn a l'altre jugador.

MÓDULS
######
A banda, el teu codi haurà d'incloure com a mínim, els següents mòduls:

- mostraTaulell(char[][]): permet mostrar el contingut del tauler

- boolean casellaOcupada(char[][], int fila, int columna): retorna cert quan està ocupada la casella corresponent a la fila i columna

- boolean jugadorGuanya(char[][], char jugador): retorna cert quan el jugador ha fet un tres en ratlla al tauler. Espera que jugador tingui com a valor 'X' o 'O'.

- boolean hiHaEmpat(char[][]): retorna cert quan ja no es poden fer més moviments.
 */
public class TresEnRatlla {
    
    public static void main(String[] args) {
             
        System.out.println("Comença el joc");
        
        // declara i inicialitza el tauler
        char[][] tauler = new char [3][3];
        
        for (int fila = 0; fila<3; fila++){
            for(int col = 0; col<3; col++){
                tauler[fila][col] = '·';
                
                System.out.print(tauler [fila][col]);
            }
            System.out.println(); 
        }
        while(true){
            
            //Torn del jugador 'X'
            while (true){
            System.out.println("X?");
            char jugador = 'X';
            String coordenada = Entrada.readLine();
                
                // Comprova si el jugador abandona la partida
                if (coordenada.equals ("a") || coordenada.equals ("A")){
                    System.out.println(jugador + " abandona");
                    return;
                }
                
                // Comprova si la longitud de les coordenades es correcte
                if (coordenada.length() != 2){
                    System.out.println ("Error");
                }
                else{
                    int fila = coordenada.charAt(0) - '0';
                    int columna = coordenada.charAt(1) - '0';
                    
                    if (!(fila>=0 && fila<=2) || !(columna>=0 && columna<=2)){
                        System.out.println("Coordenades incorrectes");                   
                    }
                    else if (casellaOcupada(tauler, fila, columna)){
                            System.out.println("Posició ocupada");
                    }
                    else{ // Si les coordenades són correctes
                        if (tauler [fila][columna] == '·'){
                            tauler [fila][columna] = jugador;
                                
                            mostraTaulell(tauler);
                        }
                    
                        // Comprova si s'ha guanyat o s'ha empatat 
                        if (jugadorGuanya(tauler, jugador)){
                            System.out.println (jugador + " Guanya");
                            return;
                        }
                        else if (hiHaEmpat(tauler)){
                            System.out.println ("Empat");
                            return;
                        }
                        
                        break;
                    }
                }
            }
            
            //Torn del jugador 'O'
            while (true){
            System.out.println("O?");
            char jugador = 'O';
            String coordenada = Entrada.readLine();
                
                if (coordenada.equals ("a") || coordenada.equals ("A")){
                    System.out.println(jugador + " abandona");
                    return;
                }
                
                if (coordenada.length() != 2){
                    System.out.println ("Error");
                }
                else{
                    int fila = coordenada.charAt(0) - '0';
                    int columna = coordenada.charAt(1) - '0';
                    
                    if (!(fila>=0 && fila<=2) || !(columna>=0 && columna<=2)){
                        System.out.println("Coordenades incorrectes");                   
                    }
                    else if (casellaOcupada(tauler, fila, columna)){
                            System.out.println("Posició ocupada");
                    }
                    else{ // Si les coordenades són correctes
                        if (tauler [fila][columna] == '·'){
                            tauler [fila][columna] = jugador;
                                
                            mostraTaulell(tauler);
                        }
                    
                        // Comprova si s'ha guanyat o s'ha empatat 
                        if (jugadorGuanya(tauler, jugador)){
                            System.out.println (jugador + " Guanya");
                            return;
                        }
                        else if (hiHaEmpat(tauler)){
                            System.out.println ("Empat");
                            return;
                        }
                        
                        break;
                    }
                }
            }
        }
    }
    
    public static void mostraTaulell(char[][] tauler){
        for (int fila = 0; fila<3; fila++){
            for(int col = 0; col<3; col++){
                System.out.print(tauler [fila][col]);
            }
            System.out.println(); 
        }
    }
    
    public static boolean casellaOcupada(char[][] tauler, int fila, int columna){
        if (tauler [fila][columna] != '·'){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean jugadorGuanya(char[][] tauler, char jugador){
        if ((tauler [0][0] == jugador && tauler [0][1] == jugador && tauler [0][2] ==jugador) ||    //fila 1
            (tauler [1][0] == jugador && tauler [1][1] == jugador && tauler [1][2] == jugador) ||   //fila 2
            (tauler [2][0] == jugador && tauler [2][1] == jugador && tauler [2][2] == jugador) ||   //fila 3
            (tauler [0][0] == jugador && tauler [1][0] == jugador && tauler [2][0] == jugador) ||   //columna 1
            (tauler [0][1] == jugador && tauler [1][1] == jugador && tauler [2][1] == jugador) ||   //columna 2
            (tauler [0][2] == jugador && tauler [1][2] == jugador && tauler [2][2] == jugador) ||   //columna 3
            (tauler [0][0] == jugador && tauler [1][1] == jugador && tauler [2][2] == jugador) ||   //diagonal 1
            (tauler [0][2] == jugador && tauler [1][1] == jugador && tauler [2][0] == jugador)){    //diagonal 2
            
            return true;
        }
        else{
            return false;
        }
    }
                 
    public static boolean hiHaEmpat(char[][] tauler){
        boolean hihaPunt = false;
        
        for (int fila = 0; fila<3; fila++){
            for(int col = 0; col<3; col++){
                if (tauler [fila][col]!= '·'){
                    hihaPunt = true;
                }
                else{
                    return false;
                } 
            } 
        }
        return hihaPunt;
    }
}
