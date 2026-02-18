/*
 * Programa que crea còpies de les matrius i substitueix els caràcters sense modificar les taules originals
 */
public class UtilTaula{

    public static char [][] substitueix (char[][] taula, char inici, char fi){
        
        char [][] substituta = new char [taula.length][taula[0].length];
        
        for (int fila=0; fila<taula.length; fila++){
            for (int col=0; col<taula[fila].length; col++){
                
                if (taula [fila][col] == inici){
                    substituta [fila][col] = fi;
                }
                else{
                    substituta [fila][col] = taula[fila][col];
                }
            }
        }
        return substituta;
    }
}
