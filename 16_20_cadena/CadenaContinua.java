/*
 * Programa que demana un text i un nombre enter per entrada estàndard.
 Si el text introduït és buit o només conté espais en blanc, el programa mostra "error".
 Si el text és vàlid, demana un nombre. Si el nombre és un enter correcte (segons el mètode UtilString.esEnter), el programa mostra per pantalla el resultat de repetir el text fins a obtenir una cadena amb tants caràcters com indica el nombre.
 En cas que el nombre no sigui un enter vàlid, mostra "error".
 */
public class CadenaContinua{
    public static void main (String [] args){
    System.out.println("Text?");
    String text = Entrada.readLine();
    
        if (text.isBlank()){
            System.out.println("error");    
        }
        else{
            System.out.println("Nombre?");
            String nombre = Entrada.readLine();        
                
                if (UtilString.esEnter(nombre)){
                    System.out.println(UtilString.cadenaContinua(text, UtilString.aEnter(nombre)));
                }
                else{
                    System.out.println("error");
                }
    
        }
    }
}
