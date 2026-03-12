import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ConsultaNota{
    public static void main (String [] args) throws IOException{
    
        String cami = "notes.csv";
        
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        
        while(true){
            System.out.println("Alumne:");
            String alumne = Entrada.readLine();
            
                if (alumne.isBlank()){
                    return;
                }
                else{
                    System.out.println("Prova:");
                    String prova = Entrada.readLine();
                    
                        if (prova.isBlank()){
                            return;
                        }
                }
        }
        input.close();
        
        }
    
    public static String[] carregaAlumnes(String nomFitxer) throws IOException{
        
        FileReader fileReader = new FileReader(nomFitxer);
        BufferedReader input = new BufferedReader(fileReader);
        
        int cont = 0;      
        
        //Comptem quantes linies hi ha en el fitxer per saber quant llarga ha de ser l'array
        while(true){
            String linia = input.readLine(); // Lectura de la linia
            if (null == linia){ 
                break;
            }
            else{
                
                if (linia.isBlank()){
                    continue;
                    }
                    
                cont ++;
            }
        }
        input.close(); // tanquem
        
        //Tornem a obrir el fitxer
        FileReader fileReader2 = new FileReader(nomFitxer);
        BufferedReader input2 = new BufferedReader(fileReader2);
        
        String[] alumnes = new String [cont-1]; // Se li resta 1 perque la primera linia no la volem
        
        int contArray = -1;
        int conLinia = 0;
        
        // Treballem l'array per extreure l'String
        while(true){
            String linia = input.readLine(); // Lectura de la linia
            
            if (null == linia){ 
                break;
            }
            else{
                if(linia.isBlank()){
                    continue;
                }
                
                contLinia ++;
                
                if (contLinia != 0){
                    contArray ++;
                
                    String[] array = UtilString.separa(linia); // Creem l'array a partir de la linia
                    
                    //Agreguem el nom a l'array d'alumnes
                    alumnes [contArray] = array [0];
                }
            }
        }
        input2.close();
        return alumnes;
    }
    
    public static String[] carregaProves(String nomFitxer) throws IOException{
        
        FileReader fileReader = new FileReader(nomFitxer);
        BufferedReader input = new BufferedReader(fileReader); //obrir
        
        int cont = 0;
        
        while(true){
            String linia = input.readLine(); // lectura
            if (linia == null){
                break;
            }
            else{
                if (linia.isBlank()){
                    continue;
                }
                else{
                    String[] array = UtilString.separa(linia); // Creem l'array a partir de la linia
                    
                    String[] notes = new String [array.length-1];
                    
                    
                    // El for comença amb i=1 perque el '0' correspon al nom de l'alumne
                    for (int i=1; i<array.length; i++){
                        
                        notes[i] = array [i];
                    }
                    return notes;
                }
        }
        input.close(); //tanquem
    }
    
    public static int[][] carregaNotes(String nomFitxer, int numAlumnes, int numProves) throws IOException{
        
        FileReader fileReader = new FileReader(nomFitxer);
        BufferedReader input = new BufferedReader(fileReader); //obrir
        
        // inicialitzem la taula de notes
        int [][] notes = new int [numAlumnes][numProves];
        
        for (int fila=0; fila<notes.length; fila++){
            for(int col=1; col<notes[fila].length; col++){
                String linia = input.readLine(); //lectura
                
                String[] array = UtilString.separa(linia);
                
                notes [fila][col] = Integer.parseInt(array[col]);
            }
        } 
        
        input.close(); //tanquem
    }
    
    public static int filaAlumne(String nomAlumne, String[] alumnes) throws IOException{
        
        for(int i=0; i<alumnes.length; i++){
            String nom = alumnes[i];
            
            //Es troba el nom de l'alumne
            if (nom==nomAlumne){
                return i;
            }
        }
        return -1;
    }
    
    public static int columnaProva(String nomProva, String[] proves){
        
        for(int i=0; i<proves.length; i++){
            String prova = proves[i];
            
            //Es troba el nom de la prova
            if (prova==nomProva){
                return i;
            }
        }
        return -1;
    }
}
