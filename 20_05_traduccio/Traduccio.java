/*
 * Programa que rep tres fitxers per línia de comandes.
 * El primer fitxer és el fitxer origen, que conté un text.
 * El segon és un fitxer csv amb parelles de paraules separades
 * per una coma (clau, valor) que indiquen quines paraules
 * s'han de substituir.
 * El tercer fitxer és el fitxer destinació, on s'escriurà
 * el text final amb les traduccions aplicades.
 *
 * El programa llegeix el fitxer origen línia per línia i
 * reemplaça totes les claus pels valors corresponents segons
 * el fitxer de traducció.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Traduccio {
    public static void main(String[] args) throws IOException {
        String cami = "origen.txt";
        String traduccio = "traduccio.csv";
        String destinacio = "destinacio.txt";
        
        tradueix(cami, traduccio, destinacio);
                                    
    }
    
    public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException{
        // Fitxer origen.txt
        FileReader fileReaderOrigen = new FileReader(fitxerOrigen);
        BufferedReader inputOrigen = new BufferedReader(fileReaderOrigen);
        
        // Fitxer destinacio.txt
        BufferedWriter sortida = new BufferedWriter(new FileWriter(fitxerDestinacio));  // obrir
        
        String liniaOrigen = inputOrigen.readLine(); // Lectura de la linia
        
        if (liniaOrigen.isBlank()){
            return;
        }
        else{
            while (true) {
                           
                    if (null == liniaOrigen){ 
                        break;
                    }
                    else{
                        
                        String traduccioFinal = tradueixLinia (liniaOrigen, fitxerTraduccio);
                        
                        sortida.write(traduccioFinal);    // escriure
                        sortida.newLine();  // salt de linia
                        
                        liniaOrigen = inputOrigen.readLine(); // Tornem a llegir la linia
                    }
            }           
            inputOrigen.close();
            sortida.close();
        }
    }
    
    public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException{
        
        // Fitxer traduccio.csv
        FileReader fileReader = new FileReader(fitxerTraduccio);
        BufferedReader input = new BufferedReader(fileReader);
        
        String liniaTraduccio = input.readLine(); // Lectura de la linia 
        
        while (true) {
                        
            if (null == liniaTraduccio){ 
                break;
            }
            else{
                
                String[] array = UtilString.separa(liniaTraduccio);
                
                if (array.length != 2){
                    continue;
                }
                
                linia = linia.replace(array[0], array[1]);
                
                liniaTraduccio = input.readLine(); // Tornem a llegir la linia
            }
        }
        input.close();
        
        return linia;    
    }
}
