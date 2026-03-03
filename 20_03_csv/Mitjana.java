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
        int numNotes=0;
        
        // Nombre d'examens que volem analitzar
        String numero = args[0];
        if (numero.isEmpty()){
            numero = "6";
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
                    
                    for (int files=0; files<numLinies; files++){
                        if(files==0){
                            continue;
                        }
                        else{
                            for (int i=4; i<nombre; i++){
                                String text = array[i];
                                
                                if (text !=","){
                                    numNotes ++;
                                }
                                
                                boolean esDigit = false;
                                
                                for (int j=0; j<text.length(); j++){
                                    char c = text.charAt(j);
                                    
                                    if(Character.isDigit(c)){
                                        esDigit = true;
                                    }
                                    else{
                                        esDigit = false;
                                    }
                                }
                                
                                if(esDigit){
                                    suma += Integer.parseInt(text);
                                }
                            }
                            
                            //Imprimim resultat final
                            for (int i=0; i<3; i++){
                                String text = array[i];
                                
                                System.out.print (text);
                            }
                            System.out.println("(" + suma/nombre + ")");
                        }
                    }
                }
                numLinies ++;
            }
        }
    input.close();
    }
}


