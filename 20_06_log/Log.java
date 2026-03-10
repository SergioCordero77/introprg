import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Log{
    
    private static int CONT = 0;
    
    public static String printError(String mensaje) throws IOException{
        String cami = "log.txt";
        
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));  // obrir
        
        CONT ++;
         
        String missatge = "["+CONT+"]" + " ERROR: " + mensaje;
        
        sortida.write(missatge); //escriure
        sortida.newLine();  // salt de linia
        
        sortida.close();
        
        return missatge;
    }

    public static String printWarning(String mensaje)throws IOException{
        String cami = "log.txt";
        
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));  // obrir
        
        CONT ++;
         
        String missatge = "["+CONT+"]" + " WARNING: " + mensaje;
        
        sortida.write(missatge); //escriure
        sortida.newLine();  // salt de linia
        
        sortida.close();
        
        return missatge;
    }

    public static String printInfo(String mensaje)throws IOException{
        String cami = "log.txt";
        
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));  // obrir
        
        CONT ++; 
         
        String missatge = "["+CONT+"]" + " INFO: " + mensaje; 
        
        sortida.write(missatge); //escriure
        sortida.newLine();  // salt de linia
        
        sortida.close();
        
        return missatge;
    }

    public static String printDebug(String mensaje)throws IOException{
        String cami = "log.txt";
        
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));  // obrir
        
        CONT ++;
         
        String missatge = "["+CONT+"]" + " DEBUG: " + mensaje;
        
        sortida.write(missatge); //escriure
        sortida.newLine();  // salt de linia
        
        sortida.close();
        
        return missatge;
    }
    
    public static void reset(){
        CONT = 0;
    }
}
