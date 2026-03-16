import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ConsultaNota{
    public static void main (String [] args) throws IOException{
    
        String cami = "notes.csv";
        
        while(true){
            // Variables obtingudes dels diferents móduls
            int numAlumnes = carregaAlumnes(cami).length;
            int numProves = carregaProves(cami).length;
        
            System.out.println("Alumne:");
            String alumneNoFiltrat = Entrada.readLine();
            String alumne = UtilString.normalitzaBlancs(UtilString.normalitzaText(alumneNoFiltrat));
                
                int fila = filaAlumne(alumne, carregaAlumnes(cami));
                
                if (alumne.isBlank()){
                    System.out.println("Arreveure");
                    return;
                }
                else if (fila == -1){
                    System.out.println("Alumne \""+ alumne +"\" no disponible");
                    continue;
                }
                else{
                    System.out.println("Prova:");
                    String provaNoFiltrada = Entrada.readLine();
                    String prova = UtilString.normalitzaBlancs(UtilString.normalitzaText(provaNoFiltrada));
                        
                        int col = columnaProva(prova, carregaProves(cami));
                        
                        if (prova.isBlank()){
                            System.out.println("Arreveure");
                            return;
                        }
                        else if (col==-1){
                            System.out.println("Prova \""+ provaNoFiltrada +"\" no disponible");
                            continue;
                        }
                        
                        int notaDemanada = 0;
                        
                        
                        int [][] taula = carregaNotes(cami, numAlumnes, numProves);
                        
                        if (taula[fila][col] == -1){
                            System.out.println("No Presentat");
                            continue;
                        }
                        else if (taula[fila][col] == -2){
                            System.out.println("Nota amb valor no numèric o fora de rang");
                            continue;
                        }
                        else if (taula[fila][col] == -3){
                            System.out.println("Nota no disponible");
                            continue;
                        }
                        else{
                            notaDemanada = taula[fila][col];
                        }
                        
                        System.out.println("Nota: " + notaDemanada);
                }
        }     
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
        
        //Tornem a obrir el fitxer per crear l'array
        FileReader fileReader2 = new FileReader(nomFitxer);
        BufferedReader input2 = new BufferedReader(fileReader2);
        
        input2.readLine(); // Lectura. Saltem la primera linia 'capçalera'
        
        String[] alumnes = new String [cont-1]; // Se li resta 1 perque la primera linia no la volem
        
        int contArray = 0;
        
        // Treballem l'array per extreure l'String
        while(true){
            String linia = input2.readLine(); // Lectura de la linia
            
            if (null == linia){ 
                break;
            }
            else{
                if(linia.isBlank()){
                    continue;
                }
                    
                String[] array = UtilString.separa(linia); // Creem l'array a partir de la linia
                
                //Agreguem el nom a l'array d'alumnes
                alumnes [contArray] = UtilString.normalitzaBlancs(UtilString.normalitzaText(array [0]));
                contArray ++;
            }
        }
        input2.close();
        return alumnes;
    }
    
    public static String[] carregaProves(String nomFitxer) throws IOException{
        
        FileReader fileReader = new FileReader(nomFitxer);
        BufferedReader input = new BufferedReader(fileReader); //obrir
        
        int cont = 0;
        
        String[] notes = null;
        
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
                    
                    notes = new String [array.length-1];
                    
                    for (int i=0; i<notes.length; i++){
                        
                        notes[i] = UtilString.normalitzaBlancs(UtilString.normalitzaText(array [i+1])); //'i+1' perque col=0 apunta al nom de l'estudiant
                    }
                    break;
                }
            }
        }
        input.close(); //tanquem
        return notes;
    }
    
    public static int[][] carregaNotes(String nomFitxer, int numAlumnes, int numProves) throws IOException {

        FileReader fileReader = new FileReader(nomFitxer);
        BufferedReader input = new BufferedReader(fileReader);
        
        input.readLine(); // lectura i saltem la primera linia 'capçalera'
        
        int [][] notes = new int [numAlumnes][numProves];
        
        for (int fila=0; fila<notes.length; fila++){
            
            String linia = input.readLine(); // 2a lectura
            
            if (linia.isBlank()){ 
                continue;
            }
            
            String[] array = UtilString.separa(linia);
            
            for(int col=0; col<notes[fila].length; col++){

                if (col+1 >= array.length){
                    notes[fila][col] = -3;   // no hi ha nota
                    continue;
                }

                if (UtilString.esEnter(UtilString.normalitzaBlancs(array[col+1]))){

                    int numero = Integer.parseInt(UtilString.normalitzaBlancs(array[col+1])); //'col+1' perque col=0 apunta al nom de l'estudiant

                    if(numero>=0 && numero<=100){
                        notes[fila][col] = numero;
                    }
                    else{
                        notes[fila][col] = -2;
                    }
                }
                else if (array[col+1].equals("NP")){
                    notes[fila][col] = -1;
                }
                else{
                    notes[fila][col] = -2;
                }
            }
        }
        input.close();
        return notes;
    }
    
    public static int filaAlumne(String nomAlumne, String[] alumnes) throws IOException{
        
        for(int i=0; i<alumnes.length; i++){
            String nom = UtilString.normalitzaBlancs(UtilString.normalitzaText(alumnes[i]));
            
            //Es troba el nom de l'alumne
            if (nom.equals(nomAlumne)){
                return i;
            }
        }
        return -1;
    }
    
    public static int columnaProva(String nomProva, String[] proves){
        
        for(int i=0; i<proves.length; i++){
            String prova = UtilString.normalitzaBlancs(UtilString.normalitzaText(proves[i]));
            
            //Es troba el nom de la prova
            if (prova.equals(nomProva)){
                return i;
            }
        }
        return -1;
    }
}
