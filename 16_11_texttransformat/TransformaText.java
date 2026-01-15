/*
 * Programa que demana un text i mostra una versió transformada segons les següentes regles:
 -Les vocals (les catalanes) apareixeran en minúscules
 -Les lletres no vocals apareixeran en majúscules
 -Els nombres (atenció, no els dígits!) apareixeran entre parèntesis ()
 -La resta de caràcters, excepte els blancs, desapareixen a la versió transformada

Simulació:
Text?
Avui faig 19 anys!
aVui FaiG (19) aNYS
 */
public class TransformaText{
    public static void main (String [] args){
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    String nombre="";
    
    for(int i=0; i<text.length(); i++){
        char c = text.charAt(i);
        
        if (Character.isDigit(c)){
            if (i==0 && Character.isDigit(c)){
                System.out.print("(" + c);
            }
        
            if (i==text.length()-1 && Character.isDigit(c)){
                System.out.print(c + ")");
            }
        
            if (i > 0 && i < text.length() - 1) {
                char anterior = text.charAt(i - 1);
                char posterior = text.charAt(i + 1);
            
                if (!Character.isDigit(anterior) && Character.isDigit(c) && Character.isDigit(posterior)){
                    System.out.print("(" + c);
                }
                else if (Character.isDigit(anterior) && Character.isDigit(c) && !Character.isDigit(posterior)){
                    System.out.print(c + ")");
                }
            }
        }
        else{
            System.out.print(c);  
        }
    }
        
    System.out.println();
    
    }
}

