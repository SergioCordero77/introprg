/*
 * Programa que demana un text i dos valors enters. El programa mostrarà els caracters que es troben entres els valors. En cas de que els valors quedin fora de rang el programa normalitzarà els números, per exemple, si es fica un número per sota del 0, aquest esdevindrà 0 i si el número es troba per sobre de rang de la longitud del text, esdevindrà al número que es igual al número de caràcters que hi haurà al text.
 */
public class MostraInterval{
    public static void main (String [] args) {
    
    System.out.println("text?");
    String text = Entrada.readLine();
    
    System.out.println("inici?");
    int inici = Integer.parseInt(Entrada.readLine());
    
    System.out.println("final?");
    int ultim = Integer.parseInt(Entrada.readLine());
    
    //normalització de números
        if (inici <0){
            inici = 0;
        }
        else if (inici > text.length()){
            inici = text.length()-1;
        }
        else if (ultim > text.length()){
            ultim = text.length()-1;
        }
        else if (ultim < 0){
            ultim = 0;
        }
    
    //Impressió de resultat segons el valors
    if(inici<ultim){
        
            for (int i=0; i<text.length(); i++){
                char c = text.charAt(i);    
                if (i>=inici && i<=ultim){
                    
                    System.out.println(c);
                }
            }
    }
    else if(inici>ultim){
        
            for (int i=text.length()-1; i>=0; i--){
                char c = text.charAt(i);
                if (i>=ultim && i<=inici){
                    
                    System.out.println(c);
                } 
            }
    }
    else{
                char c = text.charAt(inici);    
                    
                    System.out.println(c);
            
    }   
    }
}

