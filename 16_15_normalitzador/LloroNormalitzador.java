/*
 * Programa que va demanant texts i mentre no rebi la cadena buida, els retorni normalitzats de la següent manera:

- Les vocals catalanes amb accent apareixeran en la seva variant sense accent.
- La ç apareixerà com a c.
 */
public class LloroNormalitzador{
    public static void main (String [] args){
    
    System.out.println("El lloro espera un text");
    String text = Entrada.readLine();
    
    while(!text.isEmpty()){
        
        System.out.println("El lloro respon: " + UtilString.normalitzaText(text));
        
        System.out.println("El lloro espera un text");
        text = Entrada.readLine();
    }
    
    System.out.println("El lloro s'acomiada atentament");
    
    }
}
