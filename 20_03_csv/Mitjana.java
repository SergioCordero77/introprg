/*
 * Programa que llegeix un fitxer CSV anomenat "notes.csv" que conté
 * el nom dels alumnes i les seves notes.
 * 
 * El programa calcula la mitjana de notes per a cada alumne segons
 * el nombre d'exàmens indicat per paràmetre. Si no s'indica cap
 * paràmetre, es consideren 6 exàmens per defecte.
 * 
 * Les notes "NP" es consideren com a 0 en el càlcul de la mitjana.
 * Finalment es mostra per pantalla el nom de cada alumne i la seva
 * mitjana amb dos decimals.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Mitjana {
    public static void main(String[] args) throws IOException {
        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        //input.readLine();
        
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
        
        System.out.println ("Càlcul de la mitjana de notes per " + nombre + " exàmens");
       
        boolean hihaNotes = false;
        
        while (true) {
            String linia = input.readLine(); // Lectura de la linia
            if (null == linia){ 
                break;
            }
            else{
                if (numLinies != 0){
                
                    if (linia.isBlank()){
                    continue;
                    }
                    
                    String normalitzada = UtilString.normalitzaBlancs (linia);
            
                    String[] array = UtilString.separa(normalitzada);
                    
                    int suma = 0;
                    
                    for (int i=1; i<1 + nombre; i++){
                        if (i >= array.length){
                            break;
                        }
                        
                        String text = array[i];
                        
                        if (!text.isEmpty()){
                        
                            if(text.equals("NP")){
                                text = "0";
                            }
                            
                            if(UtilString.esEnter(text)){ 
                                suma += Integer.parseInt(text);
                                hihaNotes = true;
                            }
                        }
                    }
                    
                    //Imprimim resultat final
                    for (int i=0; i<1; i++){
                        String text = array[i];
                        
                        if (text.charAt(text.length()-1) == ' '){
                            System.out.print (text);
                        }
                        else{
                            System.out.print (text + " ");
                        }
                    }
                    

                        double mitjana = (double)suma / nombre;
                        System.out.printf("(%.2f)\n", mitjana);
                    
                }
                numLinies ++;
            }
        }
        
        if (!hihaNotes){
            System.out.println ("El fitxer notes.csv no conté cap nota.");
        }
        
        input.close();
    }
}


