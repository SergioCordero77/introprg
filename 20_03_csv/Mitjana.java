/*
 * Programa que mostra les linies d'un fitxer en el qual la linia comença i acaba per vocal.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Mitjana {
    public static void main(String[] args) throws IOException {
        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        
        int numLinies=0;
        
        
        // Nombre d'examens que volem analitzar
        String numero = "";
        
        if (args.length == 0){
            numero = "6";
        }
        else{
            numero = args[0];
        }
        
        int nombre = Integer.parseInt(numero);
       
        while (true) {
            String linia = input.readLine(); // Lectura de la linia
            if (null == linia){ 
                break;
            }
            else{
                if (numLinies != 0){
            
                    String[] array = UtilString.separa(linia);
                    
                    int suma = 0;
                    int numNotes=0;
                    
                    for (int i=4; i<(4 + nombre); i++){
                        if (i >= array.length){
                            break;
                        }
                        
                        String text = array[i];
                        
                        if (!text.isEmpty()){
                            
                        if(UtilString.esEnter(text)){ 
                            suma += Integer.parseInt(text);
                            numNotes++;
                        }
                        }
                    }
                    
                    //Imprimim resultat final
                    for (int i=0; i<3; i++){
                        String text = array[i];
                        
                        System.out.print (text + " ");
                    }
                    
                    if (numNotes > 0){
                        System.out.println("(" + suma/numNotes + ")");
                    }    
                }
                numLinies ++;
            }
        }
        input.close();
    }
}


