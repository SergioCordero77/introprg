/*
 * Programa on s'ha d'endevinar el número pensat. El número pensat el passarem per la línia de comandes ( args[0] ). 
 Després el programa demanarà un número per comparar-lo amb el que em donat al principi i veure si s'endivina o no. 
 Possibles respostes després de fer la comparació:
 - Si el valor que hem donat és més gran que el valor pensat: "És més gran que n"
 - Si el valor que hem donat és més petit que el valor pensat: "És més petit que n"
 - Si el valor que hem donat és 0 o menor: "Com a mínim 1"
 - Si el valor que hem donat és més gran que 100: "Com a màxim 100"
 - Si el valor que hem donat és igual al valor pensat: "Has encertat!"
 El programa podrá ser canel·lat quan l'usuari passi una cadena buida. la resposta que rebrem será:
 - "Cancel·lat!"
 */
public class EndevinaNombre {
    public static void main (String [] args){
    
    int numeroEndevinar = Integer.parseInt (args[0]);
    
    System.out.println ("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
    System.out.println ("Introdueix un valor");
    String textNumero = Entrada.readLine();
    
    boolean endevinat = false;
    
        while (!textNumero.isEmpty()) {        
           
            int numero = Integer.parseInt(textNumero);
            
            if (numero > 100) {
                System.out.println ("Com a màxim 100");
            }
            else if (numero <= 0) {
                System.out.println ("Com a mínim 1");   
            }
            else if (numero > numeroEndevinar) {
                System.out.println ("És més petit que " + numero);
            }
            else if (numero == numeroEndevinar){
                endevinat = true;
                break;
            }
            else {
                System.out.println ("És més gran que " + numero);
            }  
                
            if (!endevinat){    
                System.out.println ("Introdueix un valor");
                textNumero = Entrada.readLine();      
            }
        }
                if (endevinat) {
                    System.out.println ("Has encertat!");
                }
                else {
                    System.out.println ("Cancel·lat!");
                }
    }
}
