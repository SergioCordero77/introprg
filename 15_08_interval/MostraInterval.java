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
    int fi = Integer.parseInt(Entrada.readLine());
    
    mostraInterval(text, inici, fi);
    
    }
    
    public static void mostraInterval(String text, int inici, int fi){
    
    //normalització de números
        if (inici <0){
            inici = 0;
        }
        else if (inici > text.length()){
            inici = text.length()-1;
        }
        else if (fi > text.length()){
            fi = text.length()-1;
        }
        else if (fi < 0){
            fi = 0;
        }
    
    //Impressió de resultat segons el valors
    if(inici<fi){
        
            for (int i=0; i<text.length(); i++){
                char c = text.charAt(i);    
                if (i>=inici && i<=fi){
                    
                    System.out.println(c);
                }
            }
    }
    else if(inici>fi){
        
            for (int i=text.length()-1; i>=0; i--){
                char c = text.charAt(i);
                if (i>=fi && i<=inici){
                    
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
