/*
 * Programa que llegeix per linia de comandes com si fossin camins del sistema de fitxer.
 *
 * Per cada argument, comprovarà si correspon a un camí existent.
 *
 * Si no existeix, indicarà "No trobat".
 *
 * En cas que existeixi, indicarà els seus permisos per l'usuari en el format típic de GNU (rwx).
 *
 * A continuació, indicarà si correspon a un fitxer o un directori.
 *
 * En cas de ser un directori, mostrarà el nom dels fitxers i directoris que contingui. 
 * Ho farà de manera ordenada (Pista: recorda Arrays.sort())
 *
 * Si és un fitxer, indicarà la seva longitud en bytes.
 *
 * En cas que es pugui llegir i que la seva extensió sigui una de les conegudes, 
 * el programa mostrarà el seu contingut envoltant cada línia entre dos caràcters | per permetre distingir espais.
 *
 * Es consideraran extensions conegudes .java i .txt.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
public class Inspecciona{
    public static void main (String [] args) throws IOException {
    
        if (args.length == 0){
            System.out.println ("Res a fer");
        }
        else{
            for (int i=0;  i<args.length; i++){
                String argument = args [i];
                
                String cami = argument;
                File fitxer = new File(cami); // Fitxer assosciat a cami
                
                String missatge = "Processant argument: " + argument;
                System.out.println(missatge);
                
                for (int j=0; j<missatge.length(); j++){
                    System.out.print("=");
                }
                
                System.out.println();
                System.out.println();
                
                    if (! fitxer.exists()) {
                        System.out.println("No trobat");
                        System.out.println();
                        continue;
                    }
                    else{
                        if (fitxer.isDirectory()){
                            String[] continguts = fitxer.list(); // Declarem al llista del contingut del directori
                            
                            if(continguts.length>0){
                                mostraPermisos(fitxer);
                            
                                Arrays.sort(continguts); //Ordenem els contingut alfabeticament
                                
                                for(int j=0; j<continguts.length; j++){
                                    String item = continguts[j];
                                    
                                    if (j==continguts.length-1){
                                        System.out.print(item);
                                    }
                                    else{
                                        System.out.print(item + ", ");
                                    }
                                }
                                System.out.println();
                            }
                            else{
                                mostraPermisos(fitxer);
                                
                                System.out.println("directori buit");
                            }
                        }
                        else if (fitxer.isFile()){
                            if (fitxer.length()>0){
                                mostraPermisos(fitxer);
                            
                                System.out.println("fitxer de mida en bytes: " + fitxer.length());
                                
                                //Declarem i obrim el fitxer per analitzar-lo linia a linia
                                FileReader fileReader = new FileReader (fitxer);
                                BufferedReader input = new BufferedReader (fileReader);
                                
                                System.out.println("Amb els contingut: ");
                                while (true){
                                    String linia = input.readLine();
                                    if (linia==null){
                                        break;
                                    }
                                    else{
                                        System.out.println("|" + linia + "|");
                                    }
                                }
                                input.close();
                            }
                            else{
                                mostraPermisos(fitxer);
                            
                                System.out.println("fitxer buit");
                            }
                        }
                        System.out.println();
                    }
            }   
        }
    }
    
    public static void mostraPermisos(File fitxer){
        //Si té permisos de lectura
        if (fitxer.canRead()){
            System.out.print("r");
        }
        else{
            System.out.print("-");
        }
        //Si té permisos d'escritura
        if (fitxer.canWrite()){
            System.out.print("w");
        }
        else{
            System.out.print("-");
        }
        //Si té permisos d'execució
        if (fitxer.canExecute()){
            System.out.print("x ");
        }
        else{
            System.out.print("- ");
        }
    }
}
