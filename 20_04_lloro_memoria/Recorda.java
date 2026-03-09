/*
 * Programa demana frases per l'entrada estàndard i les va
 * guardant en un fitxer anomenat "records.txt".
 *
 * El programa va registrant totes les frases que l'usuari escriu
 * fins que rep una línia buida. Quan això passa, el programa
 * deixa de registrar i passa a la fase de record.
 *
 * En la fase de record es llegeixen les frases guardades al
 * fitxer i es mostren per pantalla.
 *
 * El programa no guarda línies buides i també ignora els
 * espais en blanc al principi i al final de cada frase.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Recorda {
    public static void main(String[] args) throws IOException {
        String cami = "records.txt";
        
        processaEntrada(cami);
        
        System.out.println("D'acord");
        mostraRecords(cami);                             
    }
    
    public static void processaEntrada (String cami) throws IOException{
        System.out.println("El lloro pregunta paraula:");
        String text = Entrada.readLine();
        
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami));  // obrir
        
        while (!text.isEmpty()){
            
            String normalitzat = UtilString.normalitzaBlancs (text);
            
            System.out.println("El lloro registra: " + normalitzat);
            
            sortida.write(normalitzat);    // escriure
            sortida.newLine();  // salt de linia
            
            
            System.out.println("El lloro pregunta paraula:");
            text = Entrada.readLine();
        }
        sortida.close();    // tancar
    }
    
    public static void mostraRecords (String cami) throws IOException{
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        
        String linia = input.readLine(); // Lectura de la linia
        
        if (linia == null){
            System.out.println("El lloro no recorda res");
        }
        else{
            while (true) {             
                if (null == linia){ 
                    break;
                }
                else{
                    System.out.println("El lloro recorda: " + linia);
                    linia = input.readLine(); // Lectura de la linia
                }
            }    
        }
        System.out.println("Adéu");    // escriure
        input.close();
    }
}
