/*
 * Programa que va demanant texts fins trobar la cadena buida o en blanc. Per cada text, indicarà si és o no igual al primer, tot ignorant els espais sobrers que hi puguin tenir cadascú dels dos texts.
 El primer text no el compararà amb cap d'anterior.
 
 Simulació:
 
 ·java·ForaEspaisSobrers
 El·lloro·espera·un·text
 ···hola····i····adéu···
 El·lloro·respon:·"hola·i·adéu"
 El·lloro·espera·un·text
 ·
 El·lloro·s'acomiada·atentament
 */
public class ForaEspaisSobrers{
    public static void main (String [] args){
    
    System.out.println("El lloro espera un text");
    String text = Entrada.readLine();
    
    while(!text.isEmpty()){
            
        System.out.println("El lloro respon: " + normalitzaBlancs(text));
        
        System.out.println("El lloro espera un text");
        text = Entrada.readLine();
    
    }
    
    System.out.println("El·lloro·s'acomiada·atentament");
    
    }
    
    public static String normalitzaBlancs (String text){
        String textNormalitzat="";
    
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            
            
            if (i<text.length()-1){ 
                char cPost = text.charAt(i+1); 
                
                if (Character.isWhitespace(c) && Character.isLetter(cPost)){ 
                    textNormalitzat += '·'; } 
                else if (!Character.isWhitespace(c)){ 
                    textNormalitzat += c; 
                } 
            }            
        }
        return textNormalitzat;
    }
}
