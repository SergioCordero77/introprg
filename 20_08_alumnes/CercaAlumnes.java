import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class CercaAlumnes {

    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }

    public static Alumne construeixAlumne(String nom, String email,
                                          int edat, boolean esOient,
                                          int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
        System.out.println ("Alumne: " + alumne.nom);
        System.out.println ("- email: " + alumne.email);
        System.out.println ("- edat: " + alumne.edat);
        
        if (alumne.esOient){
            System.out.println ("- és oïent: Sí");
        }
        else{
            System.out.println ("- és oïent: No");
        }
        
        System.out.println ("- notes: " + notesACsv(alumne.notes));
    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", " +
                "edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }

    // converteix un array de notes a CSV
    // Té en comptes els valors NP com a -1
    public static String notesACsv(int[] notes) {
        String cadenaNotes = "";
        
        for (int i=0; i<notes.length; i++){
            String nota = "" + notes[i];
            
            if (notes[i] == -1){
                nota ="NP";
            }
            
            if (i == notes.length-1){
                cadenaNotes += nota;
            }
            else{
                cadenaNotes += nota + ",";
            }
        }
        return cadenaNotes;
    }

    public static String alumneACsv(Alumne alumne) {
        // XXX a completar encara que no es fa servir en aquest programa
        return alumne.nom;
    }

    public static Alumne csvAAlumne(String csv) {
        
        String[] valors = UtilString.separa(csv, ','); // Creem array amb els valors de la linia del csv
        
        //Creació de les variables d'Alumnes
        String nom = "";
        String email = "";
        int edat = 0;
        boolean esOient = false;
        
        int cont = 0; //Comptador per saber quantes posicions seràn necessaries per a crear l'array de notes
        
        for(int i=0; i<valors.length; i++){
            String parametre = valors [i];
            
            if (i==0){
                nom = parametre;
            }
            else if (i==1){
                email = parametre;
            }
            else if (i==2){
                edat = Integer.parseInt(parametre);
            }
            else if (i==3){
                if (parametre.equals("false")){
                    esOient = false;
                }
                else{
                    esOient = true;
                }
            }
            else if (i>=4){
                cont ++;
            } 
        }
        
        int[] notes = new int [cont];
        
        for(int i=4; i<valors.length; i++){
            String nota = valors [i];
            
            if (nota.equals("NP")){
                nota = "-1";
            }
            
            notes [i-4] = Integer.parseInt(nota);
        }
        return construeixAlumne(nom, email, edat, esOient, notes);
    }
    
    public static String normalitzaTextiBlancs (String text){
        return UtilString.normalitzaBlancs(UtilString.normalitzaText(text).toLowerCase());
    }

    public static void main(String[] args) throws IOException {
        // assegura que hi ha el criteri de cerca
        if(args.length == 0){
            System.out.println("No es troba alumne");
        }
        else{
        // declaracions, inicialitzacions, apertura de fitxer, ignora línia de capçaleres, etc.
        String cami = "alumnes.csv";
        String parametreNormalitzat = normalitzaTextiBlancs(args[0]);
        
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        
        input.readLine(); //Llegeix la primera linia (capçalera)

        boolean alumneTrobat = false;

        while (true) {
            // llegeix entrada i finalitza bucle si no en queden més
            String linia = input.readLine();
            if(linia == null){
                break;
            }
            else{
            // converteix l'entrada a Alumne
                Alumne alumne = csvAAlumne(linia);

            // comprova si el criteri de cerca es troba dins del nom o
            // el email. Si és així, mostra'l
                String[] email = UtilString.separa(alumne.email, '@'); //Separem l'email en un array de 2 on 0 es l'usuari i 1 es l'extensió de l'email
                
                String nomNormalitzat = normalitzaTextiBlancs(alumne.nom);
                String usuariNormalitzat = normalitzaTextiBlancs(email[0]);
            
                if (nomNormalitzat.contains(parametreNormalitzat)
                    ||
                    usuariNormalitzat.contains(parametreNormalitzat)){
                    mostraAlumne(alumne);
                    alumneTrobat = true;
                }
            }
        }
        
        if (!alumneTrobat){
            System.out.println("No s'ha trobat cap alumne");
        }
        
        // consideracions finals com ara el tancament del fitxer
        input.close();
        }
    }
}
