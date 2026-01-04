/*
 * Programa que demana un text i un nombre enter. El programa mostrarà tants caràcter como indiqui el nombre, començant pel primer. En cas que en faltin, el programa tornarà a mostrar el text a partir del primer caràcter fins que hagi aconseguit tots els caràcters demanats.
 Si es demana menys d'un caràcter, no es motrarà res. En cas que el text sigui un text buit o en blanc, es motrarà un missatge d'error i finalitzarà el programa sense demanar la longitud de la cadena.
 */
public class CadenaContinua{
    public static void main (String [] args) {
    
    System.out.println("Text?");
    String text = Entrada.readLine();
        
        if (text.isBlank()){
            System.out.println("ERROR: el text no conté caràcters no blancs");    
        }
        else{
            System.out.println("Nombre?");
            int longitud = Integer.parseInt(Entrada.readLine());
            
            mostraCadenaContinua (text, longitud);
        }
    }
    
    public static void mostraCadenaContinua (String text, int longitud){
        //Impressió de resultat segons el valors
        if(longitud>=1){
            for (int i=0; i<longitud; i++){
                char c = text.charAt(i%text.length());    
                    
                    System.out.print(c);
                }
                System.out.println();
        }
    }       
}
