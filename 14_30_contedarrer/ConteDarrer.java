/*
 * Programa que va demanant text fins que un no contingui el darrer caràcter. El primer text és acceptat sempre a no ser que sigui buit.
 */
 
public class ConteDarrer{
    public static void main (String [] args){
    
    System.out.println("Introdueix texts (enter sol per finalitzar)");
    String text = Entrada.readLine();
    
    String textAnterior = "";
    
    textAnterior = text;
    
    while (!text.isEmpty()){
        
        boolean trobat = false;        
        
            for (int i=0; i<text.length(); i++){
                char c = text.charAt(i);
                char cMaj = Character.toUpperCase(c);
                
         
                char cAnt = textAnterior.charAt(textAnterior.length()-1);
                char cAntMaj = Character.toUpperCase (cAnt);
                 
                    if (cMaj == cAntMaj){
                        System.out.println("bé");
                        trobat = true;
                        break;
                    }
            }
            
            if (!trobat){
                break;
            }
            
            textAnterior = text;
            
            text = Entrada.readLine();
    
    }
    
    System.out.println("Adéu");
    
    }
}
