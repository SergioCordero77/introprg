/*
 * Programa que llegeix un text i repeteix el text si comença o acaba per vocal independenment de si és majúscula o minúscula.
 */
public class LloroVocalIniciFi{
    public static void main (String [] args){
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    int contador = 0;
    
    mostraText(text, contador);
    
    }
    
    public static void mostraText(String text, int contador){
    
    while (true){
    
        char inici = text.charAt(0);
        char fi = text.charAt(text.length()-1);
            
            if (UtilString.esVocal(inici) || UtilString.esVocal(fi)){
            
            contador ++;
            
            System.out.println(contador + ": " + "\"" + text + "\"");
        }
        
            if(text.isBlank()){
                System.out.println("Sortir?");
                String resposta = Entrada.readLine();
                    if (UtilitatsConfirmacio.respostaABoolean(resposta)){
                        break;
                    }
            }
        
        System.out.println("Text?");
        text = Entrada.readLine();
    }
    
        System.out.println("Adéu");
    
    }
}
